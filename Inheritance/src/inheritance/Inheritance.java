// Q : A complete implementation of Box

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Shaoun
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Boxweight mybox1 = new Boxweight(10,20,15,34.3);
        Boxweight mybox2 = new Boxweight(10,2,63,38.3);
        Boxweight mybox3 = new Boxweight();
        Boxweight mycube = new Boxweight(3 , 2);
        Boxweight myclone = new Boxweight(mybox1);
        
        double vol;
        vol = mybox1.volume();
        System.out.println("volume of mybox1 is " + vol);
        System.out.println("weight of mybox1 is " + mybox1.weight);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("volume of mybox1 is " + vol);
        System.out.println("weight of mybox1 is " + mybox2.weight);
        System.out.println();
        
        vol = mybox3.volume();
        System.out.println("volume of mybox1 is " + vol);
        System.out.println("weight of mybox1 is " + mybox3.weight);
        System.out.println();
        
        vol = myclone.volume();
        System.out.println("volume of myclone is " + vol);
        System.out.println("weight of myclone is " + myclone.weight);
        System.out.println();
        
        vol = mycube.volume();
        System.out.println("volume of mycube is " + vol);
        System.out.println("weight of mycube is " + mycube.weight);
        System.out.println();
        
        Shipment Shipment1 = new Shipment(10,20,30,4,3.1416);
        Shipment Shipment2 = new Shipment(1,20,0,4,3.1416);
        
        vol = Shipment1.volume();
        System.out.println("volume of Shipment1 is " + vol);
        System.out.println("weight of mybox1 is " + Shipment1.weight);
        System.out.println("Shipping cost : $" + Shipment1.cost);
        System.out.println();
        
        vol = Shipment2.volume();
        System.out.println("volume of Shipment2 is " + vol);
        System.out.println("weight of Shipment2 is " + Shipment2.weight);
        System.out.println("Shipping cost : $" + Shipment2.cost);
        System.out.println();
        
        Boxcolor Boxcolor1 = new Boxcolor(10,20,30,4,3.1416,"red");
        Boxcolor Boxcolor2 = new Boxcolor(1,20,0,4,3.1416,"white");
        
        vol = Boxcolor1.volume();
        System.out.println("volume of Boxcolor1 is " + vol);
        System.out.println("weight of Boxcolor1 is " + Boxcolor1.weight);
        System.out.println("Boxcolor1 cost : $" + Boxcolor1.cost);
        System.out.println("Boxcolor1 color : " + Boxcolor1.color);
        System.out.println();
        
        vol = Boxcolor2.volume();
        System.out.println("volume of Boxcolor2 is " + vol);
        System.out.println("weight of Boxcolor12 is " + Boxcolor2.weight);
        System.out.println("Boxcolor12 cost : $" + Boxcolor2.cost);
        System.out.println("Boxcolor12 color : " + Boxcolor2.color);
        System.out.println();
    }
    
}
