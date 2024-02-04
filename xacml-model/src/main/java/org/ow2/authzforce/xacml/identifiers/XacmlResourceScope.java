/*
 * Copyright 2012-2024 THALES.
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
 * XACML Resource scopes, as defined in XACML v3.0 Multiple Decision Profile Version 1.0, §6.1. The actual value
 * 
 */
public enum XacmlResourceScope
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
	 * Resource scope of Descendants (the given resource and all descendants at any depth or distance)
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

	private XacmlResourceScope(final String v)
	{
		value = v;
	}

	/**
	 * Get resource scope constant from value
	 * 
	 * @param scopeId
	 *            resource scope identifier
	 * @return Resource scope enum
	 */
	public static XacmlResourceScope fromValue(final String scopeId)
	{
		for (final XacmlResourceScope c : XacmlResourceScope.values())
		{
			if (c.value.equals(scopeId))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(scopeId);
	}
}
