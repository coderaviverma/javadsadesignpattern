package com.coderaviverma.springtestDummy.java.dsa.ds.linkedlist;

public class CircularLL {

    Node head;
    Node tail;
    int size;

    public void insert(int val) {

        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            size++;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    void display(){
        Node node=head;
        if (head!=null){
            do {
                System.out.print(node.val +" -> ");
                node=node.next;
            }while (node!=head);
        }

    }

    public int lengthCycle(Node node) {
        Node slow = node;
        Node fast = node.next;

        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //calculate length
                Node temp=slow;
                int length=0;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }

        return 0;
    }


    public Node reverseList(Node head){
        if (head==null){
            return head;
        }

        Node prev=null;
        Node current=head;
        Node next=current.next;

        while (current!=null){
            current.next=prev;
            prev=current;


        }

        return head;
    }


    private class Node {
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
