package pointers;

public class LinkedList {

    private int data;
    private LinkedList next;
    private LinkedList previous;

    public void setData(LinkedList newData){
        this.next = newData;
    }

    public int getData(){
        return this.data;
    }
}
