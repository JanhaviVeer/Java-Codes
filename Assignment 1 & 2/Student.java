// student marks
import java.io.*;
import java.lang.*;
//co
class Stud{
    private int Phy = 0,Chem = 0,Maths = 0;
    private String Name = "";//constructor 
        //constrator
        public Stud(){
            this.Phy = 0;
            this.Chem = 0;
            this.Maths = 0;
            this.Name = "\0";
        }//constructor para
        public Stud(int M1, int M2,int M3,String Nm){
            this .Phy = M1;
            this .Chem = M2;
            this .Maths = M3;
            this .Name = Nm;
        }//methods
        public void Display_student_details(){
            System.out.print( "\n Name: "+Name);
            System.out.print("\n Marks => ");
            System.out.print("\t Physics = "+Phy +"\t Chemistry = "+Chem  +"\tMathematics = "+Maths  +".");
            System.out.print("\n total Marks = "+(Phy+Chem+Maths));
        }//getter method for name
        public String Getter(){
            return Name;
        }//setter method for name
        public void Setter(String Nm){
            this.Name = Nm;
        }
}
public class Student
{
    public static void main(String [] args) throws IOException{
        BuffereReader br = new BuffereReader(new InputStreamReader(System.in));
        //creating an object of stud class
        Stud Std1 = new Stud();
        Stud Std2 = new Stud(93, 77, 85,"Ram Patil");
        //Calling methods
        System.out.print("\n\n Student 1 Details are = >");
        std1.Display_student_details();
        System.out.print("\n\n Student 2 Detail are =>");
        std2.Display_student_details();

        br.read();
        //using getter and setter
        std1.Setter("Gita Patil");
        System.out.print("\n Name Updated Student 1: "+std1.Getter());

        br.read();
        //using getter and setter
        System.out.print("\n Name Give Student2 :"+std2.Getter());
        std2.Setter("Akshay Jadhav");
        System.out.println("\n Name Update Student 2 :"+std2.Getter());

        br.read()
        //calling method
        System.out.print("\n\n Student 1 Detail are =>");
        std1.Display_student_details();
        System.out.print("\n\n Student 2 details are=>");
        std2.Display_student_details();
    }

}

