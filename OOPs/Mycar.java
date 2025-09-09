import java.util.*;
import java.lang.*;

class A
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
class Main
{
    public static void main(String [] args)
    {
            A sc = new A;
            sc.method_A();
    }
}