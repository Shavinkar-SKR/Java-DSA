package pointers;

public class LinkedList {

    private int data;
    private LinkedList next;
    private LinkedList previous;

    public LinkedList(this){
        this.next = this;
    }
}
