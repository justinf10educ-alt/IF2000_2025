/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Justin Flores
 */
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean hasAccount(Account account) {
        return accounts.contains(account);
    }

    public static void sinpe(Account from, Account to, double amount, Bank bankFrom, Bank bankTo) {
        if (bankFrom.hasAccount(from) && bankTo.hasAccount(to)) {
            if (from.getBalance() >= amount) {
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("SINPE Transfer completed: " + amount);
            } else {
                System.out.println("Insufficient funds for transfer");
            }
        } else {
            System.out.println("Invalid accounts for transfer");
        }
    }
}


