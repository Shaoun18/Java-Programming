/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Shaoun
 */
public class Shape {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        shape1 ob = new shape1();
        
      System.out.println("Square area is "  + ob.square(5.6));
      System.out.println("triangle area is "  + ob.triangle(6.3,12.55));
      System.out.println("rectangle area is "  + ob.rectangle(52.21,12.55));
      System.out.println("circle area is "  + ob.circle(3.1416));
    }
    
}
