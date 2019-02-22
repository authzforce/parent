/**
 * Copyright 2012-2019 THALES.
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
 * XACML standard attribute identifiers
 *
 */
public enum XacmlAttributeId
{

	/*
	 * Subject
	 */
	/**
	 * XACML 3.0, §10.2.6
	 */
	XACML_1_0_SUBJECT_DNS_NAME("urn:oasis:names:tc:xacml:1.0:subject:authn-locality:dns-name"),

	/**
	 * 
	 */
	XACML_1_0_SUBJECT_IP_ADDRESS("urn:oasis:names:tc:xacml:1.0:subject:authn-locality:ip-address"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_AUTHENTICATION_METHOD("urn:oasis:names:tc:xacml:1.0:subject:authentication-method"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_AUTHENTICATION_TIME("urn:oasis:names:tc:xacml:1.0:subject:authentication-time"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_KEY_INFO("urn:oasis:names:tc:xacml:1.0:subject:key-info"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_REQUEST_TIME("urn:oasis:names:tc:xacml:1.0:subject:request-time"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_SESSION_START_TIME("urn:oasis:names:tc:xacml:1.0:subject:session-start-time"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_ID("urn:oasis:names:tc:xacml:1.0:subject:subject-id"),
	/**
	 * 
	 */
	XACML_1_0_SUBJECT_ID_QUALIFIER("urn:oasis:names:tc:xacml:1.0:subject:subject-id-qualifier"),

	/**
	 * XACML 3.0 RBAC Profile, §6.2
	 */
	XACML_2_0_SUBJECT_ROLE("urn:oasis:names:tc:xacml:2.0:subject:role"),

	/*
	 * Resource
	 */
	/**
	 * XACML 3.0, §10.2.6
	 */
	XACML_1_0_RESOURCE_ID("urn:oasis:names:tc:xacml:1.0:resource:resource-id"),
	/**
	 * 
	 */
	XACML_1_0_RESOURCE_LOCATION("urn:oasis:names:tc:xacml:1.0:resource:resource-location"),
	/**
	 * The standard URI for the resource's scope in XACML v3.0 (resp. v2.0) multiple decision (resp. resource) profile.
	 * 
	 * @see XACMLResourceScope possible scopes
	 */
	XACML_2_0_RESOURCE_SCOPE("urn:oasis:names:tc:xacml:2.0:resource:scope"),
	/**
	 * 
	 */
	XACML_1_0_RESOURCE_SIMPLE_FILE_NAME("urn:oasis:names:tc:xacml:1.0:resource:simple-file-name"),

	/**
	 * XACML v3.0 Multiple Decision Profile Version 1.0
	 */
	XACML_3_0_PROFILE_MULTIPLE_CONTENT_SELECTOR("urn:oasis:names:tc:xacml:3.0:profile:multiple:content-selector"),

	/*
	 * Action
	 * 
	 * XACML 3.0, §10.2.6
	 */
	/**
	 * urn:oasis:names:tc:xacml:1.0:action:action-id
	 */
	XACML_1_0_ACTION_ID("urn:oasis:names:tc:xacml:1.0:action:action-id"),

	/**
	 * 
	 */
	XACML_1_0_ACTION_IMPLIED_ACTION("urn:oasis:names:tc:xacml:1.0:action:implied-action"),

	/*
	 * Environment
	 */
	/**
	 * XACML 3.0, §10.2.5
	 */
	XACML_1_0_ENVIRONMENT_CURRENT_TIME("urn:oasis:names:tc:xacml:1.0:environment:current-time"),

	/**
	 * 
	 */
	XACML_1_0_ENVIRONMENT_CURRENT_DATE("urn:oasis:names:tc:xacml:1.0:environment:current-date"),

	/**
	 * 
	 */
	XACML_1_0_ENVIRONMENT_CURRENT_DATETIME("urn:oasis:names:tc:xacml:1.0:environment:current-dateTime");

	private final String value;

	XacmlAttributeId(final String v)
	{
		value = v;
	}

	/**
	 * Get attribute ID (URI)
	 * 
	 * @return attribute ID
	 */
	public String value()
	{
		return value;
	}

	/**
	 * Get enum constant for a given standard attribute ID
	 * 
	 * @param identifier
	 *            attribute identifier
	 * @return enum constant for this attribute ID
	 */
	public static XacmlAttributeId fromValue(final String identifier)
	{
		for (final XacmlAttributeId c : XacmlAttributeId.values())
		{
			if (c.value.equals(identifier))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(identifier);
	}
}