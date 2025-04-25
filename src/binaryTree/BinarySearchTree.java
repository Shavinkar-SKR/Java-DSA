package binaryTree;

import java.util.Scanner;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(){

    }

    private class Node{

        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        root = insert(value, this.root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        return node;
    }

    public void display(){
        display(this.root, "Root node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left Child of "+ node.value + " : ");
        display(node.right, "Right Child of "+ node.value + " : ");
    }
    
}
