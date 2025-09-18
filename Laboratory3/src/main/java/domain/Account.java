/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Justin Flores
 */
public abstract class Account {

    private String accountNumber;
    private double balance;
    private Client accountHolder;

    public Account(String accountNumber, double balance, Client accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(Client accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    public abstract void calculateInterest(); 

    @Override
    public String toString() {
        return "\nBANK ACCOUNT INFORMATION:"
                + "\n--------------------------------------"
                + "\nAccount Number: " + accountNumber
                + "\nBalance: " + balance
                + "\nAccount Holder: " + accountHolder.getName()
                + "\n";
    }
}
