// Q : Count occaurance of a given number of array

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

 import java.util.Scanner;
/**
 *
 * @author Shaoun
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, x, count;
        count = 0;
        int i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
    
}
