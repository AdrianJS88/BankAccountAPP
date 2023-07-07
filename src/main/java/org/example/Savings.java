package org.example;

public class Savings extends Account{
//list properties to the savings account
private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //constructor to initialize settings for the savings properties
    public Savings(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void  setSafetyDepositBox(){
        safetyDepositBoxID=(int) (Math.random() * Math.pow(10,3));
    safetyDepositBoxKey=(int) (Math.random() * Math.pow(10,4));
}

    //list any methods specific to savings account
    public void showInfo(){

        super.showInfo();
        System.out.println("Your Savings Account Features" +
                "\n Safety deposit Box ID: " + safetyDepositBoxID
                +
                "\n Safety deposit Box Key: " + safetyDepositBoxKey);
    }
}
