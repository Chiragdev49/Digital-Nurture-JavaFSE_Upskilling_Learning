import java.util.Scanner;

public class Q02_SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (x + y));
                break;

            case '-':
                System.out.println("Result: " + (x - y));
                break;

            case '*':
                System.out.println("Result: " + (x * y));
                break;

            case '/':
                if (y != 0) {
                    System.out.println("Result: " + (x / y));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}
