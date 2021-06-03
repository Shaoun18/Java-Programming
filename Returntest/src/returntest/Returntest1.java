/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntest;

/**
 *
 * @author Shaoun
 */
public class Returntest1 {
    
        int a;

    Returntest1(int i) {
    a = i;
    }

    Returntest1 incrByTen() {
    Returntest1 temp = new Returntest1(a+10);
    return temp;
}
}
