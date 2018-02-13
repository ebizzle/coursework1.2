
package coursework2.pkg1;


import static sun.rmi.transport.TransportConstants.Return;

/**
 *
 * @author M00609897
 */

 public class BankAccount 
{
    private long accountNo;
    private double accountBalance;

    public BankAccount(long accountNo, double accountBalance)
    {
      this.accountNo = accountNo;
      this.accountBalance = accountBalance;
    }

    

    public long getAccountNo()
    {
      return this.accountNo;
    }
    
    public double getAccountBalance()
    {
      return this.accountBalance;
    }

    public  void deposit(double value,String n) //Syncronized-Non-Synchronized
    {
        System.out.println("user "+n+" deposits " + value); 
     this.accountBalance += value; 
    }

    public boolean withdraw(double value,String n)//Syncronized-Non-Synchronized
    {
        System.out.println("user "+n+" withdraws " + value); 
        if (value > this.accountBalance){
            System.out.println("Insufficient Funds" );
            return false;
        }
        else {
            this.accountBalance -=value;
        }
        return false;
    }
      
}
 


