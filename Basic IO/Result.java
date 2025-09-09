//accept marks of 3 subject and calculate ad diplay percentage
import java.lang.*;
import java.util.*;
public class Result
{
    public static void main (String [] args)
    {
        int Mar,Eng,Math,total;
        float per;
        
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter marks of marathi:");
        Mar = Sc.nextInt();
        System.out.println("Enter marks of english:");
        Eng = Sc.nextInt();
        System.out.println("Enter marks of maths:");
        Math = Sc.nextInt();

        total = Mar + Eng + Math;
        per = (float)total/3;
        System.out.println("Total marks:"+total);
        System.out.println("Persentage:"+per);
        Sc.close();
        
    }
}