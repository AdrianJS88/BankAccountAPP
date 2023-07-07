package org.example;

public class Checking extends Account {
     //List properties specific to a checking account
     private int debitCardNumber;
    private int getDebitCardPIN;
    //constructor to initialize checking account properties

    public Checking (String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2"+ accountNumber ;
        setDebitCard();

    }
    @Override
    public void setRate(){
       rate = getBaseRate() * .15;


    }
     //list any methods specific to the checking account
    public void setDebitCard(){
        debitCardNumber=(int)(Math.random()* Math.pow(10,12));
        getDebitCardPIN=(int)(Math.random()* Math.pow(10,4));

    }
public void showInfo(){
        super.showInfo();
    System.out.println("Your Checking  Account Features" +
            "\n Debit Card Number: " + debitCardNumber
            +
            "\n Debit Card Pin: " + getDebitCardPIN);
}

}