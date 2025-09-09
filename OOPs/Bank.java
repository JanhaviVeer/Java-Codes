//class
import java.util.*;
import java.lang.*;

class bankAccount
{
    private double Balance;

    public BankAccount()
    {
        Balance = 0;
    }
    public BankAccount(double initialBalance)
    {
        Balance = initialbalance;
    }
    public void Deposit(double Amount)
    {
        if(Amount > 0)
        {
            Balance += Amount;
        }
    }
    public double getBalance()
    {
        return Balance;
    }
}
public class Bank
{
    public static void main(String [] String)
    {
        BankAccount User1 = new BankAccount();
        BankAccount User2 = new BankAccount(1000);

        System.out.println("\n Blanace" +User1.getBalance());

        User1.Deposit(2200);
        System.out.println("\n Balance:" +User1.getBalance());

        System.out.println("\n Balance:"+User2.getBalance());

        User2.Deposit(500);
        System.out.println("\n Balance :"+User2.getBalance());
        
    }

}