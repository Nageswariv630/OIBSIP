import java.util.Random;
import java.util.Scanner;
/*
 * Number Guessing Game.
 */
public class NumberGuessing
{
    //guessing method takes num and userNum as input and returns an integer value.
    //This method checks whether the guessed is correct or not
    //If the guess number equals to userNum return 1 otherwise return 0.
    public static int guessing(int num,int userNum)
    {
        if(num==userNum)
        {
            System.out.println("Congratulations ! \n Your Guess is correct \n You won the game\n Keep Rocking");
            return 1;
        }
        else if(num>userNum)
        {
            System.out.println("Your Guess Number should be greater than " + userNum);
        }
        else if(num<userNum)
        {
            System.out.println("Your Guess Number should be less than " + userNum);
        }
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int guess=0, userNum, attempts, number;
        System.out.println("NUMBER GUESSING GAME....");
        System.out.println("There are 5 chanches to win the game");
        System.out.println("Best of Luck");
        System.out.println("Are you ready to start the game?(Yes/No)");
        String ready=sc.nextLine();
        attempts=5;
        Random r=new Random();
        number=r.nextInt(101);
        if(ready.equals("Yes"))
        {
            while(attempts>0)
            {
                System.out.println("Guess the number between 1 to 100");
                userNum=sc.nextInt();
                guess=guessing(number,userNum);
                if(guess==1)
                {
                    break;
                }
                attempts-=1;
                System.out.println("Number of attempts Left : "+attempts);
            }
            if(guess!=1)
            {
                System.out.println("Sorry, You loose the game");
                System.out.println("Better luck next tume!!");
            }
        }
        else
        {
            System.out.println("Best of luck next time!!");
        }
        sc.close();
    }
}