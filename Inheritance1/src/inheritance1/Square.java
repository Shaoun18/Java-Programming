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
public class Square extends Rectangle{
    private double side;
    
    public Square(){
    side = side;
    }
    public Square(double side){
    this.side = side;
    }
    public Square(double side,String color,boolean filled,double width,double length){
    super(color,filled,length,width);
    this.side = side;
    }
    public double getside(){
    return  side;
    }
    public void setside(double side){
    this.side = side;
    }
    public void setwidth(double side){
    this.side = side;
    }
    public void setlength(double side){
    this.side = side;
    }
    public String tostring(){
    return ("side"  + " " + side);
    }
}
