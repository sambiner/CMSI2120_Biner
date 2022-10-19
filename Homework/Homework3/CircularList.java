   /*
   * filename: IntLinkedList.java
   * purpose: demonstrates a circular singly linked list data structure
   * Author: Sam Biner
   * Data: 10/16/2022
   */

  public class CircularList {

   Node current;
   Node head;
   int  size;

    // the constructor
   CircularList() {
      current = null;
      size = 0;
   }


   public void step(){
      current = current.next;
   }


   public void insert(int s){
      Node newNode = new Node(s);
      if (size == 0){
         newNode.next = newNode;
         current = newNode;
         size++;
      } else {
         Node temp = current.next;
         current.next = newNode;
         newNode.next = temp;
         size++;
      }
   }


   public boolean search(int elem){
      Node originalCurrent = current;
      if(size == 0){
         System.out.println("Your list is empty");
         return false;
      } else if(current.data == elem){
         System.out.print("Is " + elem + " in your circular list?  ");
         System.out.println(current.data == elem);
         return true;
      }
      step();
      while(current != originalCurrent){
         if(current.data == elem){
            System.out.print("Is " + elem + " in your circular list?  ");
            System.out.println(current.data == elem);
            return true;
         }
         step();
      }
      System.out.println("Did not find " + elem + " in your list.");
      return false;  
   }

   public int delete(){
      int temp = current.next.data;
      current.next = current.next.next;
      System.out.println(temp + " was deleted.");
      return temp;
   }
    
   public void display(){
      Node original_current = current;
      System.out.println();
      step();
      while (current != original_current){
         System.out.print(current.data);
         System.out.print(" ");
         step();
      }
      System.out.print(current.data);
      System.out.println();
   }








   public void prepend( int dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }

   public int getSize() {
       return size;
   }


   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }

   public int removeAt(int index){
      Iterator it = null;
      int valueRemoved;
      if (index == 0){
         it = getIteratorAt(0);
         valueRemoved = it.getCurrentInt();
         head = it.currentNode.next;
      } else {
         it = getIteratorAt(index);
         valueRemoved = it.getCurrentInt();
         it = getIteratorAt(index-1);
         it.currentNode.next = it.currentNode.next.next;
      }
      size--;
      return valueRemoved;
   }

   public void insertAt(int index, int value){
      if (index == 0){
         prepend(value);
      } else {
         Iterator it = getIteratorAt(index-1);
         Node newNode = new Node(value);
         newNode.next = it.currentNode.next;
         it.currentNode.next = newNode;
         size++;
      }
   }

 /**
 * The internal Node class; each node has a data field that
 *    stores an int, and a Node field that stores a reference
 *    to the next node in the list
 */

   private class Node {

      int data;            // remember this is an IntLinkedList
      Node next;           // here's the self-referential part

       // constructor
      Node( int d ) {
         data = d;
         next = null;
      }
   }

 /**
 * The internal Iterator class; this provides the ability to
 *    go through all the nodes in the list, starting at any
 *    node you choose, and also allows visibility of the value
 *    at the list item that is currently being referred to by
 *    the Iterator's internal 'currentNode' object
 */

   public class Iterator {
      private Node currentNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public int getCurrentInt() {
         return currentNode.data;
      }

      public void setNext(Node newNext){
         currentNode.next = newNext;
      }

      public Node getCurrentNode(){
         return currentNode;
      }

   }
}
