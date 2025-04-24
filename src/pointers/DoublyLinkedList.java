package pointers;

public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){

        Node p = find(after);

        if(p==null){
            System.out.println("Value does not exist");
        }

        Node node = new Node(val);
        node.next = p.next;
        if(p.next.prev!=null){
            p.next.prev = node;
        }
        p.next = node;
        node.prev = p;


    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
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
