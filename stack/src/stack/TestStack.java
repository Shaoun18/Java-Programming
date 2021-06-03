/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Shaoun
 */
public class TestStack {
        
    private int stck[];
    private int tos;
    
    TestStack(int size){
            stck = new int[size];
            tos = -1;
    }
    
    void push(int item){
            if (tos == stck.length - 1)
                System.out.println("Stack is full.");
            else
                stck[++tos] = item;
    
    }
        
    int pop(){
            if (tos < 0){
                System.out.println("Stack underflow.");
                return 0;
    }
            else
               return stck [tos--];
}
}
