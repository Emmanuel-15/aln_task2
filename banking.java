package test;

class Customer {
    private String name;
    private int accountNumber;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}

class Account {
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class banking {
    public static void main(String[] args) {
        // Create a customer
        Customer customer1 = new Customer("John snow", 123098745);

        // Create an account for the customer
        Account account1 = new Account(12345, customer1);

        // Deposit money
        account1.deposit(1000);

        // Withdraw money
        account1.withdraw(500);

        // Print account balance
        System.out.println("Account balance: " + account1.getBalance());

        // Print customer information
        System.out.println("Customer Name: " + account1.getCustomer().getName());
        System.out.println("Customer Account Number: " + account1.getCustomer().getAccountNumber());
    }
}
