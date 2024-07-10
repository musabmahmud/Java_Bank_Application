
package bankapplication.pkg3;

import java.util.Scanner;
public class BankApplication3 {

    
    public static void main(String[] args) {
    
      BankAccount obj1=new BankAccount("Switzerland-453", "Require id no??:");
     obj1.showMenu();
     
     
    }
    
}
class BankAccount{
   int balance;
   int previousTransaction;
   String customerName;
   String customerId;
   
   BankAccount(String cname,String cid){
      customerName=cname;
      customerId=cid;
   }
   void deposit(int amount){
    if(amount!=0)
    {
      balance=balance+amount;
      previousTransaction=amount;
    }
 }
   void withdraw(int amount)
   {
     if(amount!=0)
     {
       balance=balance-amount;
       previousTransaction=-amount;
     }   
   } 
   void getPreviousTransaction()
   {
     if(previousTransaction>0)
     {
       System.out.println("DEPOSITED:"+previousTransaction);
         System.out.println("=============");
       System.out.println("Here is your option:");
               System.out.println("A.Check Balance");
               System.out.println("B.Deposit");
               System.out.println("C.withdraw");
               System.out.println("D.previous transaction");
               System.out.println("E.Exit");
     }
     else if(previousTransaction<0)
     {
       System.out.println("WITHDRAWN:"+Math.abs(previousTransaction));
     }
     else
     {
        System.out.println("No transaction occured");
     }  
   }
   void showMenu()
   {
      char option='\0';
      Scanner scanner=new Scanner(System.in);
      System.out.println(">[{WELLCOME TO OUR SWISS BANK}]<");
      System.out.println(""+customerName);
      Scanner input1=new Scanner(System.in);
       String s1;
       System.out.print("Please enter your name=");
       s1=input1.nextLine();
      System.out.println(""+customerId);
       Scanner input2=new Scanner(System.in);
       String s2;
       System.out.print("Please enter your id please=");
       s1=input1.nextLine();
        System.out.println("\n");
      System.out.println("<<WELLCOME TO YOUR SWISS BANK ACCOUNT>>"); 
        System.out.println("======================================");
      System.out.println("\n");
      System.out.println(">>>Here is your option below:");
        System.out.println("____________________________");
      System.out.println("A.check Balance");
      System.out.println("B.Deposit");
      System.out.println("C.withdraw");
      System.out.println("D.previous transaction");
      System.out.println("E.Exit");
      do
      {
        System.out.println("=================");
       System.out.println("Enter an option below:>>");
       System.out.println("=================");
       option=scanner.next().charAt(0);
       System.out.println("\n");
       
       switch(option)
               
         {
             case 'A':
               System.out.println("============");
               System.out.println("Balance="+balance);
               System.out.println("============");
               System.out.println(">>>Here is your option below>>:");
                System.out.println("__________________");
               System.out.println("A.Check Balance");
               System.out.println("B.Deposit");
               System.out.println("C.withdraw");
               System.out.println("D.previous transaction");
               System.out.println("E.Exit");
               System.out.println("\n");
               break;
             case 'B':
              System.out.println("==============");
              System.out.println(">>>Here is your option:");
                System.out.println("_______________");
               System.out.println("A.Check Balance");
               System.out.println("B.Deposit");
               System.out.println("C.withdraw");
               System.out.println("D.previous transaction");
               System.out.println("E.Exit"); 
               System.out.println("==============");
              System.out.println("Enter an amount to deposit>>");
              System.out.println("===============");
              
              int amount=scanner.nextInt();
              deposit(amount);
              System.out.println("==============");
              System.out.println(">>>Here is your option:");
                System.out.println("______________");
               System.out.println("A.Check Balance");
               System.out.println("B.Deposit");
               System.out.println("C.withdraw");
               System.out.println("D.previous transaction");
               System.out.println("E.Exit");
              System.out.println("\n");
              break;
             case 'C':
              System.out.println("==============");
              System.out.println("Enter an Amount to withdraw>>");
              System.out.println("==============");
              int amount2=scanner.nextInt();
              withdraw(amount2);
              System.out.println("==============");
              System.out.println(">>>Here is your option below:");
                System.out.println("______________");
               System.out.println("A.Check Balance");
               System.out.println("B.Deposit");
               System.out.println("C.withdraw");
               System.out.println("D.previous transaction");
               System.out.println("E.Exit");
              System.out.println("\n");
              break;
             case 'D':
              System.out.println("==============");
              getPreviousTransaction();
              System.out.println("============");
              System.out.println("\n");
              break;
             default:
              System.out.println("Invalid optipon!!.Please enter again");
              break;
         }       
       
      }while(option!='E');
      System.out.println(">[{Thank you for using our services}]<");
   }   
}
