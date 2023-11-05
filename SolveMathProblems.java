
import java.util.Scanner;

/**
 * @author meganwang
*/

public class SolveMathProblems {

    public static void main(String[] args) {
        
      // Q1:
      /**
       * Write a program to input b and n from keyboard and calculate b^n,
       */
       
     int b, n ;
     Scanner sc = new Scanner(System.in);
     System.out.print ("Enter base number here:");
     b = sc.nextInt();
     System.out.print ("Enter exponent number here:");
     n = sc.nextInt ();
     int result;
     result = 1;
     for (int i = 1; i <= n; i++){
      result *= b; //   result = b * result; 
     }
      System.out.println("the result is " + result);

     
     
     // Q2
     /**
      * Write a program that prompts the user to input a positive integer. It should then output a message indicating 
      * whether the number is a prime number. 
      */
      
     int n;
     Scanner sc = new Scanner(System.in);
     System.out.print ("Enter a positive number here: ");
     n = sc.nextInt();
     boolean flag = false;
     for (int i = 2; i <= n / 2; i++){
        //condition for nonprime number
    if (n % i == 0){ 
        flag = true;    
        break;
    }
    }
    if (flag == false)
    System.out.println( n + " is a prime number");
    else 
    System.out.println( n + " is not a prime number");
     
     
     // Q3
     /**
      * Write a program that will count how many positive integers smaller than 1000000 which will be divided by 7 but not 5.
      */
      
    int num = 100000;
    int count = 0;
     for (int i = 1; i <= num; i++){
    if (i % 7 == 0 && i % 5 != 0){ 
    count += 1;
    }
    }
    System.out.println( "There are " + count + " positive integers smaller than 100000 which can be divided by 7 but not 5.");
 
    
    // Q4
    /**
     * 4.	Compute the natural logarithm of 2, by adding up to n-terms in the series
     * 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
     * where n is a positive integer and input by user from keyboard. 
     */ 

    int n;
     Scanner sc = new Scanner(System.in);
     System.out.print ("Enter a positive integer here: ");
     n = sc.nextInt();
     int sign = 1;
     double sum = 0;
     
     for (int i = 1; i <= n; i++){
     sum = sum + sign*(1.0/i);
     sign = sign * (-1);
     }
     System.out.println("The nature logarithm of 2 for " + n + " is " + sum );
    }
}
