/**
 * Copyright (C) 2012-2016 Thales Services SAS.
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
 * XACML Resource scopes, as defined in XACML v2.0 Multiple Resource Profile, §5. The actual value
 * 
 */
public enum XACMLResourceScope
{

	/**
	 * Resource scope of Immediate (only the given resource)
	 */
	IMMEDIATE("Immediate"),

	/**
	 * Resource scope of Children (the given resource and its direct children)
	 */
	CHILDREN("Children"),

	/**
	 * Resource scope of Descendants (the given resource and all descendants at any depth or
	 * distance)
	 */
	DESCENDANTS("Descendants");

	private final String value;

	/**
	 * Get standard name (string), e.g. "Immediate" for {@link #IMMEDIATE}
	 * 
	 * @return scope name
	 */
	public String value()
	{
		return value;
	}

	private XACMLResourceScope(String v)
	{
		value = v;
	}

	/**
	 * Get resource scope constant from value
	 * 
	 * @param v
	 * @return Resource scope enum
	 */
	public static XACMLResourceScope fromValue(String v)
	{
		for (XACMLResourceScope c : XACMLResourceScope.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
