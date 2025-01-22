
import java.util.Scanner;

public class AtmTransaction {
    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 to exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Your money was successfully deposited.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Exiting.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println(); // Add a line break for better formatting
        }
    }
}