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
public class SidSelectionSort {
    private  int[] arr;
    private int nElements;
    private int maxsize;
    public SidSelectionSort(int size){
    arr=new int[size];
    maxsize=size-1;
    nElements=0;
    }
    
    public void Insert(int a){
    arr[nElements]=a;
    nElements++;
    }
    public void Sort(){
    int i=0;
    int pos=0;
   
  for(i=0;i<nElements-1;i++){
      pos=i;
  for(int j=i+1;j<nElements;j++){
  if(arr[j]<arr[pos]){
  pos=j;
  }
  }
  int t=arr[i];
  arr[i]=arr[pos];
  arr[pos]=t;
  }
}
    public void display(){
    for(int i=0;i<nElements;i++){
        System.out.println(""+arr[i]);
    }
    
    
    }
    
    public static void main(String[] args) {
        SidSelectionSort s=new SidSelectionSort(5);
        s.Insert(3);
        s.Insert(1);
        s.Insert(2);
        s.Insert(0);
        s.Insert(-2);
        
        s.Sort();
        s.display();
    }
}


