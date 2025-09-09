//swap 2 number
import java.lang.*;
import java.util.*;
public class Swap_Two_Numbers
{
    public static void main(String args[])
    {
        int No1 =10,No2 = 40,Temp;
        System.out.println("before swapping 2 number" + " " + No1 + " "+ "and" + " "+ No2);
        Temp = No1;
        No1 = No2;
        No2 = Temp;

        System.out.println("After swapping 2 number" + " " +No1 + " " +"and" + " " +No2);
        System.out.println("thankyou");
    }
}