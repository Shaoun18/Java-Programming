// Q : write a program to find the sum of all digit

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
     
     int number,digit = 0;
     int sum;
     sum = 0;

     number = input.nextInt();
        
     System.out.println("Enter your digit Number : " + number);
     while (number > 0){
   
     digit = number%10;
     
     number = number / 10;
       sum = sum + digit;
       
     System.out.println("Digit Number : " + digit);
     System.out.println("Sum the Result : " + sum);
    }
    }
}