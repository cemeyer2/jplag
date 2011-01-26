/*
 * University of Illinois/NCSA
 * Open Source License
 *
 * Copyright (c) 2011 University of Illinois at Urbana-Champaign.
 * All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal with the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 *  Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimers.
 *
 *  Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimers in the documentation and/or other materials provided
 * with the distribution.
 *
 *  Neither the names of the CoMoTo Project team, the University of
 * Illinois at Urbana-Champaign, nor the names of its contributors
 * may be used to endorse or promote products derived from this
 * Software without specific prior written permission.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 * ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE SOFTWARE.
 */

// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package edu.illinois.cs.comoto.jplag.wsdl;


import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.soap.message.SOAPFaultInfo;
import com.sun.xml.rpc.streaming.XMLReader;
import com.sun.xml.rpc.streaming.XMLReaderUtil;
import com.sun.xml.rpc.streaming.XMLWriter;

import javax.xml.namespace.QName;

public class JPlagTyp_requestAccount_Fault_SOAPSerializer extends SOAPFaultInfoSerializer {
    private static final javax.xml.namespace.QName ns1_JPlagException_QNAME = new QName("http://www.ipd.uni-karlsruhe.de/jplag/types", "JPlagException");
    private static final javax.xml.namespace.QName ns1_JPlagException_TYPE_QNAME = new QName("http://www.ipd.uni-karlsruhe.de/jplag/types", "JPlagException");
    private CombinedSerializer ns1_myJPlagException_LiteralSerializer;
    private CombinedSerializer ns1_myJPlagException_LiteralSerializer_Serializer;
    private static final int JPLAGTUTORIAL_JPLAGCLIENT_JPLAGEXCEPTION_INDEX = 0;

    public JPlagTyp_requestAccount_Fault_SOAPSerializer(boolean encodeType, boolean isNullable) {
        super(encodeType, isNullable);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        super.initialize(registry);
        ns1_myJPlagException_LiteralSerializer = (CombinedSerializer) registry.getSerializer("", edu.illinois.cs.comoto.jplag.wsdl.JPlagException.class, ns1_JPlagException_TYPE_QNAME);
        ns1_myJPlagException_LiteralSerializer_Serializer = ns1_myJPlagException_LiteralSerializer.getInnermostSerializer();
    }

    protected java.lang.Object deserializeDetail(SOAPDeserializationState state, XMLReader reader,
                                                 SOAPDeserializationContext context, SOAPFaultInfo instance) throws java.lang.Exception {
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        javax.xml.namespace.QName elementType = null;
        SOAPInstanceBuilder builder = null;
        java.lang.Object detail = null;
        java.lang.Object obj = null;

        reader.nextElementContent();
        if (reader.getState() == XMLReader.END)
            return deserializeDetail(reader, context);
        XMLReaderUtil.verifyReaderState(reader, XMLReader.START);
        elementName = reader.getName();
        elementType = getType(reader);
        if (elementName.equals(ns1_JPlagException_QNAME)) {
            if (elementType == null ||
                    (elementType.equals(ns1_myJPlagException_LiteralSerializer.getXmlType()) ||
                            (ns1_myJPlagException_LiteralSerializer instanceof ArraySerializerBase &&
                                    elementType.equals(SOAPConstants.QNAME_ENCODING_ARRAY)))) {
                obj = ns1_myJPlagException_LiteralSerializer.deserialize(ns1_JPlagException_QNAME, reader, context);
                detail = obj;
                reader.nextElementContent();
                skipRemainingDetailEntries(reader);
                XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
                return (isComplete ? (Object) detail : (Object) state);
            }
        }
        return deserializeDetail(reader, context);
    }

    protected void serializeDetail(java.lang.Object detail, XMLWriter writer, SOAPSerializationContext context)
            throws java.lang.Exception {
        if (detail == null) {
            throw new SerializationException("soap.unexpectedNull");
        }
        writer.startElement(DETAIL_QNAME);

        boolean pushedEncodingStyle = false;
        if (encodingStyle != null) {
            context.pushEncodingStyle(encodingStyle, writer);
        }
        if (detail instanceof edu.illinois.cs.comoto.jplag.wsdl.JPlagException) {
            ns1_myJPlagException_LiteralSerializer_Serializer.serialize(detail, ns1_JPlagException_QNAME, null, writer, context);
        }
        writer.endElement();
        if (pushedEncodingStyle) {
            context.popEncodingStyle();
        }
    }
}
