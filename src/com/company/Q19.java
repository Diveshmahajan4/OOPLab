package com.company;

public class Q19 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.set("John Doe", 123456, 5000.0);
        customer.display();
        customer.calculateInterest();
    }
}

interface Account {
    void set(String name, int accountNumber, double balance);
    void display();
}

interface PersonQ19 {
    void store();
    void disp();
}

class Customer implements PersonQ19, Account {
    private String name;
    private int accountNumber;
    private double balance;

    @Override
    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Details:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void store() {
    }

    @Override
    public void disp() {
    }

    public void calculateInterest() {
        double interest = balance * 0.05; // Assuming 5% interest rate
        System.out.println("Interest: " + interest);
    }
}
