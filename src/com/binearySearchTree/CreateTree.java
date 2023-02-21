package com.binearySearchTree;
class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    class CreateTree {
        Node root;
        public void traverseTree(Node node) {
            if (node != null) {
                traverseTree(node.left);
                System.out.print(" " + node.key);
                traverseTree(node.right);
            }
        }
        public static void main(String[] args)
        {
            CreateTree tree = new CreateTree();

            tree.root = new Node(56);
            tree.root.left = new Node(30);
            tree.root.right = new Node(70);
            tree.root.left.left = new Node(22);
            tree.root.right.right=new Node(95);
            tree.root.left.right=new Node(40);
            tree.root.right.left=new Node(60);
            tree.root.left.left.left=new Node(11);
            tree.root.right.left.right=new Node(65);
            tree.root.left.left.left.left=new Node(3);
            tree.root.right.left.right.right=new Node(67);
            tree.root.left.left.left.right=new Node(16);
            tree.root.right.left.right.left=new Node(63);
            System.out.print("\nBinary Tree: ");
            tree.traverseTree(tree.root);
        }
    }

