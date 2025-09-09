import java.util.*;
import java.lang.*;

public class A
{
    void method_A()
    {
        System.out.print("method of class A");
    }
}
// class B extends A{
//     void methodB(){
//         System.out.print("method of class B");
//     }
// }
public class Super
{
    public static void main(String [] args)
    {
            A sc = new A();
            sc.method_A();
    }
}