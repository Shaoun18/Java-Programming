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
public class Circle {
    private double radius;
   private String color;
   
public Circle() 
    {
      radius = 1.0;
      color = "red";
    }
   // 2nd constructor with given radius, but color default
   public Circle(double r) 
   {
      radius = r;
      color = "red";
   }
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   public String toString() 
   {
    return "Circle[radius=" + radius + " color=" + color + "]";
   }
}
