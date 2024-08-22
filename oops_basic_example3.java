class cellphone
{
    public void ringing()
    {
        System.out.println("Your phone linging");
    }
    public void vibrating()
    {
        System.out.println("Your phone is on bhayankar vibration");
    }
    public void calling()
    {
        System.out.println("bhai mai kisko call lagau mai toh fakir hun");
    }
}
public class oops_basic_example3 {
    public static void main(String[] args) {
        cellphone motorola_g32=new cellphone();
        motorola_g32.ringing();
        motorola_g32.vibrating();
        motorola_g32.calling();
    }
}
