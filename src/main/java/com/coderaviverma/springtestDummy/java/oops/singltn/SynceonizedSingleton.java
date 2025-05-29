package com.coderaviverma.springtestDummy.java.oops.singltn;

public class SynceonizedSingleton {

    public static SynceonizedSingleton synceonizedSingleton;

    private SynceonizedSingleton(){

    }

    public static synchronized SynceonizedSingleton getInstance(){
        if (synceonizedSingleton==null){
            return synceonizedSingleton =new SynceonizedSingleton();
        }
        return synceonizedSingleton;

    }

}
