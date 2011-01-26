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
import com.sun.xml.rpc.encoding.literal.LiteralObjectSerializerBase;
import com.sun.xml.rpc.streaming.XMLReader;
import com.sun.xml.rpc.streaming.XMLReaderUtil;
import com.sun.xml.rpc.streaming.XMLWriter;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;

import javax.xml.namespace.QName;

public class StartSubmissionUploadParams_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_submissionParams_QNAME = new QName("", "submissionParams");
    private static final javax.xml.namespace.QName ns3_Option_TYPE_QNAME = new QName("http://www.ipd.uni-karlsruhe.de/jplag/types", "Option");
    private CombinedSerializer ns3_myOption_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_filesize_QNAME = new QName("", "filesize");
    private static final javax.xml.namespace.QName ns2_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns2_myns2__int__int_Int_Serializer;
    private static final javax.xml.namespace.QName ns1_data_QNAME = new QName("", "data");
    private static final javax.xml.namespace.QName ns2_base64Binary_TYPE_QNAME = SchemaConstants.QNAME_TYPE_BASE64_BINARY;
    private CombinedSerializer ns2_myns2_base64Binary__byte_Base64Binary_Serializer;

    public StartSubmissionUploadParams_LiteralSerializer(javax.xml.namespace.QName type, java.lang.String encodingStyle) {
        this(type, encodingStyle, false);
    }

    public StartSubmissionUploadParams_LiteralSerializer(javax.xml.namespace.QName type, java.lang.String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }

    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myOption_LiteralSerializer = (CombinedSerializer) registry.getSerializer("", edu.illinois.cs.comoto.jplag.wsdl.Option.class, ns3_Option_TYPE_QNAME);
        ns2_myns2__int__int_Int_Serializer = (CombinedSerializer) registry.getSerializer("", int.class, ns2_int_TYPE_QNAME);
        ns2_myns2_base64Binary__byte_Base64Binary_Serializer = (CombinedSerializer) registry.getSerializer("", byte[].class, ns2_base64Binary_TYPE_QNAME);
    }

    public java.lang.Object doDeserialize(XMLReader reader,
                                          SOAPDeserializationContext context) throws java.lang.Exception {
        edu.illinois.cs.comoto.jplag.wsdl.StartSubmissionUploadParams instance = new edu.illinois.cs.comoto.jplag.wsdl.StartSubmissionUploadParams();
        java.lang.Object member = null;
        javax.xml.namespace.QName elementName;
        java.util.List values;
        java.lang.Object value;

        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_submissionParams_QNAME)) {
                member = ns3_myOption_LiteralSerializer.deserialize(ns1_submissionParams_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSubmissionParams((edu.illinois.cs.comoto.jplag.wsdl.Option) member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[]{ns1_submissionParams_QNAME, reader.getName()});
            }
        } else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_filesize_QNAME)) {
                member = ns2_myns2__int__int_Int_Serializer.deserialize(ns1_filesize_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setFilesize(((java.lang.Integer) member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[]{ns1_filesize_QNAME, reader.getName()});
            }
        } else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_data_QNAME)) {
                member = ns2_myns2_base64Binary__byte_Base64Binary_Serializer.deserialize(ns1_data_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setData((byte[]) member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[]{ns1_data_QNAME, reader.getName()});
            }
        } else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }

        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (java.lang.Object) instance;
    }

    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        edu.illinois.cs.comoto.jplag.wsdl.StartSubmissionUploadParams instance = (edu.illinois.cs.comoto.jplag.wsdl.StartSubmissionUploadParams) obj;

    }

    public void doSerialize(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        edu.illinois.cs.comoto.jplag.wsdl.StartSubmissionUploadParams instance = (edu.illinois.cs.comoto.jplag.wsdl.StartSubmissionUploadParams) obj;

        if (instance.getSubmissionParams() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myOption_LiteralSerializer.serialize(instance.getSubmissionParams(), ns1_submissionParams_QNAME, null, writer, context);
        if (new java.lang.Integer(instance.getFilesize()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2__int__int_Int_Serializer.serialize(new java.lang.Integer(instance.getFilesize()), ns1_filesize_QNAME, null, writer, context);
        if (instance.getData() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myns2_base64Binary__byte_Base64Binary_Serializer.serialize(instance.getData(), ns1_data_QNAME, null, writer, context);
    }
}
