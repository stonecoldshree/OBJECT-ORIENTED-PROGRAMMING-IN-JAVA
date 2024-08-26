//THIS JAVA PROGRAM IS TO LEARN HOW TO IMPLEMENT MULTIPLE INTERFACES TO A SINGLE CLASS
import java.util.*;
interface camera
{
    public void take_picture();
    public void record_video();
    private void option()
    {
        System.out.println("option available for 4k video...");
    }
    default void record_video_in_4k()
    {
        option();
        System.out.println("Recording in 4k....");
    }
}
interface wifi
{
    String[] get_network();
    void connect_to_network(String n);
}
class mycellphone
{
   public void ringing()
   {
       System.out.println("Your phone linging");
   }
}
class smartphone extends mycellphone implements camera,wifi
{
    @Override
    public void take_picture() {
        System.out.println("Taking a picture");
    }

    @Override
    public void record_video() {
        System.out.println("Recording a video");
    }
    public String[] get_network(){

        System.out.println("Get the details of networks available: ");
        String[] network_list={"heybro","motog32","sanket"};
        return network_list;
    }

    @Override
    public void connect_to_network(String n) {
        System.out.println("Availabe networks: "+n);

    }
}

public class oops_interface2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        smartphone moto=new smartphone();
        moto.record_video_in_4k();
        String[] ar=moto.get_network();
        for(String item:ar)
        {
            System.out.println(item);
        }
        moto.take_picture();
        moto.record_video();
        System.out.print("Network: ");
        moto.connect_to_network(ob.nextLine());

    }
}
