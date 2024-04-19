
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
class Bank
{
    private double bal = 5000;
    private int pwd;
    public void deposite (double money)
    {
        System.out.print("Enter password");
        Scanner s= new Scanner (System.in);
        pwd = s.nextInt();
        if (pwd==0000)
        {
            bal = bal +money;
            System.out.print("deposite money"+ money);
            System.out.println("Total balance"+ bal);
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
     public void Withdraw (double money)
    {
        System.out.print("Enter password");
        Scanner s= new Scanner (System.in);
        pwd = s.nextInt();
        if (pwd==0000)
        {
            bal = bal +money;
            System.out.print("deposite money"+ money);
            System.out.println("Total balance"+ bal);
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
     public void CheckBal (double money)
    {
        System.out.print("Enter password");
        Scanner s= new Scanner (System.in);
        pwd = s.nextInt();
        if (pwd==0000)
        {
            bal = bal +money;
            System.out.print("deposite money"+ money);
            System.out.println("Total balance"+ bal);
        }
        else
        {
            System.out.println("Incorrect");
        }
}
class Customer
{
      public static void main (String [] args) 
      {
          Bank b= new Bank();
          int choice;
          System.out.println("1.Desposite");
          System.out.println("2.Withdraw");
          System.out.println("3.CheckBal");
          System.out.print("\nEnter your choice\n");
          Scanner s2= new Scanner (System.in);
          choice=s2.nextInt();
          switch(choice)
          {
              case 1: b.deposite(1000);
              break;
              case 2: b.Withdraw(2000);
              break;
            //   case 3: b.CheckBal();
            //   break;
              default: System.out.println("Invalid choice");
                  
          }
}
}
}

//     public static void main(String[] args) {
//         System.out.println("Welcome to Online IDE!! Happy Coding :)");
//     }
// }
