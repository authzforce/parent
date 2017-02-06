/**
 * Copyright (C) 2012-2017 Thales Services SAS.
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
 * XPATH Version.
 * 
 */
public enum XPATHVersion
{
	/**
	 * 1.0
	 */
	V1_0("http://www.w3.org/TR/1999/REC-xpath-19991116", "1.0"),

	/**
	 * 2.0
	 */
	V2_0("http://www.w3.org/TR/2007/REC-xpath20-20070123", "2.0");

	private final String uri;
	private final String versionNumber;

	XPATHVersion(String uri, String versionNumber)
	{
		this.uri = uri;
		this.versionNumber = versionNumber;
	}

	/**
	 * @return schema namespace URI for this version
	 */
	public String getURI()
	{
		return uri;
	}

	/**
	 * @return version number, e.g. '1.0'
	 */
	public String getVersionNumber()
	{
		return versionNumber;
	}

	/**
	 * Get instance from version URI
	 * 
	 * @param uri
	 *            URI of this XPATH version.
	 * @return XPATH Version enum
	 * @throws IllegalArgumentException
	 *             if uri does not match any XPath version
	 */
	public static XPATHVersion fromURI(String uri) throws IllegalArgumentException
	{
		for (XPATHVersion c : XPATHVersion.values())
		{
			if (c.uri.equals(uri))
			{
				return c;
			}
		}

		throw new IllegalArgumentException("Unknown XPATH version for such URI: " + uri);

	}

}
