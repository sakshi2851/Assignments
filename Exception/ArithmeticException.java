package Exception;
import java.util.Scanner;
public class ArithmeticException{
    public static void main(String[] args) {
        Scanner scanner = null;
        System.out.println("Main method start.. ");
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter the Dividend number");
            int dividend = scanner.nextInt();
            System.out.println("Enter the Divisior number: ");
            int divisior = scanner.nextInt();
            int result = dividend / divisior;
            System.out.println("Result is " + result);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Divide by 0");
            e.printStackTrace();
        }

        System.out.println("Main method ends.");

    }
}

