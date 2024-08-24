/* THIS JAVA PROGRAM IS TO LEARN HOW TO IMPLEMENT INHERITANCE AND CONSTRUCTORS IN INHERITANCE
USING SUPER KEYWORD.
 */
import java.util.*;
class Animal
{
    Animal(){
        System.out.println("papa bol bete");
    }
    Animal(String x){
        System.out.println("Chacha hi bol de "+x);
    }
}
class Dog extends Animal
{
    Dog(){
        System.out.println("Ji papa");
    }
    Dog(String x,String y){
        super(x);
        System.out.println("ji mai aapka pyara bhatija "+y);
    }
}
class labrador extends Dog
{
    labrador() {
        System.out.println("mai high quality breed hun");
    }
    labrador(String x,String y,String z){
        super(x,y);
        System.out.println("ji chacha ji ab hum woh nhi rahe ab hum h "+z);
    }
}
public class oops_inheritance
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the details:");
        labrador l=new labrador(ob.nextLine(),ob.nextLine(),ob.nextLine());
    }
}
