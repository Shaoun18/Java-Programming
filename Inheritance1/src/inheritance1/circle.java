/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author Shaoun
 */
public class circle extends Shape {
    private double radius;
    
    public circle (){
    radius = 1.0;
    }
    public circle(double radius){
    this. radius = radius;
    }
    
    public circle(String color,boolean filled,double radius){
    super(color,filled);
    this.radius = radius;
    }
    
    public double getradius(){
    return  radius;
    }
    
    public void setradius(double radius){
    this. radius = radius;
    }
    
    public double getArea(){
    return Math.PI*radius*radius;
    }
    
    public double getperimeter(){
    return 2*Math.PI*radius;
    }
    public String toString(){
    return ("radius : " + " " + radius);
    }
}
