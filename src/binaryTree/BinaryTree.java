package binaryTree;

import java.nio.file.NotDirectoryException;
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree(){

    }

    private static class Node{

        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public void populate(Scanner scanner){
        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+ node.value + ": ");
        boolean left= scanner.nextBoolean();
        if(left){
            System.out.print("Enter the left value of "+node.value+": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print("Do you want to enter right of "+ node.value + ": ");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right value of " + node.value+ ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + '\t');
        display(node.right, indent + '\t');
    }

    public boolean check(){
        Scanner scanner = new Scanner(System.in);
        boolean value;
        String answer = scanner.nextLine();
        if(answer.equals("yes")){
            value = true;
        }else {
            value = false;
        }
        return value;
    }
}
