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
public class PriorityQ {
    private int []queue;
    private int front;
    private int rear;
   public int nElements;
   public int maxsize;
   
   public PriorityQ(int s){
   queue=new int[s];
   nElements=0;
   front=0;
   rear=-1;
   maxsize=s-1;
   }
   public void Insert(int a){
       int i;
   if(nElements==0){
   queue[nElements]=a;
      // System.out.println("1 element added");
   nElements++;
   }
   else  if(nElements==maxsize){
   
   System.out.println("Queue Full");
   }
  
   else{
 for(i=nElements;i>=0;i--){
 if(a>queue[i]);{
 queue[i+1]=queue[i];}
 
 }
 
 queue[i+1]=a;
 nElements++;
   // 0 will be 1st deleted
  }
   }
   
 public int delete(){
     int a=(queue[nElements]);
     nElements--;
     return a;
 }
 
 public void display(){
 for(int i=0;i<nElements;i++){
     System.out.println(""+queue[i]); }
 }
    public static void main(String[] args) {
        PriorityQ p=new PriorityQ(5);
        p.Insert(3);
        p.Insert(4);
        p.delete();
        
        p.display();
    }
  
}
