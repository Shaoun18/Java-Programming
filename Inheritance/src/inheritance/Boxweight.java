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
public class Boxweight extends Box{
      double weight;
    
    Boxweight(Boxweight ob){
    super(ob);
    weight = ob.weight;
    }
    Boxweight(double w,double h,double d, double m){
     super(w,h,d);
     weight = m;
    }
    Boxweight(){
    super();
    weight = -1;
    }
    Boxweight(double len,double m){
        super (len);
        weight = m;
    }
}
