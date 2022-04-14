
import java.util.ArrayList;
// Here we're creating a new data type
// called Order 

public class Order {

    // MEMBER VARIABLES
    private String name; // default value is null
    private boolean ready; // default value false
    public ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this("Guest");
    }

    public Order(String name){
        this.name = name;
    }

    // adding accessors and mutators aka getters and setters

    public String getName(){
        return name;
    }

    public boolean getReady(){
        return ready;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }
    
    // class methods
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
    if(this.ready) {
        return "Your order is ready.";
        } else {
    return  "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
            System.out.println("Total: $" + this.getOrderTotal());
        }
}
    

