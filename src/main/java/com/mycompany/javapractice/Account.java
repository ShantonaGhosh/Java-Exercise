
package com.mycompany.javapractice;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
        private ArrayList<Transaction> transaction;
    
    public Account( int id, double balance,double annualInterestRate,Client client)
    {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;
        this.transaction = new ArrayList();
        dateCreated = new Date();
    }
    public boolean withdraw(double amount){
        if(balance <amount) return false;
        balance -= amount;
        this.transaction.add(new Transaction('W',amount,this.balance,"withdraw" +amount));
        return true;
    }
    
    public void deposit(double amount){
        balance +=amount;
         this.transaction.add(new Transaction('W',amount,this.balance,"deposite" +amount));
    }
    public int countTransection(char type){
        int count =0;
        for (Transaction transactions : transaction)
            if(transactions.getType()==type)
                count++;
        return count;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

   
      public String toString(){
      return  this.id + " " +this.balance +" " + this.annualInterestRate + " " + this.dateCreated + "\n";
    }
    
}
