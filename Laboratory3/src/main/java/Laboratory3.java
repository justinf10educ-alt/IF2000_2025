/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Justin Flores
 */
import domain.*;
import java.time.LocalDate;

public class Laboratory3 {

    public static void main(String[] args) {

        Client c1 = new Client("Ana",  "1", "8888-8888", "San José");
        Client c2 = new Client("Luis", "2", "9999-9999", "Heredia");

        Bank bank1 = new Bank("Banco Nacional");
        Bank bank2 = new Bank("Banco de Costa Rica");

        Savings  acc1 = new Savings("A001", 1000, c1, LocalDate.now(), 6, 0.02);
        Checking acc2 = new Checking("C001",  500, c2, 0.01);

        bank1.addAccount(acc1);
        bank2.addAccount(acc2);

        LogBook log = new LogBook();

        acc1.deposit(200);
        log.addEvent("Deposit", acc1);

        acc1.calculateInterest();
        log.addEvent("Interest Applied", acc1);

        Bank.sinpe(acc1, acc2, 300, bank1, bank2);
        log.addEvent("SINPE Transfer (From)", acc1);
        log.addEvent("SINPE Transfer (To)",   acc2);

        log.showEvents();
    }
}


