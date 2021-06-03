// Q : Write a program to print the nth digit of a number where print a n is a positive number

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
     
     int number,digit = 0;
     
     number = input.nextInt();
     
     while (number > 0){
   
     digit = number%10;
     
     number = number / 10;
     
     System.out.println("First Digit: " + digit);
    }
    
}
}
