// print letter forward
import java.lang.*;
import java.util.*;
public class Print_Letter_User_Specified_Range
{
    public static void main(String [] args)
    {
        char Sch = '\0', Ech ='\0';
        Scanner S = new Scanner(System.in);
        System.out.println("Enter start letter:");
        Sch = S.next().charAt(0);
        System.out.println("Enter end letter:");
        Ech = S.next().charAt(0);
        System.out.println("\n printing letter "+Sch +"to" +Ech+"=>\n");
        while( Sch <= Ech)
        {
            System.out.print(Sch);
            Sch ++;
        }
    }
}