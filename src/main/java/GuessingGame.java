import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        boolean cheese = true;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int big = rand.nextInt(100)+ 1;
        do{
            System.out.println("I am thinking of a number 1-100");
            int num = sc.nextInt();
            if (num < big){
                System.out.println("Too Low, Try again: ");
            }
            else if (num > big){
                System.out.println("To High, Try again: ");
            }
            else if (num == big) {
                System.out.println("Correct");
                cheese = false;
            }
        }
        while(cheese);


    }
}
