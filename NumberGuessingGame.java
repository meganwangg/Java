
import java.util.Scanner;
/**
 * Author: Megan Wang
 * Project: Number Guessing Game
 * Description: write a program that generates a random number and asks the user to guess what the number is. If the user&#39;s guess is higher than the random number, the program should display &quot;Too high, try again.&quot; If the user&#39;s guess is lower than the random number, the program should display &quot;Too low, try again.&quot; The program should use a loop that repeats until the user correctly guesses the random number.
 */

public class NumberGuessingGame {

    public static void main(String[] args) {
        
      System.out.println("\nquestion 5");
     
      int num = (int) (Math.random() * (5 - 0 + 1)) + 0;
    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your guess ranging from 0 to 5" );
      int guess = sc.nextInt();
     
      while (guess!=num) {
          
      if(guess > num){
      System.out.println("Your guess is too high. Please try again.");
      guess = sc.nextInt();
      }
      
      else if(guess < num) {
      System.out.println("Your guess is too low. Please try again.");
      guess = sc.nextInt();
      }
      }
      System.out.println("Your guess is correct.");
      
          }
}

      
