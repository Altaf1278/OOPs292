package com.bridgelabz.oops;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount = new Account(2000.0);
        Account yourAccount1 = new Account(500.0);

        System.out.println("Initial balance of myAccount is : "+myAccount.getBalance());
        System.out.println("Initial balance of yourAccount is : "+yourAccount1.getBalance());

        // Credit Method:
        myAccount.credit(500.0);
        yourAccount1.credit(500.0);
        System.out.println("Initial balance of myAccount is : "+myAccount.getBalance());
        System.out.println("Initial balance of yourAccount is : "+yourAccount1.getBalance());

        //Debit Method:
        myAccount.debit(100.0);
        yourAccount1.credit(200.50);
        System.out.println("Initial balance of myAccount is : "+myAccount.getBalance());
        System.out.println("Initial balance of yourAccount is : "+yourAccount1.getBalance());

    }
}
