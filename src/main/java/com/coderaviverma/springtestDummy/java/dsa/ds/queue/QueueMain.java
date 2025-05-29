package com.coderaviverma.springtestDummy.java.dsa.ds.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueMain {

    public static void main(String[] args) {


        PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());

        queue.add(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.remove(3);

        System.out.println(queue.poll());

    }
}
