package com.company.model;

public class Address {
    private String Ulica;
    private String MiejsceZamieszkania;
    private String Kraj;

    public Address(String Ulica, String MiejsceZamieszkania, String Kraj) {
        this.Ulica = Ulica;
        this.MiejsceZamieszkania = MiejsceZamieszkania;
        this.Kraj = Kraj;
    }



    public String getFullAddress() {
        return Ulica + ", " + MiejsceZamieszkania + ", " + Kraj;
    }
}
