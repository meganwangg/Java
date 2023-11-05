
import java.util.Scanner;

/**
 * @author meganwang
 * Project: RockPaperCissors
 * Description: Develop a Rock, Paper, and Scissors Game using Java: 
 * Talented students at the Math and Science club of Beckendorff Junior High are running a massive online rock, paper, and scissors tournament 
 * at their school. They have enlisted your help to write a program in Java that plays rock, paper, and scissors:
 * a. Create a program that randomly prints 1, 2, or 3.
 * b. Expand the program so it randomly prints rock, paper, or scissors using if statements.
 * c. Add to the program so it first asks the user their choice.
 * d. (It will be easier if you have them enter 1, 2, or 3.)
 * e. Add conditional statement to figure out who wins.
 */

public class RockPaperCissors {

    public static void main(String[] args) {
    
     System.out.println("\Rock Paper Cissors Game");
    
    int num = (int) (Math.random() * (3 - 1 + 1)) + 1;
    System.out.println(num);
    if (num == 1){
    System.out.print("Rock\t");
    }
    if (num == 2){
    System.out.print("Paper\t");
    }
    if (num == 3){
    System.out.print("Scissor\t");
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter one of the following numbers: 1 (rock), 2 (paper), 3 (scissor)." );
      int chosen = sc.nextInt();
      
    if ((num == 1 && chosen == 3)|| (num == 2 && chosen == 1) || (num == 3 && chosen == 2))
    System.out.println("Machine wins!");
    else if ((num == 1 && chosen == 2) || (num == 2 && chosen == 3) || (num == 3 && chosen == 1))
     System.out.println("You win!");    
    else System.out.println("Tie!");  
    
 //   System.out.println("\n" + "Machine:" + num + "\t You:" + chosen);
 
    }
}


 