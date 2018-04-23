package com.darshitpanchal;

public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    /*
        Creating a constructor.
        Constructor only has access modifier, name of class and parameters. No return type.
        Purpose of constructor is to initialise an object and do whatever we want
        at the time of creation of object only.

        Like methods, constructors can be overloaded.
        We can call one constructor from the another constructor using "this".
        Keep in mind, if you use "this" to call another constructor then "this" statement must be the very first line.
        We can use "setter" in "Constructor : BankAccount". It will be useful if we have any validations to check while setting values.
        But it is always better to assign the values to "fields" in constructor directly without using "setter".

        Another reason not to use any other "method" in "Constructors" is that "Constructor" is the
        initial phase of initialisation so all initialisation may not be completed at that point of time when another "method" is called.
    */

    public BankAccount(){
        this("5678", 2.50, "Default", "default@default.com",
                "1234567899");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName,
                       String customerEmail, String customerPhoneNumber){

        System.out.println("BankAccount constructor with parameters called.");

        this.accountNumber = accountNumber; // Can also use setter "setAccountNumber(accountNumber)".
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // Can also use Constructor like below by defaulting some values and using other values from parameters.

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {

        this("999", 25.25, customerName, customerEmail, customerPhoneNumber);

    }

    public void deposit(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. " +
                "New balance is " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.accountBalance - withdrawalAmount < 0){
            System.out.println("Only " + this.accountBalance + " available. " +
                    "Withdrawal not processed.");
        }else{
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. " +
                    "Remaining balance " + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
