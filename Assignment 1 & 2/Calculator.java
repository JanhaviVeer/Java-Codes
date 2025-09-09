//calculator
import java.lang.*;
import java.util.*;
public class Calculator
{
    public static void main(String [] args)
    {
        int N1= 0, N2 = 0,Res = 0,Choice =0;
        Scanner Sc = new Scanner (System.in)

        while(true)
        {
            System.out.print("\n=============*****===============\n");

            System.out.print("\n***** Calculator *****");
            System.out.print("\nChoice");
            System.out.print("\n\t 1. Addition");
            System.out.print("\n\t 2. Subtraction");
            System.out.print("\n\t 3. Multiplication");
            System.out.print("\n\t 4. Division");
            System.out.print("\n\t 5. Remainder");
            System.out.print("\n\t 6. Exit");

            System.out.print("\n==========\n");

            System.out.print("\n Select Your choice :");
            Choice = Sc.nextInt();

            if(Choice > 0 && choice < 6)
            {
                System.out.print("\n Enter 1st Number :");
                N1 = Sc.nextInt();
                System.out.print("\n Enter 2nd Number :");
                N2 = Sc.nextInt();
            }
            switch(Choice)
            {
                case 1:
                    Res = N1 +N2;
                    System.out.println("\n Addition of " + N1 + "&" +N2 + "is = "+Res + ".");
                    Sc.next();
                    break;
                case 2:
                    Res = N1 - N2;
                    System.out.println("\n Substration of " + N1 + "&" +N2 + "is = "+Res + ".");
                    Sc.next();
                    break;
                case 3:
                    Res = N1 * N2;
                    System.out.println("\n Multiplicaton of " + N1 + "&" +N2 + "is = "+Res + ".");
                    Sc.next();
                    break;
                case 4:
                    Res = N1 / N2;
                    System.out.println("\n Division of " + N1 + "&" +N2 + "is = "+Res + ".");
                    Sc.next();
                    break;
                case 5:
                    Res = N1 % N2;
                    System.out.println("\n Remainder of " + N1 + "&" +N2 + "is = "+Res + ".");
                    Sc.next();
                    break;
                case 6:
                    
                    break;
                default:
                   
                    System.out.println("\n Addition of " + N1 + "&" +N2 + "is = "+Res + ".");  
            }
            if(choice == 6)
            {
                breck;
            }
            System.out.print("\n Thanks For Using this Calculator service")
        }
    }
}