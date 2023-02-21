package com.binearySearchTree;

import java.util.*;
class Node1{
    int value;
    Node1 left,right;
    Node1(int value)
    {
        this.value=value;
        left=null;
        right=null;
    }
}
class SearchElement {
    Node1 root;
    SearchElement()
    {
        root=null;
    }
    public Node1 searchNode(Node1 root,int value)
    {
        if(root==null)
            return null;
        if(root.value==value)
            return root;
        else if(value <root.value)
            return searchNode(root.left,value);
        else
            return searchNode(root.right,value);
    }
    public static void main(String[] args)
    {
        SearchElement tree=new SearchElement();

        tree.root.left = new Node1(30);
        tree.root.right = new Node1(70);
        tree.root.left.left = new Node1(22);
        tree.root.right.right= new Node1(95);
        tree.root.right.left= new Node1(60);
        tree.root.left.left.left= new Node1(11);
        tree.root.right.left.right= new Node1(65);
        tree.root.left.left.left.left= new Node1(3);
        tree.root.right.left.right.right= new Node1(67);
        tree.root.left.left.left.right= new Node1(16);
        tree.root.right.left.right.left= new Node1(63);
        Node1 node=tree.searchNode(tree.root,63);
        if(node!=null)
            System.out.println("Element "+node.value+" is found in binary  tree");
        else
            System.out.println("Element is not found in binary tree");
    }
}