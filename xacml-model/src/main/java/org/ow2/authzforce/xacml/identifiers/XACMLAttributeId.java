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
package org.ow2.authzforce.xacml.identifiers;

/**
 * XACML standard attribute identifiers
 *
 */
public enum XACMLAttributeId {

	/*
	 * Subject
	 */
	/**
	 * 
	 */
	XACML_SUBJECT_DNS_NAME("urn:oasis:names:tc:xacml:1.0:subject:authn-locality:dns-name"), 

	/**
	 * 
	 */
	XACML_SUBJECT_IP_ADDRESS("urn:oasis:names:tc:xacml:1.0:subject:authn-locality:ip-address"), 
	/**
	 * 
	 */
	XACML_SUBJECT_AUTHENTICATION_METHOD("urn:oasis:names:tc:xacml:1.0:subject:authentication-method"), 
	/**
	 * 
	 */
	XACML_SUBJECT_AUTHENTICATION_TIME("urn:oasis:names:tc:xacml:1.0:subject:authentication-time"), 
	/**
	 * 
	 */
	XACML_SUBJECT_KEY_INFO("urn:oasis:names:tc:xacml:1.0:subject:key-info"), 
	/**
	 * 
	 */
	XACML_SUBJECT_REQUEST_TIME("urn:oasis:names:tc:xacml:1.0:subject:request-time"), 
	/**
	 * 
	 */
	XACML_SUBJECT_SESSION_START_TIME("urn:oasis:names:tc:xacml:1.0:subject:session-start-time"), 
	/**
	 * 
	 */
	XACML_SUBJECT_SUBJECT_ID("urn:oasis:names:tc:xacml:1.0:subject:subject-id"), 
	/**
	 * 
	 */
	XACML_SUBJECT_SUBJECT_ID_QUALIFIER("urn:oasis:names:tc:xacml:1.0:subject:subject-id-qualifier"), 
	/**
	 * 
	 */
	XACML_SUBJECT_SUBJECT_ID_ROLE("urn:oasis:names:tc:xacml:1.0:subject:subject-id-role"),

	/*
	 * Resource
	 */
	/**
	 * 
	 */
	XACML_RESOURCE_RESOURCE_ID("urn:oasis:names:tc:xacml:1.0:resource:resource-id"), 
	/**
	 * 
	 */
	XACML_RESOURCE_RESOURCE_LOCATION("urn:oasis:names:tc:xacml:1.0:resource:resource-location"),
	/**
     * The standard URI for the resource's scope in XACML v3.0 (resp. v2.0) multiple decision (resp. resource) profile.
     * @see XACMLResourceScope possible scopes
     */
    XACML_RESOURCE_SCOPE("urn:oasis:names:tc:xacml:2.0:resource:scope"),
	/**
	 * 
	 */
	XACML_RESOURCE_SIMPLE_FILE_NAME("urn:oasis:names:tc:xacml:1.0:resource:simple-file-name"),

	/*
	 * Action
	 */
	/**
	 * urn:oasis:names:tc:xacml:1.0:action:action-id
	 */
	XACML_ACTION_ACTION_ID("urn:oasis:names:tc:xacml:1.0:action:action-id"), 
	
	/**
	 * 
	 */
	XACML_ACTION_IMPLIED_ACTION("urn:oasis:names:tc:xacml:1.0:action:implied-action"),
			
	/*
	 * Environment
	 */
	/**
	 * 
	 */
	XACML_1_0_ENVIRONMENT_CURRENT_TIME("urn:oasis:names:tc:xacml:1.0:environment:current-time"),
	
	/**
	 * 
	 */
	XACML_1_0_ENVIRONMENT_CURRENT_DATE("urn:oasis:names:tc:xacml:1.0:environment:current-date"),
	
	/**
	 * 
	 */
	XACML_1_0_ENVIRONMENT_CURRENT_DATETIME("urn:oasis:names:tc:xacml:1.0:environment:current-dateTime"),

    /**
     * XACML v3.0 Multiple Decision Profile Version 1.0
     */
    MULTIPLE_CONTENT_SELECTOR("urn:oasis:names:tc:xacml:3.0:profile:multiple:content-selector"),

    /**
     * XACML v3.0 Hierarchical Resource Profile Version 1.0, XACML v3.0 Multiple Decision Profile Version 1.0
     */
    CONTENT_SELECTOR("urn:oasis:names:tc:xacml:3.0:content-selector");

	private final String value;

	XACMLAttributeId(String v) {
		value = v;
	}

	/**
	 * Get attribute ID (URI)
	 * @return attribute ID
	 */
	public String value() {
		return value;
	}

	/**
	 * Get enum constant for a given standard attribute ID
	 * @param v
	 * @return enum constant for this attribute ID
	 */
	public static XACMLAttributeId fromValue(String v) {
		for (XACMLAttributeId c : XACMLAttributeId.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}