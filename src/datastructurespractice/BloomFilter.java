/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice;
import java.util.*;
/**
 *
 * @author Siddharth
 */
public class BloomFilter {

    
    
    
    public static void main(String []args){
    
   int []mem=new int[10];
   String name;
   
   for(int i=0;i<10;i++){
   mem[i]=0;
   }
   Scanner sc=new Scanner(System.in);  
     while(true)
     { System.out.println("ENTER USERNAME");
   
   name=sc.nextLine();
   name=name.toLowerCase();
   if(name.equals("exit")){
   break;}
   
   char []alphabets=name.toCharArray();
   
   int last=alphabets.length;
     int ascii1= (int)alphabets[0];
     ascii1=ascii1%10;
     int ascii2= (int)alphabets[last-1];
     ascii2=ascii2%10;
   //System.out.println(""+ascii1+"   "+ascii2);
   if(mem[ascii1]==0 || mem[ascii2]==0){
   System.out.println("Available");
   mem[ascii1]=1;
   mem[ascii2]=1;
   }
   else{
   System.out.println("Not Available");
   }
 
   }
 }
    
}
