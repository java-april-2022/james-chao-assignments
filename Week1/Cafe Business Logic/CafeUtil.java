import java.util.ArrayList;


public class CafeUtil{

    //Sum goal 
    public int getStreakGoal(int numweeks){
        int goal = 0;
        for(int i = 0; i <= numweeks; i++){
            goal = goal + i;
        }
        return goal;
    }

    // Sum prices in double array
    public double getOrderTotal(double[]prices){
        double total = 0;
        for(double price : prices){
            total = total + price;
        }
        return total;
    }

    //display menu
    public void displayMenu(ArrayList<String>menuItems){
        System.out.println(menuItems.toString());
    }

    //adding customer input and displaying list of customers in line
    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello %s, ", userName);
        System.out.printf("there are %x people in front of you\n", customers.size());
        customers.add(userName);
        System.out.println(customers.toString());
    }

    //print price for product up to max + the Sensei challenge
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.printf("%s", product);
        for(int i = 1; i <= maxQuantity; i++){
            System.out.printf("\n%s : $%.2f", i, ((i * price) - ((i - 1) * .50)));
        }
        System.out.println("\n");
    }
}