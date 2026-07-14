package Assignment2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter num1:");
            int num1 = input.nextInt();
            System.out.println("Enter num2:");
            int num2 = input.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " is greater");
            } else if (num2 > num1) {
                System.out.println(num2 + " is greater");
            } else {
                System.out.println("Both the numbers are equal");
            }
        }
    }
}
