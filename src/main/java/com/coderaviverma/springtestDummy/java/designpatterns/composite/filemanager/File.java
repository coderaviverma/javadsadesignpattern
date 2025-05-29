package com.coderaviverma.springtestDummy.java.designpatterns.composite.filemanager;

//Leaf Node
public class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showStructure() {
        System.out.println(" file name " + name);
    }
}
