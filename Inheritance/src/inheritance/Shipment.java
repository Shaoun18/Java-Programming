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
public class Shipment extends Boxweight{
    double cost;
    
    Shipment(Shipment ob ){
    super(ob);
    cost = ob.cost;  
    }
    Shipment(double w,double h,double d,double m,double c){
    super(w,d,h,m);
    cost = c;
    }
    Shipment(){
    super();
    cost = -1;
    }
    Shipment(double len,double m,double c){
    super(len,m);
    cost = c;
    }
}
