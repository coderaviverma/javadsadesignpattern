package com.coderaviverma.springtestDummy.java.dsa.ds.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){

        if (tail==null){
            insertFirst(val);
            return;
        }

        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }

    public int deleteAtIndex(int index){

        //index ==0 deleteAtFirst

        //index == size deleteLast



        Node temp = getIndex(index -1);
        int val=temp.next.val;
        temp.next=temp.next.next;

        return val;
    }

    public Node getIndex(int i){
        Node temp=head;
        for (int j = 0; j < i; j++) {
            temp=temp.next;
        }
        return temp;
    }

    public void insertUsingRec(int index, int val){

         head=insertUsingRec(index,val,head);
    }

    public Node insertUsingRec(int index, int val,Node node){
        if (index==0){
            Node node1=new Node(val,node);
            size++;
            return node1;
        }

        node.next =insertUsingRec(--index,val,node.next);
        return node;
    }

    public void displayNode(){
        Node temp=head;
        while (temp!=null){
            System.out.print( temp.val+ "-> ");
            temp=temp.next;
        }
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
