// Q : Write a program to print the first digit

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class JavaApplication9 {
    private static Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	int number, first_digit;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number  = sc.nextInt();	
		
		first_digit = number;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		System.out.println("\n The First Digit of a Given Number " + number + "  =  " + first_digit);
    }
    
}
