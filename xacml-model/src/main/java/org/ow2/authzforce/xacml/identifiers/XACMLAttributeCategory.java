/**
 * Copyright (C) 2012-2017 Thales Services SAS.
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
 * XACML Version. The actual version IDs are returned by {@link XACMLAttributeCategory#ordinal()} and match the XACML version integers defined in SunXACML PolicyMetadata class.
 * 
 */
public enum XACMLAttributeCategory
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
	 * 
	 * urn:oasis:names:tc:xacml:3.0:attribute-category:resource
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

	XACMLAttributeCategory(String v) {
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
	public static XACMLAttributeCategory fromValue(String v) {
		for (XACMLAttributeCategory c : XACMLAttributeCategory.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		
		throw new IllegalArgumentException(v);
	}
}
