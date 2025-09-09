//inheritance
import java.lang.*;
class Animal()
{
    void sound()
    {
        System.out.print("Animal makes a sound");
    }
}
//dog class inherit frok animal
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
public class Zoo
{
    public static void main(String [] args)
    {
        Dog D = new Dog();
        D.sound();
    }
}