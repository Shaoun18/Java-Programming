// Q : Scanner input method 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglescanner;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class RectangleScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int length; 
      int width;    
      int area;      

      Scanner console = new Scanner(System.in);

      System.out.print("Enter length ");
      length = console.nextInt();

      System.out.print("Enter width ");
      width = console.nextInt();

      area = length * width;

      System.out.println("The area of rectangle is " + area);
    }
    
}
