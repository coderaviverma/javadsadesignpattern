package com.coderaviverma.springtestDummy.java.oops.singltn;

public class DoubleCheckLocking {

    private static DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking() {

    }

    public static DoubleCheckLocking getInstance() {

        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class) {
                if (doubleCheckLocking == null) {
                    return doubleCheckLocking;
                }
            }

        }

        return doubleCheckLocking;
    }


}
