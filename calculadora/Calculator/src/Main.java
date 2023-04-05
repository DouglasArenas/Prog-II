import java.util.Scanner;

public class Main {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator App!");
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Perform a calculation");
            System.out.println("2. Exit");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                performCalculation();
            } else if (choice.equals("2")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void performCalculation() {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2;
            String operator;
            while (true) {
                System.out.println("Enter a number: ");
                num1 = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                System.out.println("Enter an operator (+, -, *, /): ");
                operator = scanner.nextLine();
                if (!Validator.isValidOperator(operator)) {
                    System.out.println("Invalid operator.");
                    continue;
                }
                System.out.println("Enter a number: ");
                num2 = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character
                if (!Validator.isValidNumber(num2)) {
                    System.out.println("Invalid number.");
                    continue;
                }
                double result = Operator.calculate(num1, num2, operator);
                System.out.println("Result: " + result);
                System.out.println("Do you want to perform another calculation? (y/n)");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        show();
    }
}
