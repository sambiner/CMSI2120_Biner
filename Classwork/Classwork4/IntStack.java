public class IntStack extends IntLinkedList{

    super.myStack;

    IntStack(){
        myStack = new IntLinkedList();
    }
    public void push(int data){     //Adds data to the stack, similar to prepend
        myStack.prepend(data);
    }
    public int peek(data){
        return myStack.getIteratorAt(data).getCurrentInt;
    }
    public IntLinkedList.Iterator pop(){     //Removes data from the beginning of the list, similar to a delete or remove method
        IntLinkedList it = getIteratorAt(0);
        Node tempNode = it.currentNode;
        myStack.head = it.currentNode.next();
        return tempNode;
    }
}
