/*
 * Copyright 2012-2023 THALES.
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

import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.Attribute;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.AttributeValueType;
import org.junit.Assert;
import org.junit.Test;
import org.ow2.authzforce.xacml.Xacml3JaxbHelper;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

/**
 * XACML Attribute marshalling test
 */
public class MainTest {

    @Test
    public void test() throws JAXBException
    {
			/*
			 Unmarshal using Xacml3JaxbHelper
			 */
        final Unmarshaller unmarshaller = Xacml3JaxbHelper.createXacml3Unmarshaller();
        File origXmlFile = new File("src/test/resources/myXacmlAttribute.xml");
        final Attribute origUnmarshalledXacmlAtt = (Attribute) unmarshaller.unmarshal(new StreamSource(origXmlFile));
        Assert.assertEquals("Unexpected unmarshalled AttributeId", "some:sample:attribute:id", origUnmarshalledXacmlAtt.getAttributeId());

        final List<AttributeValueType> origUnmarshalledXacmlAttVals = origUnmarshalledXacmlAtt.getAttributeValues();
        Assert.assertEquals("Unexpected unmarshalled number of AttributeValues", 1, origUnmarshalledXacmlAttVals.size());

        AttributeValueType origUnmarshalledXacmlAttVal = origUnmarshalledXacmlAttVals.get(0);
        Assert.assertEquals("Unexpected unmarshalled AttributeValue DataType", "http://tempuri.org", origUnmarshalledXacmlAttVal.getDataType());
        Assert.assertEquals("Unexpected unmarshalled AttributeValue content (not a single text value)", 1, origUnmarshalledXacmlAttVal.getContent().size());
        Assert.assertEquals("Unexpected unmarshalled AttributeValue content (text)", "8uBPbvAeBs5SfxR2", origUnmarshalledXacmlAttVal.getContent().get(0));


        /*
         * Marshall back to XACML and try to unmarshall and compare to original to make sure marshalling is OK
         */
        final Marshaller marshaller = Xacml3JaxbHelper.createXacml3Marshaller();
        // For debugging
        // marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        final StringWriter strWriter = new StringWriter();
        marshaller.marshal(origUnmarshalledXacmlAtt, strWriter);
        final String outStr = strWriter.toString();
        final Unmarshaller unmarshaller2 = Xacml3JaxbHelper.createXacml3Unmarshaller();
        final Attribute unmarshalledXacmlAtt2 = (Attribute) unmarshaller2.unmarshal(new StringReader(outStr));
        Assert.assertEquals("Unexpected unmarshalled Attribute (!= original one)", origUnmarshalledXacmlAtt, unmarshalledXacmlAtt2);
    }

    /**
     * Main method
     * @param args arguments
     * @throws JAXBException error creating JAXB unmarshaller or unmarshalling XML
     */
    public static void main(String[] args) throws JAXBException {
        new MainTest().test();
    }

}
