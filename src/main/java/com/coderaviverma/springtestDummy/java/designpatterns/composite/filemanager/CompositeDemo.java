package com.coderaviverma.springtestDummy.java.designpatterns.composite.filemanager;

public class CompositeDemo {
    public static void main(String[] args) {

        File f1=new File("Resume.docx");
        File f2=new File("Resume2.docx");


        Folder folder1=new Folder("Documents");
        folder1.add(f1);
        folder1.add(f2);

        Folder folder2=new Folder("Home");
        folder2.add(folder1);
        folder2.showStructure();


    }
}
