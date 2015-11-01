/**
 * Copyright (C) 2012-2015 Thales Services SAS.
 *
 * This file is part of AuthZForce CE.
 *
 * AuthZForce CE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AuthZForce CE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AuthZForce CE.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ow2.authzforce.xacml.identifiers;

/**
 * XACML Standard Datatypes
 *
 */
public enum XACMLDatatypeId
{
	// Mandatory
	/**
	 * 
	 */
	STRING("http://www.w3.org/2001/XMLSchema#string"),
	/**
	 * 
	 */
	BOOLEAN("http://www.w3.org/2001/XMLSchema#boolean"),
	/**
	 * 
	 */
	INTEGER("http://www.w3.org/2001/XMLSchema#integer"),
	/**
			 * 
			 */
	DOUBLE("http://www.w3.org/2001/XMLSchema#double"),
	/**
			 * 
			 */
	TIME("http://www.w3.org/2001/XMLSchema#time"),
	/**
			 * 
			 */
	DATE("http://www.w3.org/2001/XMLSchema#date"),
	/**
			 * 
			 */
	DATETIME("http://www.w3.org/2001/XMLSchema#dateTime"),
	/**
			 * 
			 */
	DAYTIME_DURATION("http://www.w3.org/2001/XMLSchema#dayTimeDuration"),
	/**
			 * 
			 */
	YEARMONTH_DURATION("http://www.w3.org/2001/XMLSchema#yearMonthDuration"),
	/**
			 * 
			 */
	ANY_URI("http://www.w3.org/2001/XMLSchema#anyURI"),
	/**
			 * 
			 */
	HEX_BINARY("http://www.w3.org/2001/XMLSchema#hexBinary"),
	/**
			 * 
			 */
	BASE64_BINARY("http://www.w3.org/2001/XMLSchema#base64Binary"),
	/**
			 * 
			 */
	RFC822_NAME("urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name"),
	/**
			 * 
			 */
	X500_NAME("urn:oasis:names:tc:xacml:1.0:data-type:x500Name"),
	/**
			 * 
			 */
	IP_ADDRESS("urn:oasis:names:tc:xacml:2.0:data-type:ipAddress"),
	/**
			 * 
			 */
	DNS_NAME("urn:oasis:names:tc:xacml:2.0:data-type:dnsName"),
	// Optional
	/**
	 * 
	 */
	XPATH_EXPRESSION("urn:oasis:names:tc:xacml:3.0:data-type:xpathExpression");

	/**
	 * Prefix of URI of XML schema built-in datatypes (used in XACML), up to the '#' included:
	 * {@value #XML_SCHEMA_URI_PREFIX}
	 */
	public static final String XML_SCHEMA_URI_PREFIX = "http://www.w3.org/2001/XMLSchema#";

	/**
	 * Length of {@link #XML_SCHEMA_URI_PREFIX}, used for extracting suffix from datatypes in order
	 * to create XACML function names, logging types of data, etc.
	 */
	public static final int XML_SCHEMA_URI_PREFIX_LENGTH = XACMLDatatypeId.XML_SCHEMA_URI_PREFIX.length();

	private final String value;

	/**
	 * Get datatype URI
	 * 
	 * @return datatype URI
	 */
	public String value()
	{
		return value;
	}

	private XACMLDatatypeId(String v)
	{
		value = v;
	}

	/**
	 * Get datatype enum constant from datatype URI
	 * @param v
	 * @return Datatype enum
	 */
	public static XACMLDatatypeId fromValue(String v)
	{
		for (XACMLDatatypeId c : XACMLDatatypeId.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
