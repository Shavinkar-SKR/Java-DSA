package pointers;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
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
