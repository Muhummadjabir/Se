import java.util.Random;
import java.util.Scanner;

public class Banking {
    int password;
    Random random = new Random();
    String name;
    String surname;
    String address;
    int accountNumber;
    String accountName;
    int balance = 0;
    int withDraw;
    int deposite;
    int Balance = 0;


    //
    Scanner input = new Scanner(System.in);

    void createAccount(){
        System.out.println("create new account");
       System.out.println("what is your name");
       name = input.next();
       System.out.println("your surname");
       surname = input.next();
       System.out.println("enter your address");
       address = input.next();
       System.out.println("create 4 digit password");
       password = input.nextInt();
       accountName = name;
       accountNumber = random.nextInt(100)+200;
       System.out.println("Your account name is " + accountName);
       System.out.println("Your account number is " + accountNumber);
    }

    void disposit_your_amount(){
      System.out.println("do you want to deposite (yes/no)");
      String choice = input.next().toLowerCase();
      if (choice.equals("yes")){
          System.out.println("deposite your money");
          System.out.println("account name");
          String accountName2 = input.next();
          System.out.println("enter the account number");
          int accountNumber2 = input.nextInt();
          if (accountNumber2 == accountNumber && accountName.equals(accountName2)){
              System.out.println("enter the amount you want to transfer");
              deposite = input.nextInt();
              balance = deposite;
              System.out.println(deposite +" was transfer to your account");
              System.out.println("your current balance is "+ balance);
          }else {
              System.out.println("incorrect account name or account number");
          }
      }
    }

    void withdraw_from(){
        System.out.println("do you want to withdraw (yes/no)");
        String choice = input.next().toLowerCase();
        if (choice.equals("yes")){
            System.out.println("enter your password");
            int Password = input.nextInt();
            if (password == Password){
                System.out.println("enter the amount you want to withdraw");
                withDraw = input.nextInt();
                Balance = balance - withDraw;
                System.out.println(withDraw +" naira"+ " has be deducated from your account");
                balance = Balance;
                System.out.println("your current balance is " + Balance);
            }
        }
    }

    public static void main(String[] args) {
        Banking banking = new Banking();
        banking.createAccount();
        banking.disposit_your_amount();
        banking.withdraw_from();

    }
}
