package com.coderaviverma.springtestDummy.java.binarytree;

public class BST {

    private Node root;


    private int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private boolean isEmpty(Node root) {
        return root == null;
    }

    private void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            Node newNode = new Node(val);
            return newNode;
        }

        if (val < node.value) {
            node.left = insert(node.left, val);
        }

        if (val > node.value) {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    private boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    //PreOrder start
    private void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if (node==null){
            return;
        }
        System.out.println("preOrder printed "+node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    //preorder end


    //Inorder start
        // retrive element in sorted order
    private void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node==null)return;

        inOrder(node.left);
        System.out.println("inOrder "+node.value);
        inOrder(node.right);
    }
    //Inorder end

    //post Order
    //Used in delete binary tree while checking the level
    //used in bottom up approach
    private void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node==null)return;

        inOrder(node.left);
        inOrder(node.right);
        System.out.println("postOrder "+node.value);

    }


    //Node class

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
