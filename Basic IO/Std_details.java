import java.util.*;
import java.lang.*;
class Std_details
{
    public static void main( String args [])
    {
        String Name;
        int Rollno;
        Float Std_Percentage;

        System.out.println("Student Details");
        Scanner Sc = new Scanner(System.in);

        System.out.println(" Enter Student name:");
        Name = Sc.nextLine();

        System.out.println("Enter student Roll number:");
        Rollno = Sc.nextInt();

        System.out.println("Enter Student percentage:");
        Std_Percentage = Sc.nextFloat();
         
        System.out.println("Student Name:"+Name);
        System.out.println("Student Rollno:"+Rollno);
        System.out.println("Student Percentage:" +Std_Percentage);
      
    }
}