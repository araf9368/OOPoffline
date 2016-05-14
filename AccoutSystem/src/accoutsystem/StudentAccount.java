/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accoutsystem;

//import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author user
 */
public class StudentAccount extends Account{
    private String institute;
    private String status;
    
    
    StudentAccount(int num,String name,String type,String ins,String stat)
    {
        super(num,name,type);
        institute=ins;
        status=stat;
    }
    
    
    public String getInstitute()
    {
        return institute;
    }
    
    public String getStatus()
    {
        return status;
    }
}
