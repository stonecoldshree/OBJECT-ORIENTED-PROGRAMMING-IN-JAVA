/* THIS JAVA PROGRAM IS TO LEARN HOW TO USE INTERFACE
IN FINDING SUM AND DIFFERENCE OF TWO NOS.
FROM CALCULATOR INTERFACE.
 */
import java.util.*;
interface calculator
{
    public void add();
    public void subtract();
}
class operation implements calculator
{
    int a = 0,b=0;
    int sum=0;
    int difference=0;
    public void add()
    {
        int sum=a+b;
        System.out.println("Sum is: "+sum);
    }
    public void subtract()
    {
        int difference=a-b;
        System.out.println("Difference is: "+difference);
    }
}
public class oops_interface
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        operation op=new operation();
        System.out.print("Enter value of a: ");
        op.a=ob.nextInt();
        System.out.print("Enter value of b: ");
        op.b=ob.nextInt();
        op.add();;
        op.subtract();
    }
}
