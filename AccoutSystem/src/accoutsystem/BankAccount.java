/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accoutsystem;

/**
 *
 * @author user
 */
public class BankAccount extends Account{
    private String bankName;
    private double balance;
    BankAccount(int num,String name,String type,String bn,double bal)
    {
        super(num,name,type);
        bankName=bn;
        balance=bal;
    }
    
    public String getBankName()
    {
        return bankName;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
}
