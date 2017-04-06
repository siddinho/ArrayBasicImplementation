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
public class StackusingQueue {
    private int [] arr;
    private int leftfront;
    private int leftrear;
    private  int nElements;
    private int maxsize;
     public StackusingQueue(int a){
     arr=new int[a];
     leftfront=0;
     leftrear=-1;
     nElements=0;
     maxsize=a;
     }
     public void push(int a){
         if(leftrear==maxsize-1){
             System.out.println("OverFlow");
         }
         arr[++leftrear]=a;
         leftfront=leftrear;
     nElements++;
     }
     public int pop(){
     int a;
     a=arr[leftfront];
     nElements--;
     return a;
     }
     
     public  void display(){
     for(int i=0;i<nElements;i++){
     
         System.out.println(""+arr[i]);}
     
     
     }
     
     
     public static void main(String[] args) {
        StackusingQueue q=new StackusingQueue(5);
        q.push(0);
        q.push(1);
        q.push(3);
        q.pop();
        q.pop();
        q.display();
    }
   }
