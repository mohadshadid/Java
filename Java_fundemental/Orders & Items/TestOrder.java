
    import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("Coffee",4.5);
        Item item2 = new Item("Latte",2.5);
        Item item3 = new Item("Drip Coffee",1.5);
        Item item4 = new Item("Capuccino",9);

        
        // Cindhuri", "Jimmy", "Noah", "Sam
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimy");
        Order order3 = new Order("noah");
        Order order4 = new Order("sam");

        System.out.println(order1);
        System.out.println(order1.total);

        order2.items.add(item1);
        order2.total+=item1.price;
        System.out.println(order2.total);

        order3.items.add(item4);
        order3.total+=item4.price;
        System.out.println(order3.total);

        order4.items.add(item2);
        order4.total+=item2.price;
        System.out.println(order4.total);

        order1.ready=true;

        order4.add(item2,2);
        System.out.println(order4.items);
        System.out.println(order4.total);

        order2.ready=true;



        
    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}


