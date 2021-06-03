/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

/**
 *
 * @author Shaoun
 */
public class Balance {
    String name;
    double bal;
    
    public Balance (String n,double b){
        name = n;
        bal = b;    
    }
    
    public void show(){
        if(bal<0)
            System.out.println("---->");
        System.out.println(name + "  : $" + bal);   
    }
}
