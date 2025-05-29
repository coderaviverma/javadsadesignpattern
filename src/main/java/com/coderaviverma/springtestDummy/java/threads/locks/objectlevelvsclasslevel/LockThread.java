package com.coderaviverma.springtestDummy.java.threads.locks.objectlevelvsclasslevel;

public class LockThread extends Thread {

    UtilsLock utilsLock;

    public LockThread(UtilsLock utilsLock) {
        this.utilsLock = utilsLock;
    }

    @Override
    public void run() {
//
//        utilsLock.printNumber();
//
        utilsLock.objectLevelLockMethod();
//        utilsLock.classLevelLockMethod();


        //Block Lock
//        utilsLock.currentobjectLevelLockBlock();

        utilsLock.classLevelLockBlock();

//        utilsLock.normalMethod();

    }
}
