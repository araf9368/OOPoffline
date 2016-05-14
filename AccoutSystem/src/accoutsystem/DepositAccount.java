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
public class DepositAccount extends BankAccount{
    private double depositAmount;
    private int countChecks;
    
    DepositAccount(int num,String name,String type,String bn,double bal,double depam,int cche)
    {
        super(num,name,type,bn,bal);
        depositAmount=depam;
        countChecks=cche;
    }
    
    public double currentBalance()
    {
        return (getBalance())+depositAmount;
    }
    public double retAmount()
    {
        if(this.currentBalance()>=10000)
        {
            double interest=this.currentBalance()*5*5/100;
            double tot=this.currentBalance()+interest;
            return tot;
        }
        else{
            return this.currentBalance();
        }
    
    }
    
    public boolean chePrivilage()
    {
        if(countChecks>3)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean cha()
    {
        if(getBalance()<8000)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    void display()
    {
        System.out.println("Account Number   : "+super.getAccountNumber());
        System.out.println("Bank Name        : "+super.getBankName());
        System.out.println("Holders Name     : "+super.getHolderName());
        System.out.println("Current Balance  : "+this.currentBalance());   
        //System.out.println("Deposite Amount  : "+);   
    }
    
}
