package com.coderaviverma.springtestDummy.java.LLD.customarraylist;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class CustomArrayList<T> {
    private Object[] data;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private final ReentrantLock lock = new ReentrantLock();

    CustomArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public T get(int index) {
        lock.lock();
        try {
            checkIndex(index);
            return (T) data[index];
        } finally {
            lock.unlock();
        }

    }

    public void add(T add) {
        lock.lock();
        try {
            ensureCapacity();
            data[size++] = add;
        } finally {
            lock.unlock();
        }
    }

    public T set(int index, T element) {
        lock.lock();
        try {
            checkIndex(index);
            T oldData = (T) data[index];
            data[index] = element;
            return oldData;
        } finally {
            lock.unlock();
        }

    }

    public T remove(int index) {
        lock.lock();
        try {
            checkIndex(index);
            T removed = (T) data[index];
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            data[--size] = null;
            return removed;
        } finally {
            lock.unlock();
        }
    }

    public void clear() {
        lock.lock();
        try {
            for (int i = 0; i < size; i++) {
                data[i] = null;
            }
            size = 0;
        } finally {
            lock.unlock();
        }
    }


    private void ensureCapacity() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            Object[] newData = new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index " + index + ", Size " + size);
    }

}
