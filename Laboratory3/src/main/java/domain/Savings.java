/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.time.LocalDate;

/**
 *
 * @author Justin Flores
 */


public class Savings extends Account {
    private LocalDate startDate;
    private int months;
    private double interestRate;

    public Savings(String number, double balance, Client owner,
                   LocalDate startDate, int months, double interestRate) {
        super(number, balance, owner);
        this.startDate = startDate;
        this.months = months;
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = months * getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }
}



