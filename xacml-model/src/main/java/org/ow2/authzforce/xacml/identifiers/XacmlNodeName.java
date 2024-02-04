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
 * XACML node names, as defined in XACML Core Specification (declared in the same order). There may be fewer names than defined in the XACML schema. There are added progressively as needed.
 * 
 */
public enum XacmlNodeName
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

	private XacmlNodeName(final String v)
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
	public static XacmlNodeName fromValue(final String nodeName)
	{
		for (final XacmlNodeName c : XacmlNodeName.values())
		{
			if (c.value.equals(nodeName))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(nodeName);
	}
}
