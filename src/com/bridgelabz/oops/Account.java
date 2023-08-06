package com.bridgelabz.oops;

public class Account implements AccountInterface {
    private double balance;
    public Account(double initialBalance){
        if (initialBalance >=0.0){
            balance = initialBalance;
        }
    }

    @Override
    public void credit(double amount) {
        if (amount>0.0){
            balance +=amount;
        }
    }

    @Override
    public void debit(double amount) {
        if (amount<=balance){
            balance -= amount;
        }
        else {
            System.out.println("Debit amount exceeded the acoount balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
