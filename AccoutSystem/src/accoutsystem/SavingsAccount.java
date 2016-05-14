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
public class SavingsAccount extends BankAccount{
    private double depositeAmount;
    private double withdrawalAmount;
    private int passbookNo;
    SavingsAccount(int num,String name,String type,String bn,double bal,double depam,double witam,int passN)
    {
        super(num,name,type,bn,bal);
        depositeAmount=depam;
        withdrawalAmount=witam;
        passbookNo=passN;
    }
    public double currentBal()
    {
        return (super.getBalance()+depositeAmount-withdrawalAmount);
    }
    public double returnAmount()
    {
        double interest=this.currentBal()*5*5/100;
        return this.currentBal()+interest;
    }
    
    public boolean charge()
    {
        if((super.getBalance()-withdrawalAmount)<500)
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
        System.out.println("Current Balance  : "+this.currentBal());
        
    }
}
