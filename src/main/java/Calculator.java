import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Scientific Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Sin");
            System.out.println("8. Cos");
            System.out.println("9. Tan");
            System.out.println("10. Log");
            System.out.println("11. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 11) {
                System.out.println("Exiting...");
                break;
            }

            double a, b, result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a + b;
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a - b;
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a * b;
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0)
                        result = a / b;
                    else {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    break;

                case 5:
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = Math.pow(a, b);
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    result = Math.sqrt(a);
                    break;

                case 7:
                    System.out.print("Enter angle (in degrees): ");
                    a = sc.nextDouble();
                    result = Math.sin(Math.toRadians(a));
                    break;

                case 8:
                    System.out.print("Enter angle (in degrees): ");
                    a = sc.nextDouble();
                    result = Math.cos(Math.toRadians(a));
                    break;

                case 9:
                    System.out.print("Enter angle (in degrees): ");
                    a = sc.nextDouble();
                    result = Math.tan(Math.toRadians(a));
                    break;

                case 10:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    result = Math.log10(a);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}