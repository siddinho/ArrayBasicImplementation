/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Siddharth
 */
public class trial {
    public static void main(String[] args) {
        
    
Scanner sc=new Scanner(System.in);
        Stack <String>s=new <String>Stack();
        String  []value;
        String query;
        int times=sc.nextInt();
       String a1=""; 
        for(int i=0;i<=times;i++){
            query=sc.nextLine();
            value=query.split("\\s+");
            if(value[0].equals("1")){
             s.push(value[1]);
                                

            }
            if(value[0].equals("2")){
               s.pop();
                                

                }
            if(value[0].equals("3")){
                 int max=-100;
                int a=0;
               while(!s.empty()){
                  a1=s.pop();
                   
                a=Integer.parseInt(""+a1);   
                   if(a>max){
                       max=a;
                   }
                  }
                 System.out.println(""+max);
           }
            
          
        }
       
    }
}
