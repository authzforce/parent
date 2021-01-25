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
 * XPATH Version.
 * 
 */
public enum XPathVersion
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

	XPathVersion(String uri, String versionNumber)
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
	public static XPathVersion fromURI(String uri) throws IllegalArgumentException
	{
		for (XPathVersion c : XPathVersion.values())
		{
			if (c.uri.equals(uri))
			{
				return c;
			}
		}

		throw new IllegalArgumentException("Unknown XPATH version for such URI: " + uri);

	}

}
