package DataStructure.collection.list.arrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        MyList<String> myList = new MyArrayList<String>(10, new String[10]);

        System.out.println("List Size : " + myList.size());

        myList.add("11"); // List add
        arrToString(myList);
        System.out.println("======================");

        myList.insert(1, "22"); // List insert
        arrToString(myList);
        System.out.println("======================");

        myList.clear(); // List clear
        arrToString(myList);
        System.out.println("======================");

        myList.delete("22"); // List delete
        arrToString(myList);
        System.out.println("======================");

        myList.deleteByIndex(1); // List deleteByIndex
        arrToString(myList);
        System.out.println("======================");

        myList.add("11"); // List add
        System.out.println("List Size : " + myList.size());
        System.out.println("======================");

        myList.contains("22"); // List contains
        arrToString(myList);
        System.out.println("======================");

    }

    /**
     * toString
     * @param myList
     */
    private static void arrToString(MyList<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
