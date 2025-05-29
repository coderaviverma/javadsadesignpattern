package com.coderaviverma.springtestDummy.java.LLD.objectpool;

import java.util.LinkedList;
import java.util.function.Supplier;

public class CustomObjectPool<T> {
    private final LinkedList<T> available=new LinkedList<>();
    private final int maxPoolSize;
    private final Supplier<T> factory;

    public CustomObjectPool(int maxPoolSize, Supplier<T> factory) {
        this.maxPoolSize = maxPoolSize;
        this.factory = factory;
    }

}
