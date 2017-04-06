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
public class DelimiterChecker {
    
    
    public static void main(String[] args) {
        String name;
        Stack s=new Stack();
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println(""+name.charAt(0));
        
        for(int i=0;i<name.length();i++){
        if(name.charAt(i)=='['||name.charAt(i)=='{'||name.charAt(i)=='('){
            s.push(name.charAt(i));
        }
        else if(name.charAt(i)==']'||name.charAt(i)=='}'||name.charAt(i)==')'){
        char close=(char) s.pop();
        if(name.charAt(i)==']'&& close!='['){
            //System.out.println("Invalid");
            break;
        }
        else  if(name.charAt(i)=='}'&& close!='{'){
           break; //System.out.println("Invalid");
        }
        else  if(name.charAt(i)==')'&& close!='('){
            break;//System.out.println("Invalid");
        }
        
        
        
        }
        }
        if(!s.empty()){
        System.out.println("Invalid");
        
        }
     else
            System.out.println("succezz");
        
    }
        
        
    }
    

