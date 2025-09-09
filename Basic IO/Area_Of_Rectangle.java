//area of rectangle
import java.util.*;
import java.lang.*;
public class Area_Of_Rectangle
{
    public static void main(String args [])
    {
        int height,width;
        float area;
         
        Scanner Sc = new Scanner (System.in);
        System.out.print("Enter height:");
        height = Sc.nextInt();
        System.out.print("Enter width:");
        width  = Sc.nextInt();

        area = height * width;

        System.out.println("Area of rectangle"+area);
        Sc.close();
        


    }
}