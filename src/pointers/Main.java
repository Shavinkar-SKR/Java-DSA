package pointers;

public class Main {

    public static void main(String[] args) {

//        SinglyLinkedList list = new SinglyLinkedList();
//
//        list.insertFirst(5);
//        list.insertFirst(2);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insertFirst(1);
//
//        list.insertLast(10);
//
//        list.insertAt(12, 3);
//
//        list.display();
//        System.out.println(list.deleteFirst()); //eliminates the first element
//        list.display();
//        System.out.println(list.deleteLast()); //eliminates the last element
//        list.display();
//
//        list.deleteAt(6);
//
//        list.display();


        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(1);

        list.display();

        list.insertLast(10);

        list.display();
    }
}
