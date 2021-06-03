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
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle (){
    width = 1.0;
    length = 1.0;
    }
    public Rectangle (double width,double length){
    this.width = width;
    this.length = length;
    }
    public Rectangle (double width,double length,String color,boolean filled){
    super(color,filled);
    this.width = width;
    this.length = length;  
    }
    public double getwidth(){
        return width;
    }
    public void setwidth(double width){
    this.width = width;
    }
    public double getlength(){
        return length;
    }
    public void setlength(double length){
    this.length = length;
    }
    public double getArea(){
    return length * width;
    }
    public double getPerimeter(){
    return 2*(length + width);
    }
    public String toString(){
    return ("width  :  "+ " " + width+ "length : " + " "+ length);
    }
}
