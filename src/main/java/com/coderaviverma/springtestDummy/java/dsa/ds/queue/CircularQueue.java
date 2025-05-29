package com.coderaviverma.springtestDummy.java.dsa.ds.queue;

public class CircularQueue {

    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int start=0;
    protected  int end=0;
    private int size=0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int val){
        if (isFull()){
            return false;
        }

        data[end++]=val;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove(){
        if (isEmpty()){
            throw  new RuntimeException("Queue is empty!");
        }

        int removed=data[start++];
        start=start%data.length;
        size--;

        return removed;
    }


}
