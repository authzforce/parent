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
 * Standard XACML Attribute Category identifier. The standard URI from XACML specification is returned by {@link XacmlAttributeCategory#value()}
 * 
 */
public enum XacmlAttributeCategory
{
	/**
	 * Subject Category
	 * urn:oasis:names:tc:xacml:1.0:subject-category:access-subject
	 */
	XACML_1_0_ACCESS_SUBJECT("urn:oasis:names:tc:xacml:1.0:subject-category:access-subject"),
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:codebase
	 */
	XACML_1_0_SUBJECT_CODEBASE("urn:oasis:names:tc:xacml:1.0:subject-category:codebase"), 
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject
	 */
	XACML_1_0_INTERMEDIARY_SUBJECT("urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject"), 
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject
	 */
	XACML_1_0_RECIPIENT_SUBJECT("urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject"), 
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine
	 */
	XACML_1_0_SUBJECT_REQUESTING_MACHINE("urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine"),
	
	/**
	 * Resource Category
	 * <p>
	 * urn:oasis:names:tc:xacml:3.0:attribute-category:resource
	 * </p>
	 */
	XACML_3_0_RESOURCE("urn:oasis:names:tc:xacml:3.0:attribute-category:resource"),
	
	/**
	 * Action Category
	 */
	XACML_3_0_ACTION("urn:oasis:names:tc:xacml:3.0:attribute-category:action"),
	
	/**
	 * Environment Category
	 * urn:oasis:names:tc:xacml:3.0:attribute-category:environment
	 */
	XACML_3_0_ENVIRONMENT("urn:oasis:names:tc:xacml:3.0:attribute-category:environment");

	private final String value;

	XacmlAttributeCategory(String v) {
		value = v;
	}

	/**
	 * @return XACML identifier for this category
	 */
	public String value() {
		return value;
	}

	/**
	 * @param v XACML identifier for this category
	 * @return XACMLCategory
	 */
	public static XacmlAttributeCategory fromValue(String v) {
		for (XacmlAttributeCategory c : XacmlAttributeCategory.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		
		throw new IllegalArgumentException(v);
	}
}
