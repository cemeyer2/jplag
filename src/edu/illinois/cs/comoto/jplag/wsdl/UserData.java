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


public class UserData {
    protected java.lang.String username;
    protected java.lang.String password;
    protected java.util.Calendar created;
    protected java.lang.String createdBy;
    protected java.util.Calendar expires;
    protected java.util.Calendar lastUsage;
    protected int numOfSubs;
    protected java.lang.String realName;
    protected java.lang.String email;
    protected java.lang.String emailSecond;
    protected java.lang.String homepage;
    protected java.lang.String reason;
    protected java.lang.String notes;
    protected int state;

    public UserData() {
    }

    public UserData(java.lang.String username, java.lang.String password, java.util.Calendar created, java.lang.String createdBy, java.util.Calendar expires, java.util.Calendar lastUsage, int numOfSubs, java.lang.String realName, java.lang.String email, java.lang.String emailSecond, java.lang.String homepage, java.lang.String reason, java.lang.String notes, int state) {
        this.username = username;
        this.password = password;
        this.created = created;
        this.createdBy = createdBy;
        this.expires = expires;
        this.lastUsage = lastUsage;
        this.numOfSubs = numOfSubs;
        this.realName = realName;
        this.email = email;
        this.emailSecond = emailSecond;
        this.homepage = homepage;
        this.reason = reason;
        this.notes = notes;
        this.state = state;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public java.util.Calendar getCreated() {
        return created;
    }

    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }

    public java.lang.String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }

    public java.util.Calendar getExpires() {
        return expires;
    }

    public void setExpires(java.util.Calendar expires) {
        this.expires = expires;
    }

    public java.util.Calendar getLastUsage() {
        return lastUsage;
    }

    public void setLastUsage(java.util.Calendar lastUsage) {
        this.lastUsage = lastUsage;
    }

    public int getNumOfSubs() {
        return numOfSubs;
    }

    public void setNumOfSubs(int numOfSubs) {
        this.numOfSubs = numOfSubs;
    }

    public java.lang.String getRealName() {
        return realName;
    }

    public void setRealName(java.lang.String realName) {
        this.realName = realName;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getEmailSecond() {
        return emailSecond;
    }

    public void setEmailSecond(java.lang.String emailSecond) {
        this.emailSecond = emailSecond;
    }

    public java.lang.String getHomepage() {
        return homepage;
    }

    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }

    public java.lang.String getReason() {
        return reason;
    }

    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }

    public java.lang.String getNotes() {
        return notes;
    }

    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
