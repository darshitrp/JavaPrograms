package com.darshitpanchal;

public class Main {

    public static void main(String[] args) {

        // Chapter Exercise Method Calling

        /*BankAccount bobsAccount = new BankAccount("12345", 0.00, "Darshit",
                "drpanc@yahoo.com", "9909155643");*/

        BankAccount bobsAccount = new BankAccount();

        /*
            Setting the initial field values for "Class : BankAccount".
            Now if there are large number of fields then there will be a lot of typing.
            There is also another way of doing this,
            is when you are creating the object for the first time using class i.e using constructors.
            When you are typing " new NameOfClass()" you are actually calling a constructor.

            No need to set below values as it is already done by "Constructor : BankAccount".

            bobsAccount.setAccountBalance(0.00);
            bobsAccount.setAccountNumber("12345");
            bobsAccount.setCustomerEmail("abc@abc.com");
            bobsAccount.setCustomerName("Abc Abc");
            bobsAccount.setCustomerPhoneNumber("1234567890");
        */

        // Fields initialised by "Constructor : BankAccount" called.
        System.out.println("AccountNumber : " + bobsAccount.getAccountNumber());
        System.out.println("AccountBalance : " + bobsAccount.getAccountBalance());
        System.out.println("CustomerName : " + bobsAccount.getCustomerName());
        System.out.println("CustomerEmail : " + bobsAccount.getCustomerEmail());
        System.out.println("CustomerPhoneNumber : " + bobsAccount.getCustomerPhoneNumber());

        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.00);

        BankAccount darshAccount = new BankAccount("Darsh", "darsh@darsh.com", "5454545454");
        System.out.println("AccountNumber : " + darshAccount.getAccountNumber());
        System.out.println("AccountBalance : " + darshAccount.getAccountBalance());
        System.out.println("CustomerName : " + darshAccount.getCustomerName());
        System.out.println("CustomerEmail : " + darshAccount.getCustomerEmail());
        System.out.println("CustomerPhoneNumber : " + darshAccount.getCustomerPhoneNumber());

        // Chapter 2 Exercise method calling

        VipCustomer defCons = new VipCustomer();
        System.out.println("Name : " +defCons.getName());
        System.out.println("Credit Limit : "+defCons.getCreditLimit());
        System.out.println("Email : "+defCons.getEmail());

        VipCustomer secCons = new VipCustomer("Dipen", "dipen@dipen.com");
        System.out.println("Name : " +secCons.getName());
        System.out.println("Credit Limit : "+secCons.getCreditLimit());
        System.out.println("Email : "+secCons.getEmail());

        VipCustomer thirdCons = new VipCustomer("Jainit", 5555, "jainit@jainit.com");
        System.out.println("Name : " +thirdCons.getName());
        System.out.println("Credit Limit : "+thirdCons.getCreditLimit());
        System.out.println("Email : "+thirdCons.getEmail());

    }
}
