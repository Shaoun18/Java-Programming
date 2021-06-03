/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.method.overriding;

/**
 *
 * @author Shaoun
 */
public class B extends A{
    int k;
    
    B(int a,int b,int  c){
    super(a,b);
    k = c;
    }
    
    void show (String msg){
    System.out.println(msg +  k);
    }
}
