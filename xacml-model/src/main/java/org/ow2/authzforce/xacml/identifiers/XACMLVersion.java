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
/**
 * 
 */
package org.ow2.authzforce.xacml.identifiers;


/**
 * XACML Version. The actual version IDs are returned by {@link XACMLVersion#ordinal()} and match
 * the XACML version integers defined in SunXACML PolicyMetadata class.
 * 
 */
public enum XACMLVersion
{
	/**
	 * XACML 1.0
	 */
	V1_0("urn:oasis:names:tc:xacml:1.0:policy"),

	/**
	 * XACML 1.1 (which isn't a formal release so has no namespace string, but still exists as a
	 * separate specification)
	 */
	// V1_1("urn:oasis:names:tc:xacml:1.0:policy"),

	/**
	 * 2.0
	 */
	V2_0("urn:oasis:names:tc:xacml:2.0:policy:schema:os"),

	/**
	 * 3.0
	 */
	V3_0("urn:oasis:names:tc:xacml:3.0:core:schema:wd-17");

	private final String namespace;

	XACMLVersion(String ns)
	{
		namespace = ns;
	}

	/**
	 * @return schema namespace for this version
	 */
	public String getNamespace()
	{
		return namespace;
	}

	/**
	 * @param v
	 *            schema namespace of this XACML version.
	 * @return XACML Version enum
	 */
	public static XACMLVersion fromValue(String v)
	{
		for (XACMLVersion c : XACMLVersion.values())
		{
			if (c.namespace.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);

	}
}
