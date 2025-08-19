import java.util.*;

public class Restaurant {
    public static void order(String[] args){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to CMR Restaurant");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hey " + name
                + ", What would you like to have?\n1. Dal Fry - 40\n2. Paneer Butter Masala - 100\n3. Chicken Curry - 120\n4. Fish Fry - 100\n5. Tomato Curry - 30");

        System.out.print("Select from the menu: ");
        int order = sc.nextInt();

        System.out.print("Please enter quantity: ");
        int qty = sc.nextInt();

        int bill = 0;

        switch (order) {
            case 1:
                System.out.println("You selected Dal Fry, Pay " + (40 * qty));
                bill = 40 * qty;
                break;
            case 2:
                System.out.println("You selected Paneer Butter Masala, Pay " + (100 * qty));
                bill = 100 * qty;
                break;
            case 3:
                System.out.println("You selected Chicken Curry, Pay " + (120 * qty));
                bill = 120 * qty;
                break;
            case 4:
                System.out.println("You selected Fish Fry, Pay " + (100 * qty));
                bill = 100 * qty;
                break;
            case 5:
                System.out.println("You selected Tomato Curry, Pay " + (30 * qty));
                bill = 30 * qty;
                break;
            default:
                break;
        }
        int amtpaid = sc.nextInt();
        if (amtpaid == bill) {
            System.out.println("Order Placed, Kindly Wait");
        } else {
            System.out.println("Invalid Amount");
        }

        sc.close();
    }
}