import java.util.*;
class Bank {
    private static int accountCounter = 1000;
    private String name;
    private String address;
    private int accountNumber;
    private double balance;

    // Constructor to initialize depositor's info and generate unique account number
    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = ++accountCounter;
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Display depositor info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name          : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Balance       : ₹" + balance);
    }

    // Deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Change address
    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated successfully.");
    }
}
public class qs10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Bank> customers = new ArrayList<>();

        System.out.print("Enter number of depositors: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input all customer info
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter info for depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Initial Balance: ₹");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline
            customers.add(new Bank(name, address, balance));
        }

        // Menu-driven operations
        while (true) {
            System.out.println("\n====== BANK MENU ======");
            System.out.println("1. Display depositor info");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Change address");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); // Consume newline

            Bank current = null;
            for (Bank b : customers) {
                if (b.getAccountNumber() == accNo) {
                    current = b;
                    break;
                }
            }

            if (current == null) {
                System.out.println("Invalid account number.");
                continue;
            }

            switch (choice) {
                case 1:
                    current.displayInfo();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    sc.nextLine();
                    current.deposit(dep);
                    current.displayInfo();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wth = sc.nextDouble();
                    sc.nextLine();
                    current.withdraw(wth);
                    current.displayInfo();
                    break;
                case 4:
                    System.out.print("Enter new address: ");
                    String newAddr = sc.nextLine();
                    current.changeAddress(newAddr);
                    current.displayInfo();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
        System.out.println("Thank you for using the Bank Application!");
    }
}
