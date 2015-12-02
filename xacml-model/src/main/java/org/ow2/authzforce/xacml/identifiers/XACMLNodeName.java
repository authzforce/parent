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
/**
 * 
 */
package org.ow2.authzforce.xacml.identifiers;

/**
 * XACML Element names, as defined in XACML Core Specification
 * 
 */
public enum XACMLNodeName
{
	/**
	 * 
	 */
	ANY("Any"),

	/**
	 * 
	 */
	ATTRIBUTES_ELEMENT("Attributes"),

	/**
     * 
     */
	MULTI_REQUESTS("MultiRequests"),

	/**
     * 
     */
	REQUEST_DEFAULTS("RequestDefaults"),

	/**
     * 
     */
	ATTRIBUTE_ELEMENT("Attribute"),

	/**
     * 
     */
	ATTRIBUTES_CATEGORY("Category"),

	/**
     * 
     */
	ATTRIBUTES_ID("id"),

	/**
     * 
     */
	RETURN_POLICY_ID_LIST("ReturnPolicyIdList"),

	/**
     * 
     */
	COMBINED_DECISION("CombinedDecision"),

	/**
     * 
     */
	ATTRIBUTES_CONTENT("Content"),

	/**
     * 
     */
	RESOURCE_CONTENT("ResourceContent"),
	/**
	 * 
	 */
	POLICY_ID_REFERENCE("PolicyIdReference"),
	/**
	 * 
	 */
	POLICYSET_ID_REFERENCE("PolicySetIdReference"),
	/**
	 * 
	 */
	COMBINER_PARAMETERS("CombinerParameters");

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

	private XACMLNodeName(String v)
	{
		value = v;
	}

	/**
	 * Get enum constant from value
	 * 
	 * @param v
	 * @return enum constant
	 */
	public static XACMLNodeName fromValue(String v)
	{
		for (XACMLNodeName c : XACMLNodeName.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
