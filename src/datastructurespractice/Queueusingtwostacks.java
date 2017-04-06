/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice;

import java.util.Stack;

/**
 *
 * @author Siddharth
 */
public class Queueusingtwostacks {
    Stack s;
    Stack s1;
    
    public Queueusingtwostacks(){
    s =new Stack();
    s1=new Stack();
    }
    public void insert(int a){
    s.push(a);
    }
    
    
    public int delete(){
    while(!s.isEmpty()){
    s1.push(s.pop());
    }
    int a=(int) s1.pop();
while(s1.isEmpty()){
s.push(s1.pop());
}    System.out.println("Element Deleted  :"+a);
    return a;
    }
    
    
    public void display(){
    for(Object i:s){
        System.out.println(""+s.pop());
    }
    
    }
    public static void main(String[] args) {
         Queueusingtwostacks q=new Queueusingtwostacks();
         q.insert(1);
         q.insert(2);
         q.insert(3);
          q.delete();
         q.delete();
         q.display();
          
          
        
        
        
        
    }
}
