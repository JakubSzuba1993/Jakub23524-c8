package com.company.controller;
import com.company.model.User;
import com.company.model.Address;

public class UserController {
    public static void main(String[] args) {
        Address address = new Address("Rzeszowska 100", "Lublin", "Polska");
        User user = new User("Jasiu Kowalski", 40, address);
        user.displayInfo();
    }
}
