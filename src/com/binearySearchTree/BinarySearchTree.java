package com.binearySearchTree;

class BinarySearch{
    public class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public void BinarySearchTree() {
        this.root = null;
    }
    public void insert(int newData) {
        this.root = insert(root, newData);
    }
    public Node insert(Node root, int newData) {
        if (root == null) {
            root = new Node(newData);
            return root;
        }
        else if (root.data >= newData) {
            root.left = insert(root.left, newData);
        } else {
            root.right = insert(root.right, newData);
        }
        return root;
    }
    public void preorder() {
        preorder(root);
    }
    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }public static void main(String[] args) {
        BinarySearch binarysearch = new BinarySearch();
        binarysearch.insert(56);
        binarysearch.insert(30);
        binarysearch.insert(70);

        binarysearch.preorder();
    }
}

