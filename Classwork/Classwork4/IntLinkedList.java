/*
* Filename: IntLinkedList.java
* Description:
* Author: Sam Biner
* Date: 09/26/2022
*/

public class IntLinkedList {

    private Node head;
    private int size;

    public IntLinkedList () {
        head = null;
        size = 0;
    }

    public int getSize () {
        return size;
    }

    public void prepend (int addData) {
        Node currentHead = head;
        head = new Node(addData);
        head.next = currentHead;
        size++;
    }


    private class Node {
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }

    }


    public Iterator getIteratorAt (int index){
        if ((index > size) || (index < 0)) {
            throw new IllegalArgumentException();
        }
        Iterator it = new Iterator();
        while (index > 0 ) {
            it.next();
            index--;
        }
        return it;
    }


    public class Iterator{
        private Node currentNode;

        Iterator(){
            currentNode = head;
        }

        public void next(){
            if (currentNode == null){
                return;
            } else {
                currentNode = currentNode.next;
            }
        }

        public boolean hasNext(){
            return ((currentNode != null) && (currentNode.next != null));
        }

        public int getCurrentInt(){
            return currentNode.data;
        }
    }
    

}
