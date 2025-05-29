package com.coderaviverma.springtestDummy.java.streamapi;

import java.util.List;

public class User {

    private String name;
    private int phoneNumber;
    private List<Address> addresses;

    public User(String name, int phoneNumber, List<Address> addresses) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
