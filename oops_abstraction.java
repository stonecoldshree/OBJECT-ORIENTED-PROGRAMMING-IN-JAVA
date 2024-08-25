/* THIS JAVA PROGRAM IS TO LEARN HOW TO USE ABSTRACTION
IN FINDING AREA AND PERIMETER OF SQUARE AND RECTANGLE
FROM ABSTRACT CLASS SHAPE.
 */
import java.util.*;
abstract class shape
{
    int l,b;
    int ar=0;
    int peri=0;
    shape()
    {
        System.out.println("Welcome all...");
    }
    abstract public void area();
    abstract public void perimeter();
}
class square extends shape
{
    public void area()
    {
        ar=l*l;
        System.out.println("Area is: "+ar);
    }
    public void perimeter()
    {
        peri=4*l;
        System.out.println("Perimeter is: "+peri);
    }
}
class rectangle extends shape
{
    public void area()
    {
        ar = l * b;
        System.out.println("Area is: " + ar);
    }
    public void perimeter()
    {
        peri=2*(l+b);
        System.out.println("Perimeter is: "+peri);
    }
}
public class oops_abstraction
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        square sq= new square();
        System.out.print("Enter the length: ");
        sq.l=ob.nextInt();
        sq.area();
        sq.perimeter();

        rectangle re=new rectangle();
        System.out.print("Enter the length: ");
        re.l=ob.nextInt();
        System.out.print("Enter the breadth: ");
        re.b=ob.nextInt();
        re.area();
        re.perimeter();
    }
}
