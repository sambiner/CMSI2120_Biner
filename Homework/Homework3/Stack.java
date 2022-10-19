/*
 * File: Stack.java
 * Purpose: To implement a stack using a linked list
 * Author: Sam Biner
 * Date: 10/18/2022
 */


public class Stack{
    CircularList myStack;

    Stack() {
        myStack = new CircularList();
    }

    public void push(int itemToPush){
        myStack.prepend(itemToPush);
    }

    public int peek() throws EmptyStackException{
        if (myStack.getSize() != 0){
            return myStack.getIteratorAt(0).getCurrentInt();
        } else {
            throw new EmptyStackException("  Oops, your stack is empty.  \n");
        }
    }

    public int pop(){
        return myStack.removeAt(0);
    }

}