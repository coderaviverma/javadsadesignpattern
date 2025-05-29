package com.coderaviverma.springtestDummy.java.dsa.ds.linkedlist;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.previous=null;

        if (head!=null){
            head.previous=node;
        }
        head=node;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void insertAtIndex(int index){


    }




    private class Node{
        Node next;
        Node previous;
        int val;

        public Node(Node next, Node previous, int val) {
            this.next = next;
            this.previous = previous;
            this.val = val;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
