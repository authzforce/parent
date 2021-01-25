/**
 * Copyright 2012-2021 THALES.
 *
 * This file is part of AuthzForce CE.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ow2.authzforce.xacml.identifiers;

/**
 * XACML Standard Datatypes
 *
 */
public enum XacmlDatatypeId
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
	 * Prefix of URI of XML schema built-in datatypes (used in XACML), up to the '#' included: {@value #XML_SCHEMA_URI_PREFIX}
	 */
	public static final String XML_SCHEMA_URI_PREFIX = "http://www.w3.org/2001/XMLSchema#";

	/**
	 * Length of {@link #XML_SCHEMA_URI_PREFIX}, used for extracting suffix from datatypes in order to create XACML function names, logging types of data, etc.
	 */
	public static final int XML_SCHEMA_URI_PREFIX_LENGTH = XacmlDatatypeId.XML_SCHEMA_URI_PREFIX.length();

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

	private XacmlDatatypeId(final String v)
	{
		value = v;
	}

	/**
	 * Get datatype enum constant from datatype URI
	 * 
	 * @param datatypeURI
	 *            datatype idenfifier (URI)
	 * @return Datatype enum
	 */
	public static XacmlDatatypeId fromValue(final String datatypeURI)
	{
		for (final XacmlDatatypeId c : XacmlDatatypeId.values())
		{
			if (c.value.equals(datatypeURI))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(datatypeURI);
	}

}
