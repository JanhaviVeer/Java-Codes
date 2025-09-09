//Addition of 2 numbers
import java.lang.*;
import java.util.*;
public class Addtion1
{
    public static void main(String []args)
    {
        int n1,n2,sum;
        Scanner S = new Scanner(System.in);
        System.out.println("\nEnter two number:");
        n1 = S.nextInt();
        n2 = S.nextInt();
        sum = n1 + n2;
        System.out.println("\n Addition of" +n1 +" "+"and" +" "+n2 +" "+"is" +" "+sum);
        
    }
}