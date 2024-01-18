package com.coxey.app;

import com.coxey.app.converter.Converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.convertXmlToJson();
    }
}