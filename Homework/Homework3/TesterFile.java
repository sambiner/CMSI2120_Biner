/*
 * File: TesterFile.java
 * Purpose: To test all of my class code and methods from Queue, Deque, CircularList, and Stack programs
 * Author: Sam Biner
 * Date: 10/18/2022
 */

class TesterFile {
    public static void main(String[] args) throws EmptyStackException{
        System.out.println("Testing my Queue class!");
        Queue theQueue = new Queue(5); // queue holds 5 items
        theQueue.insert(10); // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.displayQueue();
        theQueue.remove(); // remove 3 items
        theQueue.remove(); // (10, 20, 30)
        theQueue.remove();
        theQueue.insert(50); // insert 4 more items
        theQueue.insert(60); // (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);
        theQueue.displayQueue();
        while( !theQueue.isEmpty() ) {// remove and display; all items
            long n = theQueue.remove(); // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");



        System.out.println("Testing my Deque class!");
        Deque theDeque = new Deque(5);
        theDeque.insertRight(1);
        theDeque.insertRight(2);
        theDeque.insertLeft(3);
        theDeque.insertLeft(4);
        theDeque.insertRight(5);
        theDeque.isFull();
        theDeque.isEmpty();
        theDeque.displayDeque();
        theDeque.removeRight();
        theDeque.removeLeft();
        theDeque.isFull();
        theDeque.isEmpty();
        theDeque.displayDeque();
        System.out.println();
        /*System.out.print(theDeque.front);
        System.out.print(" ");
        System.out.print(theDeque.rear);
        System.out.println();
        for(int i=0; i<theDeque.maxSize;i++){
            System.out.print(theDeque.queArray[i]);
            System.out.print(" ");
        }*/
        


        System.out.print("Testing out my CircularList class!");
        CircularList circle = new CircularList();
        circle.insert(5);
        circle.insert(7);
        circle.insert(9);
        circle.insert(13);
        circle.insert(15);
        circle.insert(17);
        circle.display(); //Prints the elements out in the reverse of order inserted
        circle.search(5);
        circle.search(13);
        circle.search(20);
        circle.delete();
        circle.delete();
        System.out.println();



        System.out.println("Testing out my Stack class!");
        Stack myStack = new Stack();
        myStack.push(4);
        myStack.push(7);
        myStack.push(20);
        myStack.push(12);
        System.out.println("Peeking at the first element of myStack: " + myStack.peek());
        System.out.println("Popping the first element from myStack: " + myStack.pop());
        System.out.println("Peeking at the first element of myStack: " + myStack.peek());
        System.out.println("Popping the first element from myStack: " + myStack.pop());
        System.out.println("Peeking at the first element of myStack: " + myStack.peek());
        System.out.println("Popping the first element from myStack: " + myStack.pop());
        System.out.println("Peeking at the first element of myStack: " + myStack.peek());


        System.out.println("\n\nThank you for executing my TesterFile.  I hope you will give me 100% :D \n");

    } // end main()
} // end class QueueApp