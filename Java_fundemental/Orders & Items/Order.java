import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

    public Order(String name){
        this.name=name;
        this.total=0.0;
        this.ready=false;
    

    }
    public void add(Item item, int number){
        for(int i = 0; i < number; i++){
            this.items.add(item);
            this.total+=item.price;

    }
}
}

// to add item to the order list