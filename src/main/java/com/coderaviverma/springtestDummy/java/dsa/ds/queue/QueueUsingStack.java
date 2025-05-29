package com.coderaviverma.springtestDummy.java.dsa.ds.queue;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void insert(int data){
        first.add(data);
    }

    public  int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int remove=second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return remove;
    }

}
