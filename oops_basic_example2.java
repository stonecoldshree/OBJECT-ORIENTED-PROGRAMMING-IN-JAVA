/* THIS JAVA PROGRAM IS TO LEARN HOW TO IMPLEMENT GETTERS AND SETTERS IN YOUR PROGRAM
YOU CAN PRESS ALT+INSERT IN THE BLOCK YOU WANT TO ADD GETTERS AND SETTERS
THEN CHOOSE GETTERS AND SETTERS FROM THE DROP-DOWN MENU
 */
import java.util.*;
class Employee
{
    String name;
    int salary;

    public int get_salary()
    {
        return salary;
    }
    public String get_name()
    {
        return name;
    }
    public void set_name(String n)
    {
        name=n;
    }
}
public class oops_basic_example2
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        Employee E1=new Employee();
        Employee E2=new Employee();

        System.out.print("Enter the salary pachage per annum of E1: ");
        E1.salary=ob.nextInt();

        System.out.print("Enter the salary package per annum of E2: ");
        E2.salary=ob.nextInt();

        E1.set_name("Sujal shree");
        E2.set_name("Sanket wali");

        System.out.println("The name of the Employee is: "+E1.get_name());
        System.out.println("The salary package per annum of E1 is: "+E1.get_salary());

        System.out.println("The name of the Employee is: "+E2.get_name());
        System.out.println("The salary package per annum of E2 is: "+E2.get_salary());
    }
}
