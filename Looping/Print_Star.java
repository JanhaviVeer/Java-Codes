// wap print star
import java.util.*;
import java.lang.*;
public class Print_Star
{
    public static void main(String [] args)
    {
        int cnt = 0;
        Scanner Sc = new Scanner(System.in);

         System.out.println("\nEnter number:");
         cnt = Sc.nextInt();

         while (cnt > 0)
         {
            System.out.print(" * ");
            cnt--;
         }
         Sc.close();
    }
}
