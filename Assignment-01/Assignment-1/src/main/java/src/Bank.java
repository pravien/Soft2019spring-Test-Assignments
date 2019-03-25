package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pravien
 */
public class Bank {
    
    public double calculateYearlyInterest(Account account){
        double balance = account.getBalance();
        
        if(balance > 0  && balance<100) return balance*0.03;
        else if(balance >= 100 && balance <1000) return balance*0.05;
        else if (balance >= 1000) return 0.07*balance;
        else return 0;
    }
}
