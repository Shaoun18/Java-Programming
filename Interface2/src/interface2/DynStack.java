/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author Shaoun
 */
public class DynStack implements Intstack{
    private int stck[];
    private int tos;
    
    DynStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    public void push(int item){
        if (tos == stck.length -1){
            int temp[] = new int [stck.length * 2];
            for(int i = 0;i<stck.length;i++)
                temp[i] = stck[i];
                stck = temp;
                stck[++tos] = item; 
        }
        else
            stck[++tos] = item;
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
