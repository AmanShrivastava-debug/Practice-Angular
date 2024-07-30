import java.util.Scanner;

public class InsuranceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nInsurance Application Menu:");
            System.out.println("1. Premium Calculation");
            System.out.println("2. Maturity Amount Calculation");
            System.out.println("3. Convert Policy Details to Upper Case");
            System.out.println("4. Convert Policy Details to Lower Case");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            // Read user choice
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-5).");
                continue;
            }

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    calculatePremium(scanner);
                    break;
                case 2:
                    calculateMaturityAmount(scanner);
                    break;
                case 3:
                    convertToUpperCase(scanner);
                    break;
                case 4:
                    convertToLowerCase(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    scanner.close(); // Close scanner before exiting
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
            }
        }
    }

    // Method to calculate premium based on age and sum assured
    private static void calculatePremium(Scanner scanner) {
        try {
            System.out.print("Enter customer's age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter sum assured: ");
            double sumAssured = Double.parseDouble(scanner.nextLine());

            double premium;
            if (age < 25) {
                premium = 0.05 * sumAssured;
            } else if (age >= 25 && age <= 40) {
                premium = 0.10 * sumAssured;
            } else {
                premium = 0.20 * sumAssured;
            }

            System.out.println("Premium calculated: $" + premium);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age and sum assured.");
        }
    }

    // Method to calculate maturity amount based on premium, term, and interest rate
    private static void calculateMaturityAmount(Scanner scanner) {
        try {
            System.out.print("Enter insurance premium: ");
            double premium = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter policy term (in years): ");
            int term = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter annual interest rate (%): ");
            double interestRate = Double.parseDouble(scanner.nextLine());

            double maturityAmount = premium * term * (1 + interestRate / 100);
            System.out.println("Maturity amount: $" + maturityAmount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid premium, term, and interest rate.");
        }
    }

    // Method to convert policy details to upper case
    private static void convertToUpperCase(Scanner scanner) {
        System.out.print("Enter policy details: ");
        String policyDetails = scanner.nextLine();

        String upperCaseDetails = policyDetails.toUpperCase();
        System.out.println("Policy details in upper case: " + upperCaseDetails);
    }

    // Method to convert policy details to lower case
    private static void convertToLowerCase(Scanner scanner) {
        System.out.print("Enter policy details: ");
        String policyDetails = scanner.nextLine();

        String lowerCaseDetails = policyDetails.toLowerCase();
        System.out.println("Policy details in lower case: " + lowerCaseDetails);
    }
}
