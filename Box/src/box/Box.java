// Volume () returns the volume of a box 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author Shaoun
 */
public class Box {

    /**
     * @param args the command line arguments
     */
    
        double width;
        double height;
        double depth;
        
        double volume(){
                
             return width * height * depth;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;
        
         
        mybox2.width = 3;
        mybox2.depth = 9;
        mybox2.height = 6;
        
        vol = mybox1.volume();
        System.out.println("Volume is : "  + vol);
        
        vol = mybox2.volume();
        System.out.println("Volume is : "  + vol);
        
    }
    
}
