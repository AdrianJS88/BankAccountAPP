package org.example;

import java.util.LinkedList;
import java.util.List;



public class BankAccountAPP {
    public static void main(String[] args) {
          List<Account> accounts = new LinkedList<Account>();



//        Checking chkacc1 = new Checking("POP SIMION " ,"456789123",1500);
//        Savings savacc1 = new Savings("Bill Gates","987654321",2500);
//
//
//        savacc1.showInfo();
//        System.out.println("*****************************");
//        chkacc1.showInfo();

        //read a csv file then create new accounts based on that data
        String file = "C:\\Users\\Adi\\OneDrive\\Escritorio\\NewBankAccounts.csv";
        List <String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //  System.out.println(name + " " + sSN + " " + accountType + " $ " + initDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                System.out.println("OPEN A Checking ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READ ACCOUNT TYPE");
            }


            for (Account acc : accounts) {
                System.out.println("*****************");
               acc.showInfo();
            }
        }
    }
}
