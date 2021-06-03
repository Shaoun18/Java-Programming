/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.pkgclass;

/**
 *
 * @author Shaoun
 */
public abstract class figure {
    double dim1;
    double dim2;
    
    figure(double a,double b){
    dim1 = a;
    dim2 = b;
    }
    abstract double area();
}
