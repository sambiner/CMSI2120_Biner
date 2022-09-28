/*

*/

public class IntLinkedListTester{

    public static void main (String[] args){
        IntLinkedList myList = new IntLinkedList();

        myList.prepend(23);
        myList.prepend(19);
        myList.prepend(17);
        myList.prepend(13);
        myList.prepend(11);
        myList.prepend(7);
        myList.prepend(5);
        myList.prepend(3);
        myList.prepend(2);

        IntLinkedList.Iterator myIt = myList.getIteratorAt(0);
        System.out.println("The current node is: " + myIt.getCurrentInt());  // Returns 2
        myIt.next();
        System.out.println("The current node is: " + myIt.getCurrentInt());  // Returns 3
        myIt.next();
        System.out.println("The current node is: " + myIt.getCurrentInt());  // Returns 5
        myIt.next();
        System.out.println("The current node is: " + myIt.getCurrentInt()); // Returns 7
        myIt.next();
        System.out.println("The current node is: " + myIt.getCurrentInt()); // Returns 11
        myIt.next();
        System.out.println("The current node is: " + myIt.getCurrentInt()); // Returns 13
        
    }

}
