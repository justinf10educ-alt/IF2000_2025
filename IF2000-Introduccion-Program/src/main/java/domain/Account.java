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
    
    //Atributes
  
  private String accountNumber;
  private double balance;
  private Person client;

    public Account() {
    }

    public Account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
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

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
    
    //------------------------------------
    //Methods for polimorfism
    //------------------------------------
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();

    @Override
    public String toString() {
        String result = "\nBANK ACCOUNT INFORMATION:"
                +"\n--------------------------------------"
                +"\nAccount Number:" + this.getAccountNumber()
                +"\nBalance: " + this.getBalance()
                +"\nAccount Owner:\n "+ this.getClient().toString()
                +"\n ";
        
        return result;
        
    }//enToString
    
        
}//endClass
