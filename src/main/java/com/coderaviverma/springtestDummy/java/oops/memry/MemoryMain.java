package com.coderaviverma.springtestDummy.java.oops.memry;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class MemoryMain {


    public static void main(String[] args) {

        String strong=new String("Strong");

        //GC free when its shortage of space
        WeakReference<String> weakReference=new WeakReference<>("avi");

        //GC free when its very urgent
        SoftReference<String> softReference=new SoftReference<>("soft");
    }
}
