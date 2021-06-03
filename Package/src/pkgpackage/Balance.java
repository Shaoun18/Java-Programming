/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgpackage;

/**
 *
 * @author Shaoun
 */
public class Balance {
    String name;
    double bal;
    
    Balance (String n,double b){
        name = n;
        bal = b;    
    }
    
    void show(){
        if(bal<0)
            System.out.println("---->");
        System.out.println(name + "  : $" + bal);   
    }
    
}
