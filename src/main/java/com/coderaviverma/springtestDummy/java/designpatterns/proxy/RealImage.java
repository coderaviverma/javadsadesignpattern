package com.coderaviverma.springtestDummy.java.designpatterns.proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Load from disk filename - "+fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying Filename "+fileName);
    }
}
