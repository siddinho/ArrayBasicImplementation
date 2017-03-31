/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurespractice;

import java.util.Scanner;

/**
 *
 * @author Siddharth
 */
public class PostFixParser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char symbol=0;
        int result=0;
        StackImplementation s=new StackImplementation(20);
        System.out.println("Enter PostFix string");
        String input=sc.nextLine()+"@";
        for(int i=0;i<input.length();i++){
        symbol=input.charAt(i);
        if(symbol=='@'){
            break;
    }
        if(symbol>'0' && symbol<='9'){
        s.push((int)(symbol-'0'));
        }
        else{
        switch(symbol){
            case '+':
                 result=s.pop()+s.pop();
                s.push(result);
                break;
                case '-':
                result=s.pop()-s.pop();
                s.push(result);
                break;
                case '/':
                result=s.pop()/s.pop();
                s.push(result);
                break;
                case '*':
                result=s.pop()*s.pop();
                s.push(result);
                break;
            }
        
        
        
        }
        
        
        }
        
        System.out.println("Answer is "+s.pop());
    }
    
}
