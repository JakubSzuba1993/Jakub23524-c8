package com.company.model;

public class User {
    private String ImieNazwisko;
    private int Wiek;
    private Address adres;

    public User(String ImieNazwisko, int Wiek, Address adres) {
        this.ImieNazwisko = ImieNazwisko;
        this.Wiek = Wiek;
        this.adres = adres;
    }



    public void displayInfo() {
        System.out.println("Imie i nazwisko: " + ImieNazwisko);
        System.out.println("Wiek: " + Wiek);
        System.out.println("Adres: " + adres.getFullAddress());
    }
}
