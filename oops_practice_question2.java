/* THIS IS A GUESS THE NUMBER GAME IN JAVA. IN THIS GAME PLAYER'S INPUT SHOULD MATCH WITH THE COMPUTER'S CHOICE.
GAME GETS OVER AFTER THE INPUT IS MATCHED.
 */
import java.util.*;
class guess_the_number
{
    private int g;
    private int chosen_number;
    public int n=0;
    guess_the_number()
    {
        int min = 1;
        int max = 100;
        chosen_number = (int) (Math.random() * (max - min + 1) + min);
    }
    public void game()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Welcome to the guess the number game. Player can play this game only once. \n" +
                "Players have to give the numbers to match with computer's choice.\n " +
                "The game will end after your choice matches with the computer's choice.");
        boolean iscorrectguess=false;
        while(!iscorrectguess)
        {
            System.out.print("Player's input:\t");
            int n=ob.nextInt();
            g++;
            if(n<chosen_number)
            {
                System.out.println("Buddy guess higher too low");
            }
            else if(n>chosen_number)
            {
                System.out.println("Buddy guess lower too high");
            }
            else
            {
                iscorrectguess=true;
                System.out.println("Bro you edged you won you're a sigma");
            }
        }
    }
    public void getG()
    {
        System.out.print("No. of guesses taken:\t"+g);
    }
}
public class oops_practice_question2
{
    public static void main(String[] args)
    {
        guess_the_number G=new guess_the_number();
        G.game();
        G.getG();
    }
}
