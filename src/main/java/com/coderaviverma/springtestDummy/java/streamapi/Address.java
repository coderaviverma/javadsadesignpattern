package com.coderaviverma.springtestDummy.java.streamapi;


public class Address {

    private String address;
    private int pincode;

    public Address(String address, int pincode) {
        this.address = address;
        this.pincode = pincode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
