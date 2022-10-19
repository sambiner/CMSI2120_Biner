/*
 * File: Queue.java
 * Purpose: To act as a standard queue that follows the FIFO method of input and output
 * Author: Sam Biner
 * Date: 10/18/2022
 */

public class Queue {
    int maxSize;
    long[] queArray;
    int front;
    int rear;
    int nItems;

    Queue(int s){
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void displayQueue(){
        int i=front;
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
    
    public void insert(long s){
        if (rear == maxSize - 1){
            rear = -1;
        }
        queArray[++rear] = s;
        nItems++;
    }

    public long remove(){
        long temp = queArray[front++];
        if (front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        System.out.println(nItems == 0);
        return (nItems == 0);
    }

    public boolean isFull(){
        System.out.println(nItems == maxSize);
        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }

}