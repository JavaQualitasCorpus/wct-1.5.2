/**
 * nz.govt.natlib.ndha.wctdpsdepositor - Software License
 *
 * Copyright 2007/2009 National Library of New Zealand.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * or the file "LICENSE.txt" included with the software.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */


/*
 * This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-325 
 * See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
 * Any modifications to this file will be lost upon recompilation of the source schema. 
 * Generated on: 2008.03.05 at 11:58:22 AM NZDT 
 */

package nz.govt.natlib.ndha.wctdpsdepositor.dpsdeposit.dspresult;

import org.webcurator.core.archive.dps.DpsDepositFacade.DepositResult;

import com.exlibris.digitool.deposit.service.xmlbeans.DepositResultDocument;

public class DepositResultAdapterImpl implements DepositResult {


    protected boolean isError;

    protected String messageCode;

    protected String messageDesc;

    protected long sipId;

    protected long depositActivityId;

    protected String userParams;

    protected String creationDate;

    public DepositResultAdapterImpl() {

    }

    public DepositResultAdapterImpl(DepositResultDocument.DepositResult xmlDocumet) {
        this.creationDate = xmlDocumet.getCreationDate();
        this.depositActivityId = xmlDocumet.getDepositActivityId();
        this.isError = xmlDocumet.getIsError();
        this.messageCode = xmlDocumet.getMessageCode();
        this.messageDesc = xmlDocumet.getMessageDesc();
        this.sipId = xmlDocumet.getSipId();
        this.userParams = xmlDocumet.getUserParams();
    }


    public boolean isIsError() {
        return isError;
    }


    public void setIsError(boolean value) {
        this.isError = value;
    }

    public boolean isError() {
        return isError;
    }


    public String getMessageCode() {
        return messageCode;
    }

    public String getMessageDesciption() {
        return messageDesc;
    }


    public void setMessageCode(String value) {
        this.messageCode = value;
    }


    public String getMessageDesc() {
        return messageDesc;
    }


    public void setMessageDesc(String value) {
        this.messageDesc = value;
    }


    public long getSipId() {
        return sipId;
    }


    public void setSipId(long value) {
        this.sipId = value;
    }


    public long getDepositActivityId() {
        return depositActivityId;
    }

    public String getUserParameters() {
        return userParams;
    }


    public void setDepositActivityId(long value) {
        this.depositActivityId = value;
    }


    public String getUserParams() {
        return userParams;
    }


    public void setUserParams(String value) {
        this.userParams = value;
    }


    public String getCreationDate() {
        return creationDate;
    }


    public void setCreationDate(String value) {
        this.creationDate = value;
    }

}
