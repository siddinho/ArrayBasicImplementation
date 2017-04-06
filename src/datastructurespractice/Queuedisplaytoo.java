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
public class Queuedisplaytoo {
    private int [] queue;
    private int front;
    private  int rear;
    private int nElements;
  private  int nsize;
  //int pos;
    
    public Queuedisplaytoo(int a){
    queue=new int[a];
    front=0;
      rear=-1;
   nElements=0;
nsize=a;
//pos=0;

   }
    
    
    
    
   public void insert(int b){
 
  if(front==0 && rear==nsize-1){
      System.out.println("Queue Full");
  }
  else{
      
      if(rear==nsize-1){
      rear=-1;
      }
  queue[++rear]=b;
  nElements++;
  //pos++;
  }
  }
   
 public int delete(){
     int a = 0;
 if(nElements==0){
 
     System.out.println("Underflow");}
 
 
 else{
 a=queue[front];
 front++;
 if(front>nsize-1){
 front=0;}
 nElements--;
        } 
return a;}
 
 public boolean isEmpty(){
 return(nElements==0);
 }
  public boolean isFull(){
 return(nElements==nsize-1);
 }

 public void display(Queuedisplaytoo q){
     int a;
 while(!isEmpty()){
 a=q.delete();
     System.out.println(""+a);
 
 }
 }
 
 
 
 
    public static void main(String[] args) {
        Queuedisplaytoo q=new Queuedisplaytoo(5);
        
        q.insert(0);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
       // q.delete();
       // q.insert(6);
        q.delete();
        q.delete();
        q.insert(6);
        q.insert(7);
        q.display(q);

                
        
    }
 
 
}
