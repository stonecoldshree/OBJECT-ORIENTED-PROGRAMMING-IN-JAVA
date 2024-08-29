/*PROGRAM TO CALCULATE SURFACE_AREA AND VOLUME OF CYLINDER
AND AREA AND PERIMETER OF RECTANGLE USING INTERFACES
 */
import java.util.*;
interface operations
{
    void area();
    void specific_measurement();
}
class Cylinder implements operations
{
    private int r,h;
    private double surf_area=0.0;
    private double volume=0.0;
    public void set_radius(int radius)
    {
        this.r=radius;
    }
    public int getR()
    {
        return r;
    }
    public void set_height(int height)
    {
        this.h=height;
    }
    public int getH()
    {
        return h;
    }
    public void area()
    {
        surf_area=2.0*(22.0/7.0)*r*h;
    }
    @Override
    public void specific_measurement()
    {
        volume=(22.0/7.0)*r*r*h;
    }
    public void display_cylinder()
    {
        area();
        specific_measurement();
        System.out.println("Surface area of Cylinder is:\t"+surf_area);
        System.out.println("Volume of Cylinder is:\t"+volume);
    }
}
class Rectangle1 implements operations
{
    private int l,b;
    private double area=0.0;
    private double perimeter=0.0;

    public void set_length(int length)
    {
        this.l=length;
    }
    public int getL()
    {
        return l;
    }
    public void set_breadth(int breadth)
    {
        this.b=breadth;
    }
    public int getB()
    {
        return b;
    }
    public void area()
    {
        area=l*b;
    }
    public void specific_measurement()
    {
        perimeter=2*(l+b);
    }
    public void display_rectangle()
    {
        area();
        specific_measurement();
        System.out.println("Area of rectangle is:\t"+area);
        System.out.println("Perimeter of rectangle is:\t"+perimeter);
    }
}
public class oops_practice_question1
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        Cylinder c=new Cylinder();
        System.out.print("Enter the radius:\t");
        int radius=ob.nextInt();
        c.set_radius(radius);
        System.out.print("Enter the height:\t");
        int height=ob.nextInt();
        c.set_height(height);
        c.getR();
        c.getH();
        c.display_cylinder();

        Rectangle1 r=new Rectangle1();
        System.out.print("Enter the length:\t");
        int length=ob.nextInt();
        r.set_length(length);
        System.out.print("Enter the breadth:\t");
        int breadth=ob.nextInt();
        r.set_breadth(breadth);
        r.getL();
        r.getB();
        r.display_rectangle();


    }
}
