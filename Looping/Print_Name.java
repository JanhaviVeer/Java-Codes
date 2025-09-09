// wap print name
import java.util.*;
import java.lang.*;
public class Print_Name
{
    public static void main(String [] args)
    {
        int cnt = 0;
        String name ="";
        Scanner Sc = new Scanner(System.in);

         System.out.println("\nEnter number:");
         cnt = Sc.nextInt();

         Sc.nextLine();

         System.out.println("\nEnter name:\n");
         name = Sc.nextLine();

         while (cnt > 0)
         {
            System.out.print(name);
            cnt--;
         }
         Sc.close();
    }
}
