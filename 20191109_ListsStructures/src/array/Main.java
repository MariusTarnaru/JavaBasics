package array;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(); //un obiect myArrayList din clasa MyArrayList si
        // declar o instanta a clasei cu numele MyArrayList()

        myArrayList.add(3);
        myArrayList.add(11);
        myArrayList.add(1);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(3);
        myArrayList.add(9);
        myArrayList.add(5);
        //   myArrayList.resizeUp();

        myArrayList.add(15);
        myArrayList.add(42);

        myArrayList.show();
        myArrayList.showProperties();
        System.out.println(myArrayList.getAt(2));
        myArrayList.show();
        myArrayList.removeAt(1);
        myArrayList.show();
        myArrayList.resizeUp();
        myArrayList.showProperties();
//      myArrayList.resizeDown();
//      myArrayList.showProperties();
        myArrayList.setAt(2,31);
        myArrayList.removeAt(3);
        myArrayList.show();
        myArrayList.setAt(3,56);
        myArrayList.show();

    }
}
