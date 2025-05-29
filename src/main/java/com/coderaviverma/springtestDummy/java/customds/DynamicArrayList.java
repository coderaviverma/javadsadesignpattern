package com.coderaviverma.springtestDummy.java.customds;

public class DynamicArrayList<T> {

    private Object[] data;
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;

    public  DynamicArrayList(){
        data=new Object[DEFAULT_CAPACITY];
    }

    public  void  add(T t){
        data[size++]=t;

    }



}
