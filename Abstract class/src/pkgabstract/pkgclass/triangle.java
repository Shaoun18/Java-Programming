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
public class triangle extends figure{
    triangle(double a,double b){
    super (a,b);
    }
    double area(){
    System.out.println("Inside Area for Triangle : ");
    return dim1*dim2 / 2;
    }
}
