package com.coderaviverma.springtestDummy.java.LLD.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class LRU<K, V> {

    private class Node {
        private K key;
        private V val;
        private Node next, prev;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    private  final int capacity;
    private  final Map<K, Node> cache;
    private  final Node head = new Node(null, null);
    private final Node tail = new Node(null, null);
    private  final  ReentrantLock lock = new ReentrantLock();

    public LRU(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head.next=tail;
        tail.prev=head;
    }

    public V get(int key) {
        lock.lock();
        try {
            Node node = cache.get(key);
            if (node == null) return null;
            moveToHead(node);
            return node.val;
        } finally {
            lock.unlock();
        }
    }

    public void put(K k, V v) {

        lock.lock();
        try {
            Node node = cache.get(k);
            if (node != null) {
                node.val = v;
                cache.put(k, node);
                moveToHead(node);
            } else {

                if (cache.size() == capacity) {
                    Node lru = tail.prev;
                    remove(lru);
                    cache.remove(lru.key);
                } else {
                    Node node1 = new Node(k, v);
                    cache.put(k, node1);
                    add(node1);
                }
            }

        } finally {
            lock.unlock();
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(Node node) {
        remove(node);
        add(node);
    }

    private void add(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;

    }

}
