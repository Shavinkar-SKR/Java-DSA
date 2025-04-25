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

}
