package coursework2.pkg1;

import static sun.rmi.transport.TransportConstants.Return;

/**
 *
 * @author M00609897
 */
public class BankAccount {

    private long accountNo;
    private double accountBalance;

    public BankAccount(long accountNo, double accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public long getAccountNo() {
        return this.accountNo;
    }

    public double getAccountBalance(double value, String n) {
        
        return this.accountBalance;
    }

    public synchronized void deposit(double value, String n) //Syncronized-Non-Synchronized
    {
        System.out.println("user " + n + " deposits " + value);
        this.accountBalance += value;
        System.out.println("The Current Account Balance is " + accountBalance);
        
    }

    public synchronized void withdraw(double value, String n)//Syncronized-Non-Synchronized
    {
        System.out.println("user " + n + " withdraws " + value);
       
         this.accountBalance -= value;
         System.out.println("The Current Account Balance is " + accountBalance);
        }
        
    }


