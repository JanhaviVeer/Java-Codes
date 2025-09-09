//radius of circle and calculate area 
import java.util.*;
import java.lang.*;
public class Area_of_Circle
{
    public static void main(String [] args)
    {
        float radius = 0.0f,area = 0.0f;
        final float PI = 3.14f;
         
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter radius:");
        radius = Sc.nextInt();

        area =  PI * radius * radius;

        System.out.println("Area of circle is:"+area);
        Sc.close();
    }
}