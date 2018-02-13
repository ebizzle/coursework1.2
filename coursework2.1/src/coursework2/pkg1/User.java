package coursework2.pkg1;

import java.util.ArrayList;

public class User extends Thread {

    private String name;
    private String surname;
    private BankAccount bankAccount;
    private ArrayList<Double> transactionList;

    public User(String n, String s, BankAccount bA, ArrayList tL) {
        this.name = n;
        this.surname = s;
        this.bankAccount = bA;
        this.transactionList = tL;
    }

    @Override
    public void run() {
        for (int e = 0; e < transactionList.size(); e++) {
            if (transactionList.get(e) <= 0) {
                bankAccount.withdraw(transactionList.get(e), this.name);
            }

            if (transactionList.get(e) > 0) {
                bankAccount.deposit(transactionList.get(e), this.name);
                
            }
            
          
        }
    }
}
