//check case,digit and symbol
import java.util.*;
import java.lang.*;
public class Check_Case_Digit_Symbol
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
        else if(ch >= '0' && ch <= '9')
        {
            System.out.print("\nGiven letter " +ch +"is digit ");
        }
        else
        {
            System.out.print("\n Given letter " +ch +"is special symbol");
        }
    }
}