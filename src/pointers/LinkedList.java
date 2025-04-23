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

    public void insertAt(int data, int index){

        if(index == 0){
            insertFirst(data);
        } else if (index == size) {
            insertLast(data);
        }else{
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(data, temp.next);
            temp.next = node;
        }

    }

    public void insertLast(int data){

        //This is checked that beforehand if the method insertLast is called and passing the value
        //it should store in the head node, since tail node is empty right when the list is initialized
        //Added a condition to check if tail node is null, if it is then call the insertFirst() to store that passed value
        if(tail == null){
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        int value = head.data;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){

        if(size<=1){
            return deleteFirst();
        }

        Node temp = head; //stores the head node to a temp node to iterate
        for (int i = 0; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp; //tail node is set to second last index of list
        temp = temp.next; //to track the removed value
        tail.next = null; //last element is set to null.
        size--; //reduces the size of the list by 1
        int value = temp.data;
        return value; //returns the removed value
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
