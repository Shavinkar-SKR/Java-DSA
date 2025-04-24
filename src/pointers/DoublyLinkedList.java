package pointers;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value+ " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println(" END");

        System.out.println("Printing in Reverse");
        while(last != null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println(" END");
    }

    private class Node{

        private int value;
        private Node next;
        private Node prev;

        public Node (int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.next = next;
            this.value = value;
            this.prev = prev;
        }
    }
}
