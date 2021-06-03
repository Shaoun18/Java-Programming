import java.util.Scanner;
public class Cake {

    String type;
    double quantity;
    int price;
    boolean ready;
    boolean sold;

    Cake(String t,double q,int p, boolean r, boolean s){
        type = t;
        quantity =q;
        price = p;
        ready = r;
        sold = s;
    }
    public void showData(){
        System.out.println("Type: "+ type);
        System.out.println("Quantity: "+quantity+"KG");
        System.out.println("Price: $"+ price );
        System.out.println("Ready: "+ ready );
        System.out.println("Sold: "+ sold );
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Cake arr[];

        int n = 2;
        arr = new Cake[n];

        System.out.println("Enter cake data:");
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Type: ");
            String t = sc.nextLine();
            System.out.println("Quantity: ");
            double q = sc.nextDouble();
            System.out.println("Price: ");
            int p = sc.nextInt();
            System.out.println("Ready(true/false): ");
            boolean r = sc.nextBoolean();
            System.out.println("Sold(true/false): ");
            boolean s = sc.nextBoolean();
            
            arr[i] = new Cake(t,q,p,r,s);
            System.out.println("\n");
        }
        sc.close();

        int totalPrice = 0;
        for(int i = 0; i < n; i++){
            totalPrice += arr[i].price;
        }
        System.out.println("Total price of all cakes: $"+totalPrice);

        double totalQuantity=0;
        totalPrice=0;
        for(int i=0;i<n;i++){
            if(arr[i].ready == true && arr[i].sold == true){
                totalPrice += arr[i].price;
                totalQuantity +=arr[i].quantity;
            }
        }
        System.out.println("Total price & quantiy of all ready sold cakes: "+"\nPrice: $"+totalPrice+"\nQuantity: "+totalQuantity+"KG\n");

        int highest=0;
        int highIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i].sold == true){
                if(arr[i].price>= highest){
                    highest = arr[i].price;
                    highIndex = i;
                }
            }

        }
        arr[highIndex].showData();
    }   
}
