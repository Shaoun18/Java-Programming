/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author Shaoun
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Circle c1 = new Circle();
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
      String t = c1.toString();
      System.out.println("Output from string to string" +" "+ t + "\n");
      Circle c2 = new Circle(2.0);
      System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
      String t1 = c2.toString();
      System.out.println("Output from string to string" +" "+ t1 + "\n");
    }
    
}
