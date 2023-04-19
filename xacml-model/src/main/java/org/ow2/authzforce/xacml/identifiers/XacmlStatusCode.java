/*
 * Copyright 2012-2023 THALES.
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
public enum XacmlStatusCode
{

	/**
	 * Standard identifier for the OK status
	 */
	OK("urn:oasis:names:tc:xacml:1.0:status:ok"),

	/**
	 * Standard identifier for the Missing Attribute status
	 */
	MISSING_ATTRIBUTE("urn:oasis:names:tc:xacml:1.0:status:missing-attribute"),

	/**
	 * Standard identifier for the Syntax Error status
	 */
	SYNTAX_ERROR("urn:oasis:names:tc:xacml:1.0:status:syntax-error"),

	/**
	 * Standard identifier for the Processing Error status
	 */
	PROCESSING_ERROR("urn:oasis:names:tc:xacml:1.0:status:processing-error");

	private final String value;

	/**
	 * Get standard identifier (string), e.g. ""urn:oasis:names:tc:xacml:1.0:status:ok"" for {@link #OK}
	 * 
	 * @return identifier
	 */
	public String value()
	{
		return value;
	}

	private XacmlStatusCode(final String v)
	{
		value = v;
	}

	/**
	 * Get constant from identifier
	 * 
	 * @param id
	 *            identifier
	 * @return status code enum
	 */
	public static XacmlStatusCode fromValue(final String id)
	{
		for (final XacmlStatusCode c : XacmlStatusCode.values())
		{
			if (c.value.equals(id))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(id);
	}
}
