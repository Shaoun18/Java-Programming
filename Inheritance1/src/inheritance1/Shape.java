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
public class Shape {
    private  String color;
    private boolean filled;
    
    public Shape(){
     color = "red";
     filled = true;
    }
    
    public Shape(String color,boolean filled){
     this.color = color;
     this.filled = filled;
    }
    
    public String getcolor(){
     return color;
    }
    
    public void setcolor(String color){
     this.color = color;
    }
    
    public boolean isfilled(){
     return filled;
    }
    
    public void setfilled(boolean filled){
     this.filled = filled;
    }
    
    public String toString(){
    return ("color : "+" "+  color + "filled" + " "+ filled);
    }
    
}
