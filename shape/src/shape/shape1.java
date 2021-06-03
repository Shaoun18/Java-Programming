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
public class shape1 {
        double height,length,base,radius;
        double b,h,l,r;
        
    shape1(){
                base = b;
                height = h;
                length = l;
                radius = r;
    }
    
    double square(double l){
        return l*l;
                
    }
    
    double triangle(double b,double h){
        return b*h*0.5;
        
    }
    
      double rectangle(double l,double h){
        return l*h;
    }
      
        double circle(double radius){
            double area;
            area = radius * radius;
            return 3.4*area;
    }
    
}
