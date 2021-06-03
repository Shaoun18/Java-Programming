/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.pkgsuper;

/**
 *
 * @author Shaoun
 */
public class B extends A {
    int i;
    
    B(int a, int b){
    super.i = a;
    i  = b;
    }
    
    void show (){
    System.out.println("i in superclass : " + super.i);
    System.out.println("i in superclass : " + i);
    }
}
