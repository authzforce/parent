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
 * XACML node names, as defined in XACML Core Specification (declared in the same order). There may be fewer names than defined in the XACML schema. There are added progressively as needed.
 * 
 */
public enum XACMLNodeName
{

	/**
	 * Special name to represent any node
	 */
	ANY("Any"),

	/**
	 * 
	 */
	POLICYSET("PolicySet"),

	/**
	 * 
	 */
	TARGET("Target"),

	/**
	 * 
	 */
	ANY_OF("AnyOf"),

	/**
	 * 
	 */
	ALL_OF("AllOf"),

	/**
	 * 
	 */
	MATCH("Match"),

	/**
	 * 
	 */
	POLICYSET_ID_REFERENCE("PolicySetIdReference"),

	/**
	 * 
	 */
	POLICY_ID_REFERENCE("PolicyIdReference"),

	/**
	 * 
	 */
	POLICY("Policy"),

	/**
	 * 
	 */
	COMBINER_PARAMETERS("CombinerParameters"),

	/**
	 * 
	 */
	COMBINER_PARAMETER("CombinerParameter"),

	/**
	 * 
	 */
	RULE("Rule"),

	/**
	 * 
	 */
	VARIABLE_DEFINITION("VariableDefinition"),

	/**
	 * 
	 */
	VARIABLE_REFERENCE("VariableReference"),

	/**
	 * 
	 */
	CONDITION("Condition"),

	/**
	 * 
	 */
	APPLY("Apply"),

	/**
	 * 
	 */
	FUNCTION("Function"),

	/**
	 * 
	 */
	ATTRIBUTE_DESIGNATOR("AttributeDesignator"),

	/**
	 * 
	 */
	ATTRIBUTE_SELECTOR("AttributeSelector"),

	/**
	 * 
	 */
	ATTRIBUTE_VALUE("AttributeValue"),

	/**
	 * 
	 */
	OBLIGATION("Obligation"),

	/**
	 * 
	 */
	ADVICE("Advice"),

	/**
	 * 
	 */
	ATTRIBUTE_ASSIGNMENT("AttributeAssignment"),

	/**
	 * 
	 */
	OBLIGATION_EXPRESSION("ObligationExpression"),

	/**
	 * 
	 */
	ADVICE_EXPRESSION("AdviceExpression"),

	/**
	 * 
	 */
	ATTRIBUTE_ASSIGNMENT_EXPRESSION("AttributeAssignmentExpression"),

	/**
	 * 
	 */
	ATTRIBUTES_ELEMENT("Attributes"),

	/**
	 * 
	 */
	ATTRIBUTES_CONTENT("Content"),

	/**
	 * 
	 */
	ATTRIBUTE_ELEMENT("Attribute"),

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
	RESOURCE_CONTENT("ResourceContent");

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

	private XACMLNodeName(final String v)
	{
		value = v;
	}

	/**
	 * Get enum constant from value
	 * 
	 * @param nodeName
	 *            XACML node name
	 * @return enum constant
	 */
	public static XACMLNodeName fromValue(final String nodeName)
	{
		for (final XACMLNodeName c : XACMLNodeName.values())
		{
			if (c.value.equals(nodeName))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(nodeName);
	}
}
