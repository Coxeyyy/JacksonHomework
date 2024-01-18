package com.coxey.app.client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "clientInfo")
public class ClientInfo {
    private ClientFindInfo clientFindInfo;

    public ClientInfo(ClientFindInfo clientFindInfo) {
        this.clientFindInfo = clientFindInfo;
    }

    public ClientInfo() {
    }

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }
}
