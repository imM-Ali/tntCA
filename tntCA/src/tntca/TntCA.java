/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tntca;
import java.util.*;
/**
 *
 * @author Muhammad Ali Shahzaib
 */
public class TntCA {

    
    public static void main(String[] args) {
        
        int input1,input2;
        String select;
        Scanner myKb= new Scanner(System.in);
        
        System.out.println("Please Enter the first number");
        input1 = myKb.nextInt();
        System.out.println("Please Enter the next number");
        input2 = myKb.nextInt();
        System.out.printf("Press A to add\nPress S to subtract\nPress M to multiply\nPress G for a greeting\nPress H for a Surprise\n");
        select = myKb.next();
        
        switch(select.charAt(0)){
            case 'A':
            case 'a': Add(input1,input2); break;
            case 'S':
            case 's': Subtract(input1,input2); break;
            case 'M':
            case 'm': Multiply(input1,input2); break;
            case 'G':
            case 'g': Greet(); break;
            case 'H':
            case 'h': GreetAgain(); break;
            default:
                break;
                
        }
        
    }
    
    public static void Add(int a,int b){
         /**
        *@author Yuri Ribeiro
        * Add input1 and input2
        * 
        */
        int Add = (a+b);
        System.out.println("The sum is "+Add);
        
    }
    public static void Multiply(int a,int b){
        //@ Renato Pedro Junior
        int mult = a * b;
        System.out.println(a + " times " + b + " is " + mult);
    }
    public static void Subtract(int a,int b){
        // @ HAIDER SYED
         int diff = (a-b);
        System.out.println("The diff is "+diff);
    }
    public static void Greet(){

        /**
        *@author Thiago Gomes de Souza
        */

        System.out.println("Hello, world !");

    }
    public static void GreetAgain(){
        //@author Muhammad Ali Shahzaib
        System.out.println("I am here to greet you again!!!!!!!!");
    }
    
    
}
