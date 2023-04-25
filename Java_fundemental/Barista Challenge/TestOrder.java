public class TestOrder {
    public static void main(String[] args){

        // Menu items
        item item1 = new item("drip coffee", 3);
        item item2 = new item("capuccino", 8);
        item item3 = new item("iced coffee", 4);
        item item4 = new item("mocha", 1.00);

        // 2 unspecified orders
        Order order1 = new Order();
        Order order2 = new Order();

        // 3 named orders
        Order order3 = new Order("shadid");
        Order order4 = new Order("husam");
        Order order5 = new Order("mahdi");

        // Add 2 items to each order and call display after
        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);

        // Test status
        System.out.println(order5.getStatusMessage());
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        // Test order total
        System.out.println(order5.getOrderTotal());
        order5.display();
    }
}