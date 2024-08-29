//SIMPLE JAVA PROGRAM TO DEMONSTRATE ABSTRACTION AND IMPLEMENTING INTERFACE
interface Basic_animal
{
    void eat();
    void sleep();
}
abstract class Monkey
{
    Monkey()
    {
        System.out.println("Welcome all human evolution starts from monkey");
    }
    abstract public void jump();
    abstract public void bite();
}
class Human extends Monkey implements Basic_animal
{
    @Override
    public void eat()
    {
        System.out.println("Human beings can eat");
    }
    @Override
    public void sleep()
    {
        System.out.println("Human beings do need sleep");
    }
    @Override
    public void jump()
    {
        System.out.println("Human beings can jump");
    }
    @Override
    public void bite()
    {
        System.out.println("Human beings bite to eat");
    }
}
public class oops_practice_question3
{
    public static void main(String[] args)
    {
        Human human=new Human();
        human.bite();
        human.eat();
        human.jump();
        human.sleep();
    }
}
