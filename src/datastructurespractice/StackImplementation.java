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
public class StackImplementation {
    private int []StackArray;
    public static int top;
    private int size;
    public StackImplementation(int s){
    size=s;
    StackArray=new int[size];
    top=-1;
    }
    public void push(int a){
        if(top==size-1){
        System.out.println("OverFlow");
        }
        else{
    StackArray[++top]=a;
    }}
    public int pop(){
        if(top==-1){
        System.out.println("UnderFlow");}
        else{
    return(StackArray[top--]);
    }   return 0;
}
    
    public static void main(String[] args) {
        int a = 0;
        StackImplementation s=new StackImplementation(5);
        
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        while(top>-1){
        a=s.pop();
        
            System.out.println("Element popped"+a);
        }}
        
        
    }

