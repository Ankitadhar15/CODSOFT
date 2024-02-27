import java.util.Random;
import java.util.Scanner;
public class random 
{

  public static void main(String[] args) 
  {

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
    int randomNumber = rand.nextInt(100) + 1;

    
    int Count = 0;
    while(Count<=5) 
    {
      System.out.println("Enter your guess (1-100):");
      
      int playerGuess = sc.nextInt();
      Count++;
      
      if (playerGuess == randomNumber)
       {
        System.out.println("Correct! You Win!");
        System.out.println("It took you " + Count + " tries");
        break;
      }
      else if(randomNumber > playerGuess) 
      {
        System.out.println("Wrong Guess! The number is higher. Guess again.");
      }
      else 
      {
        System.out.println("Wrong Guess! The number is lower. Guess again.");
      }
    }
    if (Count>5)
    System.out.println("No more tries , your score is 0");
    
    
    sc.close();
    
  }
}