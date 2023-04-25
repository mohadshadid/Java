import java.util.ArrayList;

public class CafeUtil {
    public static int getStreakGoal(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static double getOrderTotal(double[] prices){
        double total=0;
        for(Double item : prices){
            total=total+item;
            // The variable "total" will be set to 12.76, which is the sum of all the prices in the "prices" array
        }
        return total;
    }
    //In the line "for(Double item : prices)", "Double item" is the loop variable declaration, which declares a new variable called "item" of type Double. 
    //This variable will be assigned the value of each element in the "prices" array in turn
    
    // public static double getOrderTotal(double[] prices){
    //     double total=0;
    //     for(int i=0; i<prices.length; i++){
    //         double item = prices[i];
    //         total=total+item;
    //     }
    //     return total;
    // }
    
    public static void displayMenu(ArrayList<String> menuItems){
        int i=0;
        for(String item : menuItems){
            System.out.println(i+" "+item);
            i++;
        }
    }
//         The "+" operator is used to concatenate strings and variables together.
// The first part of the concatenated string is "i", which is an integer variable representing the index of the current menu item.
// The second part of the concatenated string is " ", which is a space character that separates the index from the menu item.
// The third part of the concatenated string is "item", which is a String variable representing the current menu item being printed.
// When the concatenated string is printed to the console using System.out.println(), it displays the index and menu item together on a single line, separated by a space.
// So, in summary, "i" is used to display the index of the menu item, and "item" is used to display the name of the menu item
    
    public static void addCustomer(ArrayList<String> customers){
        String userName="s";
        while(!userName.equals("q")) {
            System.out.println("Please enter your name:");
            userName = System.console().readLine();
            System.out.println("Hello, "+userName);
            int num = customers.size();
            // The size() method is a built-in method of the ArrayList class that is used to 
            // return the number of elements currently stored in the ArrayList.
            System.out.println(String.format("There are %d people in front of you", num));
            for(String item : customers){
                System.out.print(item+" | ");
            }
            customers.add(userName);
        }
    }
    public static void printPriceChart(String product, double price, int maxQuantity){
        double pricesum=0;
        System.out.println(product);
        for(int i=1;i<=maxQuantity;i++){
            pricesum=pricesum+price;
            System.out.println(String.format("%d - $%.2f",i,pricesum));
            // The %d placeholder is used to substitute an integer value (in this case, the value of the "i" variable),
            //  and the %.2f placeholder is used to substitute a floating-point value (in this case, the value of the "pricesum" variable) with two decimal places.
            pricesum-=0.5;
        }
    }
    public static boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        int i=0;
        for(String item : menuItems){
            System.out.println(i+" "+item+" $"+prices.get(i));
            i++;
        }
        return true;
    }
}
// In the context of the System.out.println() method call you provided, the "$" symbol is being used to separate 
// the "item" value and the price value in the resulting message string.
