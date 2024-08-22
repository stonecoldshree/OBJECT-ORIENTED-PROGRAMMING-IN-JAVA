import java.util.*;
class circle
{
    private int radius;
    double area= 0.0;
    double circumference= 0.0;
    public circle(int r)
    {
        radius=r;
    }
    public void display_details()
    {
        area=(22.0/7.0)*radius*radius;
        circumference=2.0*(22.0/7.0)*radius;
        System.out.println("The area of the circle is: " + area );
        System.out.println("The circumference of the circle is: "+circumference);
    }
}
public class oops_basic_Example4 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        circle c=new circle(ob.nextInt());
        c.display_details();
    }
}
