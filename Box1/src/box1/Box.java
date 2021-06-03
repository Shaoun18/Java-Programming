// Q : Box uses a parameterized constructor to initialize the dimension of a box.

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
        
        Box (double w,double h,double d){
        depth = d;
        width = w;
        height = h;
        }
        
        double volume(){
                
             return width * height * depth;
    }   

        
    public static void main(String[] args) {
        // TODO code application logic here

        Box mybox1 = new Box(10,15,20);
        Box mybox2 = new Box(3,6,9);
        double vol;
        
        vol = mybox1.volume();
        System.out.println("Volume is : "  + vol);
        
        vol = mybox2.volume();
        System.out.println("Volume is : "  + vol);
        
    }
    
}
