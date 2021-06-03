/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Shaoun
 */
public class Test1 {
        
    int a, b;
    Test1(int i, int j) {
    a = i;
    b = j;
    }
    boolean equals  (Test1 o)   {
    if( o.a == a  &&  o.b == b) 
    return true;
    else 
    return false;
}

}
