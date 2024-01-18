package com.coxey.app.converter;

import com.coxey.app.client.ClientInfo;
import com.coxey.app.client.Dul;
import com.coxey.app.person.FindPersonInfo;
import com.coxey.app.person.IdentityCard;
import com.coxey.app.person.PersonInfo;
import com.coxey.app.person.PersonName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class Converter {
    private final String XML_PATH = "./src/main/resources/ClientInfo.xml";
    private final String JSON_PATH = "./src/main/resources/PersonInfo.json";
    private XmlMapper xmlMapper = new XmlMapper();
    private ObjectMapper objectMapper = new ObjectMapper();
    private ClientInfo clientInfo;
    private PersonInfo personInfo;

    public void convertXmlToJson() {
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        try {
            InputStream inputStream = new FileInputStream(XML_PATH);
            clientInfo = xmlMapper.readValue(inputStream, ClientInfo.class);
            personInfo = clientInfoToPersonInfo(clientInfo);
            File jsonWriter = new File(JSON_PATH);
            objectMapper.writeValue(jsonWriter, personInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private PersonInfo clientInfoToPersonInfo(ClientInfo clientInfo) {
        Dul dul = clientInfo.getClientFindInfo().getDul();
        PersonName personName = new PersonName(dul.getLastName(), dul.getFirstName(), dul.getSecondName());
        IdentityCard identityCard = new IdentityCard(dul.getDocumentType(), dul.getSeries(), dul.getNumber());
        int partyId = clientInfo.getClientFindInfo().getPartyId();
        FindPersonInfo findPersonInfo = new FindPersonInfo(personName, identityCard, partyId);
        return new PersonInfo(findPersonInfo);
    }
}
