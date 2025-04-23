package pointers;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertFirst(int data){

        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    private class Node{

        private Node next;
        private int data;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }
}
