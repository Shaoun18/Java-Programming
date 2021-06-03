// Q  : Scanner input the code 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdatascanner;
import java.util.Scanner;

/**
 *
 * @author Shaoun
 */
public class ReadDataScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner sc =new Scanner(System.in);
      
      System.out.println("Enter your name: ");
      String name = sc.next();
      
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      
      System.out.println("Enter your percent: ");
      float percent = sc.nextFloat();
      
      System.out.println("Are you local (enter true or false): ");
      boolean isLocal = sc.nextBoolean();
      
      System.out.println("Enter your grade(enter A, or, B or, C or, D): ");
      char grade = sc.next().toCharArray()[0];
      
      Student std = new Student(name, age, percent, isLocal, grade);
      
      std.displayDetails();
    }
    
}
