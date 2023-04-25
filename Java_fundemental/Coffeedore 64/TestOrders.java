
public class TestOrders {
    public static void main(String[] args){
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("banana", 3.00);
        coffeeKiosk.addMenuItem("coffee", 5.50);
        coffeeKiosk.addMenuItem("latte", 2.50);
        coffeeKiosk.addMenuItem("capuccino", 2.00);
        coffeeKiosk.addMenuItem("muffin", 1.00);

        coffeeKiosk.newOrder();

    }
}