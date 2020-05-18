/* Below is what this file should print out when you run it with your Square class:
 * 
 * Square 1:
 * Side Length: 10
 * 
 * Square 2:
 * Side Length: 2
 *
 * Square 3:
 * Side Length: 2
 *
 * Square 4:
 * Side Length: 2
 *
 * Square 1 area: 100
 * Square 2 area: 4
 * Square 3 area: 4
 * Square 4 area: 4
 *
 * Square 1 perimeter: 40
 * Square 2 perimeter: 8
 * Square 3 perimeter: 8
 * Square 4 perimeter: 8
 *
 * Square 1 and 2 the same: false
 * Square 2 and 3 the same: true
 * Square 2 and 4 the same: true
 * 
 * Number of created Squares: 4
 */
public class Square_runner
{
  public static void main(String[] args)
  {
    SquarePudell s1 = new SquarePudell(10);
    SquarePudell s2 = new SquarePudell();
    SquarePudell s3 = new SquarePudell(-1);
    RectanglePudell s4 = new SquarePudell(2);
    
    System.out.println(s1);
    System.out.println();
    System.out.println(s2);
    System.out.println();
    System.out.println(s3);
    System.out.println();
    System.out.println(s4);
    
    System.out.println();
    
    System.out.println("Square 1 area: " + s1.area());
    System.out.println("Square 2 area: " + s2.area());
    System.out.println("Square 3 area: " + s3.area());
    System.out.println("Square 4 area: " + s4.area());
    
    System.out.println();
    
    System.out.println("Square 1 perimeter: " + s1.perimeter());
    System.out.println("Square 2 perimeter: " + s2.perimeter());
    System.out.println("Square 3 perimeter: " + s3.perimeter());
    System.out.println("Square 4 perimeter: " + s4.perimeter());
    
    System.out.println();
    
    System.out.println("Square 1 and 2 the same: " + s1.equals(s2));
    System.out.println("Square 2 and 3 the same: " + s2.equals(s3));
    System.out.println("Square 2 and 4 the same: " + s2.equals(s4));
    
    System.out.println();
    
    System.out.println("Number of created Squares: " + SquarePudell.getRectangleCount());
    
  } // main(String[])
  
} // Square_runner