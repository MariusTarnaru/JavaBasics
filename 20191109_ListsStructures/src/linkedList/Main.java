package linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(35);
        myLinkedList.add(7);
        myLinkedList.add(22);
        myLinkedList.add(76);
        myLinkedList.show();

        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.add(4);
        myLinkedList1.add(1);
        myLinkedList1.add(3);
        myLinkedList1.add(7);
        myLinkedList1.show();

        myLinkedList.add(33);
        myLinkedList.show();

        System.out.println(myLinkedList.getAt(3));
        System.out.println(myLinkedList.getAt(6));

        myLinkedList.removeAt(3);
        myLinkedList.show();
        myLinkedList.showReverse(myLinkedList.start);

    }

}
