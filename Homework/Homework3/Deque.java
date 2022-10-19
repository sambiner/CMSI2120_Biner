/*
 * File: Deque.java
 * Purpose: To act as a doubly ended queue that extends the class Queue
 * Author: Sam Biner
 * Date: 10/18/2022
 */

public class Deque extends Queue{
    
    public Deque (int s){
        super(s);
    }

    public void displayDeque(){
        int i=front;
        if(nItems == 0){
            System.out.println("Your deque is empty!");
        }
        while(queArray[i] != queArray[rear]){
            System.out.print(queArray[i]);
            System.out.print(" ");
            i++;
            if (i == maxSize){
                i = 0;
            }
        }
        if (queArray[i] == queArray[rear]){
            System.out.print(queArray[rear]);
        }
        System.out.println();
    }
    

    public void insertRight(long s){
        this.insert(s);
    }
    
    
    public void insertLeft(int s){
        if (front == 0){
            front = maxSize-1;
            queArray[front] = s;
        } else {
            queArray[--front] = s;
        }
        nItems++;
    }


    public long removeLeft(){
        return this.remove();
    }


    public long removeRight(){
        long temp = queArray[rear--];

        if (rear == -1){
            rear = maxSize;
        }

        nItems--;
        return temp;
    }

}