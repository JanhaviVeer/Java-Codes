//radius of circle and calculate area 
import java.util.*;
import java.lang.*;
public class Fahrenheit_to_Celsuis
{
    public static void main(String [] args)
    {
        float Fht,Cel;
         
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter temprature:");
        Fht = Sc.nextFloat();

        Cel =  (Fht - 32f) * (5f/9f);

        System.out.println("Temprature =>:"+Fht +"Fahrenheit"  +Cel +"Celcisus");
        Sc.close();
    }
}