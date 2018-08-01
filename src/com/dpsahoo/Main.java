package com.dpsahoo;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Aus Bank");

        if (bank.addBranch("Adelaide") ) {
            System.out.println("Adelaied branch created");
        }

        bank.addCustomer("Adelaide", "Durga", 11.11);
        bank.addCustomer("Adelaide", "Prasad", 22.22);
        bank.addCustomer("Adelaide", "Sahoo", 33.50);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "dd", 44.44);
        bank.addCustomerTransaction("Adelaide", "Durga", 88.32);
        bank.addCustomerTransaction("Adelaide", "Sahoo", 5433.33);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melb");


        if (!bank.addCustomer("Melb", "ewew", 4343.22)){
            System.out.println("Error! Melb branch does not exist");
        }


    }
}
