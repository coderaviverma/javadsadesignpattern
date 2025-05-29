package com.coderaviverma.springtestDummy.java.threads.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueue<T> {

    private final int size;
    private final Queue<T> queue = new LinkedList<>();

    public CustomBlockingQueue(int size) {
        this.size = size;
    }


    public synchronized T dequeue(T data) throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }
        T item = queue.poll();
        notifyAll();
        return item;
    }


    public synchronized boolean enqueue(T data) throws InterruptedException {
        if (queue.size() == size) {
            wait();
        }
        boolean add = queue.add(data);
        notifyAll();
        return add;
    }

    public synchronized int getSize(){
        return size;
    }

    //peek
    //pop


}
