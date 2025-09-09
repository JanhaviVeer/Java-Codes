//year leap or not
import java.util.*;
import java.lang.*;
public class Leap_Year
{
    public static void main(String args[])
    {
        int Year;
        Scanner Sc = new Scanner(System.in);
         
        System.out.println("Enter year:");
        Year = Sc.nextInt();

        if(Year < 1000 || Year > 9999)
        {
            System.out.println("Year must be 4 digit");
        }
        else if(Year % 4 == 0)
        {
            System.out.println("Given Year" +Year  +"is leap");
        }
        else{
            System.out.println("Given Year" +Year  +" is not leap");
        }
        Sc.close();
    }
}