//check case
import java.util.*;
import java.lang.*;
public class Check_Case
{
    public static void main(String args [])
    {
        char ch = '\0';
        Scanner Sc = new Scanner(System.in);

        System.out.print("\nEnter a letter:");
        ch = Sc.next().charAt(0);
        
        if( ch >= 'A' && ch <= 'Z')
        {
            System.out.print("\nGiven letter " +ch +"is Upper case");
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            System.out.print("\nGiven letter " +ch +"is lower case");
        }
        else
        {
            System.out.print("thanks");
        }
    }
}