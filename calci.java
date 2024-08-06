import java.util.Scanner;

public class  calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter the operation: ");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error! Division by zero is not possible.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error! Division by zero is not possible.");
                }
                break;
            default:
                System.out.println("Error! Invalid operation.");
                break;
        }
    }
}
