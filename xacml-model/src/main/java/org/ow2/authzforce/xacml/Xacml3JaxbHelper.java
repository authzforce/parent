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
package org.ow2.authzforce.xacml;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;

import org.xml.sax.SAXException;

/**
 * XACML (XML) document - as defined by XACML 3.0 core specification's XML schema - processing utilities based on JAXB API
 * 
 */
public final class Xacml3JaxbHelper
{
	private final static String[] CLASSPATH_RELATIVE_XACML_3_0_SCHEMA_LOCATIONS = { "xml.xsd", "xacml-core-v3-schema-wd-17.xsd" };

	/**
	 * Name of Java package of XACML-3.0-schema-derived classes
	 */
	private static final String XACML_3_0_JAXB_PACKAGE_NAME = "oasis.names.tc.xacml._3_0.core.schema.wd_17";

	/**
	 * XACML 3.0 schema
	 */
	public static final Schema XACML_3_0_SCHEMA;
	static
	{
		final SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		final Source[] schemaSources = new Source[2];
		final ClassLoader classLoader = Xacml3JaxbHelper.class.getClassLoader();
		for (int i = 0; i < CLASSPATH_RELATIVE_XACML_3_0_SCHEMA_LOCATIONS.length; i++)
		{
			final URL schemaURL = classLoader.getResource(CLASSPATH_RELATIVE_XACML_3_0_SCHEMA_LOCATIONS[i]);
			if (schemaURL == null)
			{
				throw new RuntimeException("Invalid XML schema location on classpath (not found): " + CLASSPATH_RELATIVE_XACML_3_0_SCHEMA_LOCATIONS[i]);
			}

			schemaSources[i] = new StreamSource(schemaURL.toExternalForm());
		}

		try
		{
			XACML_3_0_SCHEMA = factory.newSchema(schemaSources);
		}
		catch (final SAXException e)
		{
			throw new RuntimeException("Failed to load XML schemas on classpath: " + Arrays.toString(CLASSPATH_RELATIVE_XACML_3_0_SCHEMA_LOCATIONS), e);
		}
	}

	/**
	 * JAXB context for (un)marshalling from/to JAXB objects derived from XACML 3.0 schema
	 */
	public static final JAXBContext XACML_3_0_JAXB_CONTEXT;
	static
	{
		try
		{
			XACML_3_0_JAXB_CONTEXT = JAXBContext.newInstance(XACML_3_0_JAXB_PACKAGE_NAME, Xacml3JaxbHelper.class.getClassLoader());
		}
		catch (final JAXBException e)
		{
			throw new RuntimeException("Error instantiating JAXB context for (un)marshalling from/to XACML 3.0 objects", e);
		}
	}

	/**
	 * XACML 3.0 JAXB ObjectFactory
	 */
	public static final ObjectFactory XACML_3_0_OBJECT_FACTORY = new ObjectFactory();

	/**
	 * Creates XACML 3.0/JAXB unmarshaller with XACML 3.0 schema validation
	 * 
	 * @return unmarshaller
	 * @throws JAXBException
	 *             if an error was encountered while creating the Unmarshaller object
	 */
	public static Unmarshaller createXacml3Unmarshaller() throws JAXBException
	{
		final Unmarshaller unmarshaller = XACML_3_0_JAXB_CONTEXT.createUnmarshaller();
		unmarshaller.setSchema(XACML_3_0_SCHEMA);
		return unmarshaller;
	}

	/**
	 * Creates XACML 3.0/JAXB marshaller with XACML 3.0 schema validation
	 * 
	 * @return marshaller
	 * @throws JAXBException
	 *             if an error was encountered while creating the Marshaller object
	 */
	public static Marshaller createXacml3Marshaller() throws JAXBException
	{
		final Marshaller marshaller = XACML_3_0_JAXB_CONTEXT.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.name());
		marshaller.setSchema(XACML_3_0_SCHEMA);
		return marshaller;
	}
}
