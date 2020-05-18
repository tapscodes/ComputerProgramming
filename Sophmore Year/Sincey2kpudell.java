/*
 * *SinceY2KPudell class
 * 
 * Imput Notes
 * 
 * Author:Tristan
 */
import java.util.Scanner;
class SinceY2KPudell
{
  public static void main(String[] args)
  {
 Scanner scan = new Scanner(System.in);
 System.out.println("What year is it?");
 int year = scan.nextInt();
 System.out.println("What is the current month?(# not word)");
 int month = scan.nextInt();
 System.out.println("What is the day?(not day of week)");
 int day = scan.nextInt ();
 System.out.println("What hour is it right now?(military time)");
 int hour = scan.nextInt();
 System.out.println("How many minutes are there currently?");
 int minute = scan.nextInt();
 int year2 =(year-2000)*360*24*60*60;
 int hour2 = hour*60*60;
 int minute2 =minute*60;
 int day2 = (day-1)*24*60*60;
 int month2 = (month-1)*30*24*60*60;
 int totalSeconds= year2+hour2+minute2+day2+month2;
 System.out.println("The entered date is " + totalSeconds + " seconds past the start o the millenium");
  }//main() method
}//SinceY2KPudell class