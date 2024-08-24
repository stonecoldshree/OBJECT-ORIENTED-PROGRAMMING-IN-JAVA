/* THIS JAVA PROGRAM IS TO LEARN HOW TO CREATE YOUR OWN CUSTOMIZED CLASS
AND YOUR OWN OBJECTS AND USER DEFINED INPUTS
 */
import java.util.*;
class Student
{
    String name;
    String usn;
    int sem;
    String course;
    char sec;

    public void displaydetails(){
        System.out.println("The name is:\t"+name);
        System.out.println("USN is:\t"+usn);
        System.out.println("Semester is:\t"+sem);
        System.out.println("Course enrolled in:\t"+course);
        System.out.println("Section:\t"+sec);
    }
}
public class oops_basic_example
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        Student student1= new Student();
        System.out.print("Enter the name:\t");
        student1.name= ob.nextLine();
        System.out.print("Enter the usn:\t");
        student1.usn= ob.nextLine();
        System.out.println("Enter the Semester:\t");
        student1.sem= ob.nextInt();
        ob.nextLine();
        System.out.print("Enter the course:\t");
        student1.course = ob.nextLine();
        System.out.print("Enter the section:\t");
        student1.sec = ob.nextLine().charAt(0);

        Student student2= new Student();
        System.out.print("Enter the name:\t");
        student2.name= ob.nextLine();
        System.out.print("Enter the usn:\t");
        student2.usn= ob.nextLine();
        System.out.println("Enter the Semester:\t");
        student2.sem= ob.nextInt();
        ob.nextLine();
        System.out.print("Enter the course:\t");
        student2.course = ob.nextLine();
        System.out.print("Enter the section:\t");
        student2.sec = ob.nextLine().charAt(0);
        student1.displaydetails();
        student2.displaydetails();
    }
}
