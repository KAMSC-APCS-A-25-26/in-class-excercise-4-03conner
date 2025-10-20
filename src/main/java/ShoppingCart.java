import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.print("How many items are you purchasing?: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double value =0;
        for(int i = 0; i < num; i++){
            System.out.print("Price of item " + (i + 1) + "? ");
            double cheese = sc.nextDouble();
            value = value + cheese;
        }
        System.out.println("Your cart has " + num + " items with a total cost of $" + value);
    }
}
