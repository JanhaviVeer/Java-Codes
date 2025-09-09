//wap to check maximum nuber andminimum number
import java.lang.*;
import java.util.*;
public class Max_Min_Number
{
    public static void main(String args [])
    {
        int No1,No2;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Two number:");
        No1 = Sc.nextInt();
        No2 = Sc.nextInt();

        if(No1 == No2)
        {
            System.out.print("Both number equal");
        }
        else if(No1 > No2)
        {
            System.out.print("Number " +No1 +"is maximum");
        }
        else{
            System.out.print("Number" +No2 + "is minimum");
        }
        Sc.close();
    } 
}