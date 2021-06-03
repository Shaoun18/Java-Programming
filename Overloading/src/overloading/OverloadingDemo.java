/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Shaoun
 */
public class OverloadingDemo {
        void test (){
    System.out.println("NO parameters");
    }
    
    void test (int a){
    System.out.println("a : " + a);
    }
    
    void test (int a,int b){
    System.out.println("a and b : " + a + " " + b);
    }
    
    double test (double a){
    System.out.println("double a : " + a);
    return a*a;
    }
}
