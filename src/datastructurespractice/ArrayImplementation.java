/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice;

import java.util.Set;

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
    
    
    public void binaryadd( int a){
        int i = 0;
    if(nsize==0){
    arr[nsize]=a;
    nsize++;
    }
    else
        for(i=0;i<nsize-1;i++){
        if(a>arr[i] && a<arr[i+1])
            arr[i+1]=a;
        nsize++;
            break;
            }
    //arr[i+1]=a;
    //nsize++;
    for(int j=i+2;j<nsize;j++){
        arr[j+1]=arr[j];
    
    }
    
   /// public  void binarysearch(int a){
    
        
        
        
        
    
    }
    
    //nsize++;
    public void binarysearch(int a){
        int beg=0; int end=nsize;
        int mid;
    while(beg<=end){
        mid=(beg+end)/2;
        if(a==arr[mid]){
        System.out.println("Element Found at "+mid);
        return;
       }
        else if(a>arr[mid]){
        beg=mid+1;
        }
        else{
        end=mid-1;
      }
        
       }
    System.out.println("Not Found");
    
    
    
    
    
    
    
    }
    public int getmax(){
        int max=0;//
        
        if(nsize==0){
        return -1;}
        else{
        for(int i=0;i<nsize;i++){
        if(arr[i]>max){
        max=(int)arr[i];
        //pos=i;
        }
       }
        return max;
       }
       }
    public int removemax(){
        int max=0;
        int i;
        int pos=0;
        if(nsize==0){
        return -1;}
        else{
        for(i=0;i<nsize;i++){
        if(arr[i]>max){
        max=(int)arr[i];
        pos=i;
        }
       }
        
        for(int j=pos;j<nsize;j++){
        arr[j]=arr[j+1];
        }
        nsize--;
        display();
        return max;
        //return max;
       }
       }
    
    public void noDups(){
        
        int a=0;
        for(a=0;a<nsize;a++){
        for(int b=0;b<nsize;b++){
        if(a!=b){
        if(arr[a]==arr[b]){
            arr[b]=0;
        }
        }
       }
        }
        
        
        for(int b=0;b<nsize;b++){
    deleteElement(0);
   
}
        display();
        
    }
    //Changes Required
    
    
    public void bubblesort(){
       long t;
       System.out.println("Called");
    for(int out=nsize;out>0;out--){
    for(int in=0;in<out;in++){
    if(arr[in]>arr[in+1]){
        t=arr[in];
        arr[in]=arr[in+1];
        arr[in+1]=t;
        }}
    }
    //System.out.println(""+nsize);
    display();
    }
    
}