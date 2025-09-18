/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Justin Flores
 */
public class Checking extends Account {
    private double interestRate;

    public Checking(String number, double balance, Client owner, double interestRate) {
        super(number, balance, owner);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = (getBalance() * interestRate) / 12;
        setBalance(getBalance() + interest);
    }
}


