// BankAppNewEra.java
// Author: Chisom
// Description: A simple command-line banking simulator for beginners.
// Uses Scanner, if/else, variables, and math operations (no loops or methods yet).

import java.util.Scanner;

public class BankAppNewEra {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Welcome to BankAppNewEra ==========");
        
        // --- Step 1: Basic user info ---
        System.out.print("Enter your First Name: ");
        String userFirstName = scanner.nextLine();

        System.out.print("Enter your Last Name: ");
        String userLastName = scanner.nextLine();

        String userFullName = userFirstName + " " + userLastName;

        System.out.print("Enter your 4-digit Account Number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Set your 4-digit Account Password: ");
        int userAccountPassword = scanner.nextInt();

        // --- Step 2: Fixed starting balance ---
        int userCurrentBalance = 40000;  // Fixed starting balance ₦40,000
        int userPreviousBalance = userCurrentBalance;

        System.out.println("\n----------------------------------------------");
        System.out.println("Welcome, " + userFullName + "!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Your starting balance is ₦" + userCurrentBalance);
        System.out.println("----------------------------------------------");

        // --- Step 3: Choose a simple transaction ---
        System.out.println("Select an option below:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter option (1-3): ");
        int choice = scanner.nextInt();

        // --- Step 4: Perform selected transaction ---
        if (choice == 1) {
            // Deposit money
            System.out.print("Enter amount to deposit: ");
            int deposit = scanner.nextInt();
            userCurrentBalance = userCurrentBalance + deposit;
            System.out.println("\n✅ Deposit successful!");
        } 
        else if (choice == 2) {
            // Withdraw money
            System.out.print("Enter amount to withdraw: ");
            int withdraw = scanner.nextInt();

            if (withdraw <= userCurrentBalance) {
                userCurrentBalance = userCurrentBalance - withdraw;
                System.out.println("\n✅ Withdrawal successful!");
            } else {
                System.out.println("\n❌ Insufficient balance!");
            }
        } 
        else if (choice == 3) {
            System.out.println("\n💰 Balance check complete.");
        } 
        else {
            System.out.println("\n⚠️ Invalid option selected!");
        }

        // --- Step 5: Transaction summary receipt ---
        System.out.println("\n----------------------------------------------");
        System.out.println("Transaction Receipt — BankAppNewEra");
        System.out.println("Name: " + userFullName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Previous Balance: ₦" + userPreviousBalance);
        System.out.println("Current Balance: ₦" + userCurrentBalance);
        System.out.println("Thank you for banking with us 💳");
        System.out.println("----------------------------------------------");

        // Close scanner
        scanner.close();
    }
}