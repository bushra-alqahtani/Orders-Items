import java.util.ArrayList;
import java.util.Arrays;
public class TestOrders {
    public static void main(String[] args) {
    
        //Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.
        //Set the price and the name for each -- "mocha", "latte", "drip coffee" and "capuccino" (price is up to you!)
        Item item1=new Item();
        item1.name="mocha";
        item1.price=13;

        Item item2=new Item();
         item2.name="latte";
        item2.price=22;

        Item item3=new Item();
         item3.name="drip coffee";
        item3.price=10;

        Item item4=new Item();
         item4.name="capuccino";
        item4.price=12;
    
        // Order variables -- order1, order2 etc.
        // Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.
        // Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".
        Order order1=new Order();
        order1.name="Cindhuri";
        

        Order order2=new Order();
        order2.name="Jimmy";
        
        order2.items.add(item1);
        order2.total += item1.price;


        Order order3=new Order();
        order3.name="Noah";
        order3.items.add(item4);
        order3.total +=item4.price;

        Order order4=new Order();
        order4.name="Sam";

        order4.items.add(item2);
        order4.total += item2.price*2;


        order1.ready=true;
        order4.ready=true;
        order2.ready=true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        
        System.out.println("_____________________________");
        
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.println("_____________________________");
        
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        
        System.out.println("_____________________________");
        
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}