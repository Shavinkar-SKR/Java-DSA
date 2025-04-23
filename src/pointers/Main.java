package pointers;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(1);

        list.insertLast(10);

        list.insertAt(12, 3);

        list.display();
    }
}
