import java.util.Scanner;

public class Calculator {

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public static long multiply(int n1, int n2) {
        return (long) n1 * n2;
    }

    public static float divide(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return (float) n1 / n2;
    }

    public static int modulus(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n0. Exit");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();

            if (choice == 0) break;
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            int n1 = scan.nextInt();
            System.out.print("Enter second number: ");
            int n2 = scan.nextInt();

            System.out.print("Result: ");
            switch (choice) {
                case 1 -> System.out.println(add(n1, n2));
                case 2 -> System.out.println(subtract(n1, n2));
                case 3 -> System.out.println(multiply(n1, n2));
                case 4 -> System.out.println(divide(n1, n2));
                case 5 -> System.out.println(modulus(n1, n2));
            }
        }
        scan.close();
    }
}
