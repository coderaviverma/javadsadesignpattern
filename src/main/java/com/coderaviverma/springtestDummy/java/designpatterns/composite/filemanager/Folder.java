package com.coderaviverma.springtestDummy.java.designpatterns.composite.filemanager;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    private String name;
    private List<FileSystem> fileSystemList=new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem system){
        fileSystemList.add(system);
    }

    public void remove(FileSystem system){
        fileSystemList.remove(system);
    }

    @Override
    public void showStructure() {
        System.out.println("Folder name "+name);
        for (FileSystem child:fileSystemList){
            child.showStructure();
        }
    }
}
