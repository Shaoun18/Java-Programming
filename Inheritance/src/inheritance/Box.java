/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Shaoun
 */
public class Box {
    private double width;
    private double height;
    private double depth;
    
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;      
    }
    Box(double w,double h,double d ){
        width = w;
        height = h;
        depth = d;      
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;      
    }
    Box(double len){
        width = height = depth = len;   
    }
    double volume(){
        return width * height * depth;    
    }
}
