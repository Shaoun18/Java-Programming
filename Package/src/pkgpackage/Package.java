// Q : A short package exampele

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
public class Package {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Balance current[] = new Balance[3];
        
        current[0] = new Balance("Shaoun",120.352);
        current[1] = new Balance("Mominul",-0.255);
        current[2] = new Balance("Shamim",124.652);
        
        for(int i =0;i<= 2;i++)
            current[i].show();
        
    }
    
}
