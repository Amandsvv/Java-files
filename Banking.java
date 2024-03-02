 import java.util.*;

 class BankAccount{
    public int accountNumber = 921000;
}
class Customer{
    private String customerName = "Aman Kumar";

    BankAccount c = new BankAccount();
    Transaction t = new Transaction();

    public void displayDetails(){
        System.out.println("----------------------------");
        System.out.println("Account number : "+c.accountNumber);
        System.out.println("Account holder : "+customerName);
        System.out.println("Available ammount : "+t.rupees);
    }
}
class Transaction{
    public int rupees = 25000;
    public int amount;
    Scanner sc = new Scanner(System.in);
    Transaction t = new Transaction();
    public void deposit(){
        
       System.out.println("Enter the amopunt you want to deposit : " );
        amount = sc.nextInt();
        t.rupees = t.rupees + amount;
    }
    public void withdrawl(){
        System.out.println("Enter the amopunt you want to Withdraw : " );
        amount = sc.nextInt();
        t.rupees = t.rupees - amount;
    }
}
public class Banking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Transaction t = new Transaction();
        Customer c = new Customer();

        int choice;

        System.out.println("Enter 1 to deposit\nEnter 2 to Withdraw\nEnter 3 to display the bill");
        choice = sc.nextInt();

        switch(choice){
            case 1:
            {
            t.deposit();
            System.out.println("Rupees are successfully deposited \n");
            break;
            }

            case 2:
            t.withdrawl();
            System.out.println("Rupees are successfully Withdrawl \n");
            break;

            case 3:
            c.displayDetails();
            break;

            default :
            System.out.println("Please Enter valid choices : ");
        }
        
    }
}
