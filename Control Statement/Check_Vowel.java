//Viwel Or not
import java.util.*;
import java.lang.*;
public class Check_Vowel
{
    public static void main(String args[])
    {
        char ch = '\0';
        Scanner Sc = new Scanner(System.in);
         
        System.out.println("Enter letter:");
        ch = Sc.next().charAt(0);
       if(ch == 'A'|| ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'|| ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println("Given letter " + ch  +"is vowel");
        }
        else{
            System.out.println("Given letter " + ch   +"is not vowel");
        }
        Sc.close();
    }
}