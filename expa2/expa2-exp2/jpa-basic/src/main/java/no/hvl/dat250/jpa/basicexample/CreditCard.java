package no.hvl.dat250.jpa.basicexample;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private int limit;
    private int balance;
    private PinCode pinCode;

    @ManyToOne
    private Bank bank;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int description) {
        this.limit = description;
    }

    public int getBalance() {
        return balance;
    }

    public void getBalance(int balance) {
        this.balance = balance;
    }

    public PinCode getPinCode() {
        return pinCode;
    }

    public void setPinCode(PinCode pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "CreditCard [number=" + number + ", limit=" + limit
                + " balance=" + balance + "]";
    }

}
