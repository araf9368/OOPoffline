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
public class Account {
    private int accountNumber;
    private String holderName;
    private String holderType;
    
    Account(int accN,String str,String type)
    {
        accountNumber=accN;
        holderName=str;
        holderType=type;
    }
   
    public int getAccountNumber()
    {
        return accountNumber;
    }
   
    
    public String getHolderName()
    {
        return holderName;
    }
   
    
    public String getHolderType()
    {
        return holderType;
    }
    
}
