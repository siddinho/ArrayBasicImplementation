/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice;

/**
 *
 * @author Siddharth
 */
public class Queue {

    int maxsize;// Size-1 or Last Index
    int front;
    int rear;// points to current last element
    int[] queue;
    int nitems = 0;

    public Queue(int s) {
        queue = new int[s];
        maxsize = s - 1;
        front = 0;
        rear = -1;
        nitems = 0;
    }

    public void enqueue(int a) {
        if (!isfull()) {
            if (front == maxsize && rear + 1 == front) {
                System.out.println("Queue Full");
            }
            
            if (rear == maxsize) {
                rear = -1;
            }
            queue[++rear] = a;
            nitems++;
        } else {
            System.out.println("Queue Full");
        }
    }

    public int dequeue() {
        int a = 0;
        if (!isEmpty()) {
            
            a = queue[front++];
            
            if (front > maxsize) {
                front = 0;
            }
            nitems--;
            return a;
        } else {
            return 0;
        }
    }

    public int peak() {
        return queue[front];
    }
    
    public boolean isEmpty() {
        return (nitems == 0);
    }
    
    public boolean isfull() {
        return (nitems == maxsize + 1);
    }
    
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        // q1.dequeue();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.dequeue();
        
        q1.enqueue(8);
        
        int a;
        while (!q1.isEmpty()) {
            a = q1.dequeue();
            System.out.println("" + a);
        }
        
    }
}
