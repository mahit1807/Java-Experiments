import java.util.Scanner;

public class ArithmeticOperations {
    public int num1, num2;

    public int addNums(int n1, int n2) {
        return n1 + n2;
    }

    public int subNums(int n1, int n2) {
        return n1 - n2;
    }

    public long mulNums(int n1, int n2) {
        return (long) n1 * n2;
    }

    public float divNums(int n1, int n2) {
        return (float) n1 / n2;
    }

    public int modNums(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {
        ArithmeticOperations op = new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        op.num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        op.num2 = scan.nextInt();

        System.out.println("Sum: " + op.addNums(op.num1, op.num2));
        System.out.println("Difference: " + op.subNums(op.num1, op.num2));
        System.out.println("Product: " + op.mulNums(op.num1, op.num2));
        System.out.println("Division: " + op.divNums(op.num1, op.num2));
        System.out.println("Modulus: " + op.modNums(op.num1, op.num2));

        scan.close();
    }
}
