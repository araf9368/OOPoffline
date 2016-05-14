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
public class BasicAccount extends BankAccount{
    private double checkAmount;
    private int countChecks;
    private int checkbookNo;
    BasicAccount(int num,String name,String type,String bn,double bal,double cheam,int cche,int cbn)
    {
        super(num,name,type,bn,bal);
        checkAmount=cheam;
        countChecks=cche;
        checkbookNo=cbn;
    }
    
    
    
    public boolean charge()
    {
        return (countChecks)>3;
    }
    void display()
    {
        System.out.println("Account Number   : "+super.getAccountNumber());
        System.out.println("Bank Name        : "+super.getBankName());
        System.out.println("Holders Name     : "+super.getHolderName());
        System.out.println("Current Balance  : "+super.getBalance());
        
    }
    
}
