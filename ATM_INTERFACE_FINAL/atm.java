package ATM_INTERFACE_FINAL;
import java.util.Scanner;

    // Class to represent a bank account......
class BankAccount {
    private double balance; 

      //Initialize account balance...
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    // Method to withdraw money from the account.....
    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance)
         {
            balance -= amount;  // Deduct amount from balance....
            return true;       // Return true if withdrawal is successful...
        }
        return false;          // Return false if withdrawal fails.....
    }

     // Method to deposit money into the account.........
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount; 
        }
    }

     // Method to get the current account balance......
    public double getBalance() 
    {
        return balance;
    }
}

    // Class to represent an ATM......
class ATM {
    private BankAccount userAccount;   // Variable to store user's bank account....
    private Scanner scanner; 

      // Constructor to initialize ATM with a bank account.....
    public ATM(BankAccount account) 
    {
        this.userAccount = account;
        this.scanner = new Scanner(System.in);
    }

    // ATM interface.........
    public void run() {
        System.out.println("Welcome to the ATM!");
        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1: Withdraw");
            System.out.println("2: Deposit");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();    //user input.......

            //user's choice..........
            switch (choice) 
            {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;  // Exit program.....
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

     // Method to handle withdrawal...........
    private void withdraw() 
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble(); 

        if (userAccount.withdraw(amount)) 
        {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

       // Method to handle deposit...........
    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        userAccount.deposit(amount);
        System.out.println("Deposit successful.");
    }

    // Method to check balance.............
    private void checkBalance() 
    {
        double balance = userAccount.getBalance(); 
        System.out.println("Current balance: " + balance);
    }

    
    public void closeScanner() {
        scanner.close();           // Close the scanner.......
    }

    // Main method to run the ATM.........
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Create account with initial balance...
        ATM atm = new ATM(account);      // Create ATM with bank account....
        atm.run();            // Start ATM interface...........
        atm.closeScanner();       // Close the scanner..........
    }
}
