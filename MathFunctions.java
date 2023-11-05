/**
Write 9 math fuctions - getProduct, countString, square function, sumdigit, check leap yearleap year, 
find maximum, triangle area, sinx, cosx
 */


import java.util.Scanner;

  /**
   * Author: Megan Wang
   */
 
public class MathFunctions {

    // Q1
    
  /**
   * Write a method that will take two numbers as parameters (not as input from the user) and print their product 
   * (i.e. multiply them).
   */
   
    public static double getProduct(double num1, double num2) {
        double result=num1*num2;
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("The product is " + getProduct (2.5, 2.5));
    }
    
    
    // Q2
  /**
   * Write a method that takes in two parameters. The first parameter will be a string named phrase. 
   * The second parameter will be a number named count. Print phrase to the screen count times on the same line.
   * (e.g., the function takes in "Hello" and 5, then prints "Hello" five times.)
   */  
    
    
    public static countString (String phrase, int count) {
        for (int i=1; i<=count; i++) {
        System.out.print (phrase + "    ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        countString("Hello megan", 8);
    }
    
    
    // Q3
    /**
     * Write code for a method that takes in a number, and returns the square of that number.  
     * Note, this function should RETURN the answer, not print it out.
     */
    
    public static double squarefn(double num1) {
        double result=num1*num1;
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double input = 3.5;
        System.out.println ("the square of " + input + " is " + squarefn(input));
    }
    
  
    // Q4
    /**
     * Write a Java method to compute the sum of the digits in an integer 
     * Test Data:
     * Input an integer: 25
     * Expected Output:  The sum is 7 
     */ 

    public static int sumdigit(int num) {
        int  digit, sum=0;
        while (num > 1) {
        digit = num%10;
        sum = sum + digit;
        num = num/10;
        }
        return sum;
    }
    
        public static void main(String[] args) {
        int num = 25;
        int result;
        result = sumdigit(num);
        System.out.println ("The sum of " + num + " is " + result);
    }
        

      // Q5

      /**
       *Write a Java method to check whether a year (integer) entered by the user is a leap year or not
       *Expected Output:    Input a year: 2017      return    false
       *Determine whether a year is a leap year, follow these steps:
       *       1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
       *       2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
       *      3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
       *      4. The year is a leap year (it has 366 days).
       *      5. The year is not a leap year (it has 365 days).
       */
        
        public static checkleapfn(int year) {
           // year to be checked

        boolean leap = false;

           if (year % 4 == 0) {

            // if the year is century
               if (year % 100 == 0) {

               // if year is divided by 400
                 // then it is a leap year
                   if (year % 400 == 0){
                       leap = true; }
                   else
                      leap = false;
                   }
                 else
                 leap = false;
           }
    
           else
           leap = false;
        
            if (leap)
              System.out.println(year + " is a leap year.");
            else
              System.out.println(year + " is not a leap year.");
          }
         
            public static void main(String[] args) {
            int year;  
            Scanner sc = new Scanner(System.in);  
            System.out.print("Enter a year: ");  
            year= sc.nextInt();    
            checkleapfn(year);
        }

    
    // Q6
    /** Write a function that takes three numbers as parameters, and return the maximum of them. 
    */
   
    public static double findmaxfn(double num1, double num2, double num3) {

        double max;
        if (num1 >= num2) {
        max = num1;
        } else max = num2 ;
        if (max < num3) {max = num3;}
        return max;
    }
 
        public static void main(String[] args) {
        double num1=12.5;
        double num2=16.2;
        double num3 = 14.0; 
        double findmax;  
        
        findmax = findmaxfn(num1,num2, num3);
        System.out.println("The max number is " +  findmax);
    }
        

       // Q7

    /**
     * Write a method to calculate the area of triangle using Herons formula, based on the length of all three sides
     */
    
    public static double calAreafn(double a, double b, double c) {
        double p, area;
        p = (a+b+c)/2 ;
        area = Math.sqrt (p*(p-a)*(p-b)*(p-c));
        return area;
    }
 
    public static void main(String[] args) {
    double a=12.5;
    double b=16.2;
    double c= 14.0; 
    System.out.println("The area is " +  calAreafn (a, b, c));
   }


    // Q8

    /**
     * Write a program to compute sinx for given x. The user should supply x and a positive integer n. 
     * We compute the sine of x using the series and the computation should use all terms in the series up 
     * through the term involving xn
     *    sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
     * Hint Write a function to calculate xn and write a function to calculate  factorial given a number. 
     */
    
     public static double calpower(double x, int i) {
        double p=1.0;
        for (int k=1; k<=i; k++) {
            p=p*x;
        }
        return p;
     }
     
    public static double factorial (int i) {
        double f=1.0;
        for (int k=1; k<=i; k++) {
            f=f*k;
        }
        return f;
     }
    
   
    public static void main(String[] args) {
    
    double x = 90;
    int max_n = 51;
    double sign = 1.0;
    double sin = 0.0;
    for (int i=1; i<=max_n; i=i+2) {
    sin = sin + sign*Math.pow(x,i)/factorial(i);
    sign=sign*(-1.0);
    }
    
    // Q9
    /**
     * Write a program to compute the cosine of x. The user should supply x and a positive integer n. 
     * We compute the cosine of x using the series and the computation should use all terms in the series up 
     * through the term involving xn
     *  cos x = 1 - x2/2! + x4/4! - x6/6! .....
     */
    
    for (int j=0; j<=max_n; j=j+2) {
    cos = cos + sign*Math.pow(x,j)/factorial(j);
    sign=sign*(-1.0);
    }
   
    System.out.println("cos " + x + " is " +  cos);
        
    }
}
