//calculate sum of 10 numbers
import java.lang.*;
import java.util.*;
public class Sum_of_10digit
{
    public static void main(String [] args)
    {
        int Sum = '\0',number ='\0';
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number:");
        number = Sc.nextInt();
        Sum = Sc.nextInt();
   
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            Sum = Sum + number;
        }
        System.out.println("Enter number:"+Sum);
    }
}