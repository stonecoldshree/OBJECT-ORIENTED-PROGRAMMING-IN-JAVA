//THIS JAVA PROGRAM IS TOM LEARN HOW TO APPLY INHERITANCE IN INTERFACES
import java.util.*;
interface operate{
    void add();
    void subtract();
}
interface operands extends operate{
    void get_first_no(int a);
    void get_second_no(int b);
}
class execution implements operands{
    private int a;
    private int b;
    @Override
    public void get_first_no(int a)
    {
        this.a=a;
        System.out.print("First no. is: "+a);
    }

    @Override
    public void get_second_no(int b) {
        this.b=b;
        System.out.print("Second no. is: "+b);
    }
    public void add(){
        int sum=a+b;
        System.out.print("\nSum is: "+sum);
    }

    @Override
    public void subtract() {
        int diff=a-b;
        System.out.print("\nDifference is: "+diff);
    }
}
public class oops_inheritance_in_interface {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        execution ex=new execution();
        System.out.print("Enter the first no.: ");
        ex.get_first_no(ob.nextInt());
        System.out.print("\nEnter the second no.: ");
        ex.get_second_no(ob.nextInt());
        ex.add();
        ex.subtract();
    }
}
