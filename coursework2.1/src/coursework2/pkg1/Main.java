

package coursework2.pkg1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author M00609897
 */
public class Main  {

    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount(987654321L,1980.0);
        
        //Creating an Arraylist
        ArrayList<User> customer = new ArrayList<>();
        ArrayList<Double> user_transaction1 = new ArrayList<>();
        ArrayList<Double> user_transaction2 = new ArrayList<>();
        ArrayList<Double> user_transaction3 = new ArrayList<>();
        ArrayList<Double> user_transaction4 = new ArrayList<>();
        
        //Arraylist with transaction patterns
        user_transaction1.addAll(Arrays.asList(50.0,10.0,-20.0,10.0,-20.0,20.0,10.0,50.0,-10.0,10.0,-10.0,50.0));
        user_transaction2.addAll(Arrays.asList(20.0,20.0,-20.0,50.0,-20.0,10.0,50.0,50.0,-20.0,10.0,10.0));
        user_transaction3.addAll(Arrays.asList(50.0,10.0,10.0,-10.0,-10.0,50.0,20.0,-10.0,-20.0));
        user_transaction4.addAll(Arrays.asList(50.0,10.0,-20.0,20.0,10.0,-20.0));
        
        //Assigning users to specific Arraylist
        customer.add(new User("Saul","Goodman",bankAcc,user_transaction1));
        customer.add(new User("Walter", "White", bankAcc, user_transaction2));
        customer.add(new User("Jessie", "Pinkman", bankAcc, user_transaction3));
        customer.add(new User("Hank", "Shrader", bankAcc, user_transaction4));
        
       int option = 0;
        System.out.println("Welcome to Citione Bank");
        
        while (option != 4){
            
            System.out.println("1. Create Bank Account");
            System.out.println("2. Create User");
            System.out.println("3. Run Simulation");
            System.out.println("4. Exit");
            Scanner scanner = new Scanner(System.in);
            
            option = scanner.nextInt();
            
            if (option == 1){
               System.out.println("-----------------------------------");
               System.out.println("A new Bank Account has been created");
               System.out.println("Bank Account Number: 9876543210");
               System.out.println("Opening Balance =£1980 ");
               System.out.println("Bank Account Created Succesfully ");
               System.out.println("----------------------------------");
               
            }
            
            //Prints the default users given in Question
            if (option == 2){ 
                System.out.println("Default Users Created.....");
                System.out.println("Saul, Goodman\n" + "Walter White\n" + "Jessie Pinkman\n" + "Hank Schrader\n");
                System.out.println("------------------------------------------------------------------------");
        }
            
            if (option == 3){
               System.out.println("Running Simulation............");
               for (int e =0; e<4; e++){
                   customer.get(e).start();
               }
                
           
                    
                    
                }
                
                
                
            }
               
            if (option == 4){
                
                System.exit(0);
                
            }
                    }
     
    }
    