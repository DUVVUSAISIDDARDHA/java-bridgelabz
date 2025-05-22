package com.bridgelabz.inheritance;

class BankAccount{
    private int accountNumber;
    private float balance;

    public BankAccount(int accountNumber, float balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void displayDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends BankAccount{
    private float interestRate;

    public SavingsAccount(int accountNumber, float balance, float interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    public void displayAccountType(){
        System.out.println("\nSavings Account Details");
        System.out.println("Interest rate: "+interestRate);
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(1, 1000, 5);
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();

        CheckingAccount checkingAccount=new CheckingAccount(1, 1000, 10000);
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();

        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount(1, 1000, 3);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
