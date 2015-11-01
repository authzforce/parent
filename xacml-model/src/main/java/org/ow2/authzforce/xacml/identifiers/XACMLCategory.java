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
 * XACML Version. The actual version IDs are returned by {@link XACMLCategory#ordinal()} and match the XACML version integers defined in SunXACML PolicyMetadata class.
 * 
 */
public enum XACMLCategory
{
	/**
	 * Subject Category
	 * urn:oasis:names:tc:xacml:1.0:subject-category:access-subject
	 */
	XACML_1_0_SUBJECT_CATEGORY_ACCESS_SUBJECT("urn:oasis:names:tc:xacml:1.0:subject-category:access-subject"),
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:codebase
	 */
	XACML_1_0_SUBJECT_CATEGORY_CODEBASE("urn:oasis:names:tc:xacml:1.0:subject-category:codebase"), 
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject
	 */
	XACML_1_0_SUBJECT_CATEGORY_INTERMEDIARY_SUBJECT("urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject"), 
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject
	 */
	XACML_1_0_SUBJECT_CATEGORY_RECIPIENT_SUBJECT("urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject"), 
	
	/**
	 * urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine
	 */
	XACML_1_0_SUBJECT_CATEGORY_REQUESTING_MACHINE("urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine"),
	
	/**
	 * Resource Category
	 * 
	 * urn:oasis:names:tc:xacml:3.0:attribute-category:resource
	 */
	XACML_3_0_RESOURCE_CATEGORY_RESOURCE("urn:oasis:names:tc:xacml:3.0:attribute-category:resource"),
	
	/**
	 * Action Category
	 */
	XACML_3_0_ACTION_CATEGORY_ACTION("urn:oasis:names:tc:xacml:3.0:attribute-category:action"),
	
	/**
	 * Environment Category
	 * urn:oasis:names:tc:xacml:3.0:attribute-category:environment
	 */
	XACML_3_0_ENVIRONMENT_CATEGORY_ENVIRONMENT("urn:oasis:names:tc:xacml:3.0:attribute-category:environment");

	private final String value;

	XACMLCategory(String v) {
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
	public static XACMLCategory fromValue(String v) {
		for (XACMLCategory c : XACMLCategory.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		
		throw new IllegalArgumentException(v);
	}
}
