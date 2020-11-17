/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tntca;
import java.util.*;
/**
 *
 * @author Ali
 */
public class TntCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I WILL ADD THE MAIN METHOD (ALI)
        int input1,input2;
        String select;
        Scanner myKb= new Scanner(System.in);
        
        System.out.println("Please Enter the first number");
        input1 = myKb.nextInt();
        System.out.println("Please Enter the next number");
        input2 = myKb.nextInt();
        System.out.println("Press A to add, Press S to subtract, Press M to multiply, Press G for a greeting!");
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
            default:
                break;
                
        }
        
    }
    //REMEMBER GUYS YOU HAVE TO VARIABLES TO WORK WITH, a AND b, you just have to write the code and 1 line for output, thats it!
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
        // HAIDER PLEASE ADD YOUR CODE HERE FOR SUBTRACTION OF a AND b
    }
    public static void Greet(){

        /**
        *@author Thiago Gomes de Souza
        */

        System.out.println("Hello, world !");

    }
    
    
}
