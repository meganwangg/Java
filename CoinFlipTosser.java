
import java.util.Scanner;

/**
 * Author: Megan Wang
 * Project: Coin flip tosser
 * Description: 
 * Create a program that will print a random 0 or 1.
 * Instead of 0 or 1, print heads or tails. Do this using if statements. Add a loop so that the program does this 50 times. 
 * Create a running total for the number of heads flipped, and the number of tails.
 */

public class CoinFlipTosser {

    public static void main(String[] args) {
        
    System.out.println("\nquestion 6");
    int sumtail = 0;
    int sumhead = 0;
   
    for(int i = 1; i <= 50; i++){
    int num = (int) (Math.random() * (1 - 0 + 1)) + 0;
    //System.out.print(num);
    if (num == 0){
    System.out.print("Head\t");
    sumhead ++;
    }
    
    if (num == 1){
    System.out.print("Tail\t");
    sumtail ++;
    }
    
    }  
 
    System.out.println("\n" + "Total heads:" + sumhead );
    System.out.println("\n" + "Total tails:" + sumtail); 
    }
}


 