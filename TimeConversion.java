import java.util.Scanner;

/**
 * Project: Time Conversion 
 * Given a time in 12-hour AM/PM format, covert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 * For example: input 07:05:45PM, output:19:05:45
 */

public class TimeConversion {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Please enter the original time here: " + "\n Please write in the format- hh:mm:ssAM  or hh:mm:ssPM");
     String ogtime = sc.nextLine();
    // String ogtime = new String ("07:05:45PM");
     System.out.println("The original time is "+ ogtime);
     String hour = ogtime.substring(0,2);
      // System.out.println(hour);
     String minute = ogtime.substring(ogtime.indexOf(":"),ogtime.indexOf(":")+6);
      //System.out.println(minute);
      String ampm = ogtime.substring(ogtime.length()-2, ogtime.length());
     //  System.out.println(ampm);
     int armyhr ;
     if (ampm.equals("PM")) {armyhr = Integer.parseInt(hour)+12;}
     else {armyhr = Integer.parseInt(hour);}
     
     String armyhrStr;
     if (armyhr < 10) {armyhrStr = "0"+armyhr;}
     else {armyhrStr = ""+armyhr;}
    // System.out.println(armyhr);
     String armytime = armyhrStr + minute;
     System.out.println("The armytime is " + armytime);
         }  
}
