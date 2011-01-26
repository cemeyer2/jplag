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

import com.sun.xml.rpc.soap.message.SOAPFaultInfo;

public final class JPlagTyp_startSubmissionUpload_Fault_SOAPBuilder implements com.sun.xml.rpc.encoding.SOAPInstanceBuilder {
    private SOAPFaultInfo instance = null;
    private java.lang.Object detail;
    // this is the index of the fault deserialized
    private int index = -1;
    private static final int JPLAGTUTORIAL_JPLAGCLIENT_JPLAGEXCEPTION_INDEX = 0;

    public int memberGateType(int memberIndex) {
        return GATES_INITIALIZATION + REQUIRES_COMPLETION;
    }

    public void construct() {
    }

    public void setMember(int index, java.lang.Object memberValue) {
        this.index = index;
        detail = memberValue;
    }

    public void initialize() {
        switch (index) {
            case JPLAGTUTORIAL_JPLAGCLIENT_JPLAGEXCEPTION_INDEX:
                instance.setDetail(detail);
                break;
        }
    }

    public void setInstance(java.lang.Object instance) {
        this.instance = (SOAPFaultInfo) instance;
    }

    public java.lang.Object getInstance() {
        return instance;
    }
}
