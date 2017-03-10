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
public class ArrayImplementation {
    
    private long [] arr;
    private int nsize;
    
    public ArrayImplementation(int i){ //Constructor Call
    arr=new long[i];
    nsize=0;
    }
    public void addElement(int a){    //Add Element
        arr[nsize]=a;
        nsize++;
    }
    
    public int searchElement(int b){  //Search Element
    for(int i=0;i<nsize;i++){
    if(arr[i]==b){
        return b;
    }
    else{
        System.out.println("Not Found");
    return 0;
    }
    }
    return 0;}
    
    
    
    
    
    
    public void deleteElement(int c){ //Delete Element
    for(int i=0;i<nsize;i++){
    if(arr[i]==c){
        for(int a=i;a<nsize;a++){
     arr[a]=arr[a+1];        
       }}
    }
    nsize--;
    }
    
    
    
    public void display(){  //Display Array
    for(int i=0;i<nsize;i++){
    System.out.println(""+arr[i]);
    }
    }
    public void leftrotate(int pos){ //Left Rotation
        pos=pos%nsize;
        System.out.println("Rotation Done");
       for(int i=pos;i<nsize;i++)
           System.out.println(""+arr[i]);
       for(int i=0;i<pos;i++)
           System.out.println(""+arr[i]);
    }
}
