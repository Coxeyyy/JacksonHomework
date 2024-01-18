package com.coxey.app.client;

public class Dul {
    private int documentType;
    private String firstName;
    private String lastName;
    private String secondName;
    private int number;
    private int series;

    public Dul(int documentType, String firstName, String lastName, String secondName, int number, int series) {
        this.documentType = documentType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.number = number;
        this.series = series;
    }

    public Dul() {
    }

    public int getDocumentType() {
        return documentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getNumber() {
        return number;
    }

    public int getSeries() {
        return series;
    }
}
