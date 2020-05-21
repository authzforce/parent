/**
 * Copyright 2012-2020 THALES.
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
/**
 * 
 */
package org.ow2.authzforce.xacml.identifiers;


/**
 * XACML Version. The actual version IDs are returned by {@link XacmlVersion#ordinal()} and match
 * the XACML version integers defined in SunXACML PolicyMetadata class.
 * 
 */
public enum XacmlVersion
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

	XacmlVersion(String ns)
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
	public static XacmlVersion fromValue(String v)
	{
		for (XacmlVersion c : XacmlVersion.values())
		{
			if (c.namespace.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);

	}
}
