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
public class A {
    int i,j;
    
    A (int a,int b){
    i = a;
    j = b;
    }
    void show (){
    System.out.println("i and j : " + i + " " + j);
    }
}
