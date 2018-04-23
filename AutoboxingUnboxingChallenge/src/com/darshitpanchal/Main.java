package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National");

        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created!");
        }
        bank.addCustomer("Adelaide", "Darshit", 50.05);
        bank.addCustomer("Adelaide", "Nency", 100.25);
        bank.addCustomer("Adelaide", "Jainit", 80.05);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Dipen", 500.05);

        bank.addCustomerTransactions("Adelaide","Darshit",100.56);
        bank.addCustomerTransactions("Adelaide","Darshit",20.85);
        bank.addCustomerTransactions("Adelaide","Nency",-50);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "brian", 5.5)){
            System.out.println("Melbourne branch does not exists!");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists!");
        }

        if(!bank.addCustomerTransactions("Adelaide","Bhai", 50.05)){
            System.out.println("Customer does not exists!");
        }

        if(!bank.addCustomer("Adelaide","Darshit",60.23)){
            System.out.println("Customer already exists!");
        }
    }
}
