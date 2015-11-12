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
