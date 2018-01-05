/**
 * Copyright 2012-2018 Thales Services SAS.
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
package org.ow2.authzforce.xacml.test;

import java.io.File;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.Attribute;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.AttributeValueType;

import org.xml.sax.SAXException;

/**
 * XACML Attribute marshalling test
 *
 */
public class Test
{

	/**
	 * @param args
	 * @throws SAXException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws SAXException, JAXBException
	{
		// unmarshall
		final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		InputStream xmlXsdIn = Test.class.getResourceAsStream("/xml.xsd");
		Source src1 = new StreamSource(xmlXsdIn);
		File schemaFile2 = new File("src/main/resources/xacml-core-v3-schema-wd-17.xsd");
		Source src2 = new StreamSource(schemaFile2);
		Source[] srcs = { src1, src2 };
		Schema schema = schemaFactory.newSchema(srcs);

		JAXBContext jaxbCtx = JAXBContext.newInstance(AttributeValueType.class);
		final Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
		unmarshaller.setSchema(schema);
		File xmlFile = new File("src/test/resources/myAttributeValue.xml");
		final JAXBElement<Attribute> elt = unmarshaller.unmarshal(new StreamSource(xmlFile), Attribute.class);
		System.out.println(elt.getValue());

		// marshall
		// final Marshaller marshaller = jaxbCtx.createMarshaller();
		// marshaller.setSchema(schema);
		// marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,
		// "urn:oasis:names:tc:xacml:3.0:core:schema:wd-17 http://docs.oasis-open.org/xacml/3.0/xacml-core-v3-schema-wd-17.xsd");
		// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// marshaller.marshal(elt, System.out);
	}

}
