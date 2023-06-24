package com.company.model;

public class Address {
    private String Ulica;
    private String Miejscowosc;
    private String Kraj;

    public Address(String Ulica, String Miejscowosc, String Kraj) {
        this.Ulica = Ulica;
        this.Miejscowosc = Miejscowosc;
        this.Kraj = Kraj;
    }



    public String getFullAddress() {
        return Ulica + ", " + Miejscowosc + ", " + Kraj;
    }
}
