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
public class Boxcolor extends Shipment{
      String color;
    
    Boxcolor(Boxcolor ob){
    super(ob);
    color = ob.color;
    }
    Boxcolor(double w,double h,double d, double m,double c,String n){
     super(w,h,d,c,m);
     color  = n;
    }
    Boxcolor(){
    super();
    color = " ";
    }
    Boxcolor(double len,double m,double c,String n){
        super (len,m,c);
        color = n;
    }
}
