/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accoutsystem;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AccoutSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //StudentAccount ob=new StudentAccount(106,"Arafat","Student","Part-Time","");
        int n;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        n=ob.nextInt();
        System.out.println("Enter Holer Name: ");
        String name=new Scanner(System.in).nextLine();
        System.out.println("Enter Holder Type: ");
        String type=new Scanner(System.in).nextLine();
        if(type.equals("Student"))
        {
            System.out.println("Enter Institute Name: ");
            String ins=new Scanner(System.in).nextLine();
            System.out.println("Enter Status: ");
            String stat=new Scanner(System.in).nextLine();
            StudentAccount obj=new StudentAccount(n,name,type,ins,stat);
            System.out.println("Students Account Number is: "+obj.getAccountNumber());
            System.out.println("Students Name             : "+obj.getHolderName());
            System.out.println("Institute Name            : "+obj.getInstitute());
            System.out.println("Students Status: "+obj.getStatus());
        }
        else if(type.equals("Bank"))
        {
            System.out.println("Enter Bank Name: ");
            String bname=new Scanner(System.in).nextLine();
            System.out.println("Enter Holders Balance: ");
            double bal=ob.nextDouble();
            System.out.println("Choose 'S' or 'B' or 'D' for Account type: ");
            String ch=new Scanner(System.in).nextLine();
            if(ch.equals("S"))
            {
                System.out.println("Enter Deposite Amount: ");
                double depam=ob.nextDouble();
                System.out.println("Enter Wtihdrawl Amount: ");
                double witam=ob.nextDouble();
                System.out.println("Enter Pass Book Number: ");
                int pbn=ob.nextInt();
                SavingsAccount sa=new SavingsAccount(n,name,type,bname,bal,depam,witam,pbn);
                sa.display();
                System.out.println("Total Balance: "+sa.returnAmount());
                if(sa.charge())
                {
                    System.out.println("Low Balance, Charge will be included");
                }
                else{
                    System.out.println("Balance OK,No charge will be included");
                }
            }
            else if(ch.equals("D"))
            {
                System.out.println("Enter Deposite Amount: ");
                double depam=ob.nextDouble();
                System.out.println("Enter Number of Checks: ");
                int cche=ob.nextInt();
                DepositAccount da=new DepositAccount(n,name,type,bname,bal,depam,cche);
                da.display();
                if(da.chePrivilage())
                {
                    System.out.println("You have exceeded monthly limit.");
                }
                System.out.println("Total Balance is: "+da.retAmount());
                if(da.cha())
                {
                    System.out.println("Low Balance, Charge will be included");
                }
            }
            else if(ch.equals("B"))
            {
                System.out.println("Enter Check Amount: ");
                double cheam=ob.nextDouble();
                System.out.println("Enter Number of Checks: ");
                int cche=ob.nextInt();
                System.out.println("Enter Check Book Number: ");
                int cbn=ob.nextInt();
                BasicAccount ba=new BasicAccount(n,name,type,bname,bal,cheam,cche,cbn);
                ba.display();
                if(ba.charge())
                {
                    System.out.println("You have exceeded monthly limit.");
                }
            }
            
            
        }
    }
    
}

