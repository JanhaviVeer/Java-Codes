//Covern distance in km miter
import java.lang.*;
import java.util.*;
public class Km_to_Meters
{
    public static void main(String args [])
    {
        float KM ,Mtr;
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter distance (in Kilometer)");
        KM = Sc.nextFloat();

        Mtr = KM * 1000;
        System.out.print("Distance =>" +KM  +"km = " +Mtr +"Meter");
        Sc.close();
    }
}