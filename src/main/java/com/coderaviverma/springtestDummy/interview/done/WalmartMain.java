package com.coderaviverma.springtestDummy.interview.done;

public class WalmartMain {


    public static class LL {

        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.size = 0;
        }

        public void insertFirst(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size += 1;
        }

        public void insertLast(int val) {

            if (tail == null) {
                insertFirst(val);
                return;
            }

            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;

        }

        public int deleteAtIndex(int index) {

            //index ==0 deleteAtFirst

            //index == size deleteLast


            Node temp = getIndex(index - 1);
            int val = temp.next.val;
            temp.next = temp.next.next;

            return val;
        }

        public Node getIndex(int i) {
            Node temp = head;
            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }
            return temp;
        }

        public void insertUsingRec(int index, int val) {

            head = insertUsingRec(index, val, head);
        }

        public Node insertUsingRec(int index, int val, Node node) {
            if (index == 0) {
                Node node1 = new Node(val, node);
                size++;
                return node1;
            }

            node.next = insertUsingRec(--index, val, node.next);
            return node;
        }

        public void displayNode() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + "-> ");
                temp = temp.next;
            }
        }

    }

    static class Node {
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

    public static void main(String[] args) {
//        LinkedList l1 -> 1,2,3,4,5,6,7
//        LinkedList l2 -> 4,5,6,7,8
//        LinkedList l1 -> 9,9,9,9,9,9
//        LinkedList l2 -> 9,9,9,9
        //        LinkedList l1 -> 1,2,3,4,5,6,7

        //val
        //remining 1
        //1234567
        //456
        //


        LL l1 = new LL();
        l1.insertFirst(7);
        l1.insertFirst(6);
        l1.insertFirst(5);
        l1.insertFirst(4);
        l1.insertFirst(3);
        l1.insertFirst(2);
        l1.insertFirst(1);


        LL l2 = new LL();
        l2.insertFirst(8);
        l2.insertFirst(7);
        l2.insertFirst(6);
        l2.insertFirst(5);
        l2.insertFirst(4);

        System.out.println(sol(l1.head, l2.head));
    }

    private static long sol(Node l1, Node l2) {

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (l1 != null && l2 != null) {
            int val1 = l1.val;
            l1 = l1.next;
            int val2 = l2.val;
            l2 = l2.next;

            int sum = val1 + val2 + carry;
            carry = sum / 10; //1
            if (carry > 0) {
                int rem = sum % 10;//8
                sb.append(rem);
            } else {
                sb.append(sum);
            }
        }

        while (l1 != null) {
            int val1 = l1.val;
            l1 = l1.next;
            int sum = val1 + carry;
            carry = sum / 10; //1
            if (carry > 0) {
                int rem = sum % 10;//8
                sb.append(rem);
                //new Node
                //res.next
            } else {
                sb.append(sum);
//                res.next=l1;
            }
        }

        while (l2 != null) {
            int val2 = l2.val;
            l2 = l2.next;
            int sum = val2 + carry;
            carry = sum / 10; //1
            if (carry > 0) {
                int rem = sum % 10;//8
                sb.append(rem);
            } else {
                sb.append(sum);
            }
        }

        //7,7,4,1,9,7,5
        //5,7,9,1,4,7,7

        return Long.valueOf(sb.reverse().toString());
    }
}
