/* Below is what this file should print out when you run it with your Rectangle class:
 * 
 * Rectangle 1:
 * Length: 10
 * Height: 5
 * 
 * Rectangle 2:
 * Length: 2
 * Height: 2
 * 
 * Rectangle 3:
 * Length: 2
 * Height: 2
 * 
 * Rectangle 4:
 * Length: 5
 * Height: 10
 * 
 * Rectangle 1 area: 50
 * Rectangle 2 area: 4
 * Rectangle 3 area: 4
 * Rectangle 4 area: 50
 * 
 * Rectangle 1 perimeter: 30
 * Rectangle 2 perimeter: 8
 * Rectangle 3 perimeter: 8
 * Rectangle 4 perimeter: 30
 * 
 * Rectangle 1 and 2 the same: false
 * Rectangle 2 and 3 the same: true
 * Rectangle 1 and 4 the same: true
 * 
 * Number of created Rectangles: 4
 * 
 */

public class Rectangle_runner
{
  public static void main(String[] args)
  {
    RectanglePudell r1 = new RectanglePudell(10, 5);
    RectanglePudell r2 = new RectanglePudell();
    RectanglePudell r3 = new RectanglePudell(-1, 0);
    RectanglePudell r4 = new RectanglePudell(5, 10);
    
    System.out.println();
    
    System.out.println(r1);
    System.out.println();
    System.out.println(r2);
    System.out.println();
    System.out.println(r3);
    System.out.println();
    System.out.println(r4);
    
    System.out.println();
    
    System.out.println("Rectangle 1 area: " + r1.area());
    System.out.println("Rectangle 2 area: " + r2.area());
    System.out.println("Rectangle 3 area: " + r3.area());
    System.out.println("Rectangle 4 area: " + r4.area());
    
    System.out.println();
    
    System.out.println("Rectangle 1 perimeter: " + r1.perimeter());
    System.out.println("Rectangle 2 perimeter: " + r2.perimeter());
    System.out.println("Rectangle 3 perimeter: " + r3.perimeter());
    System.out.println("Rectangle 4 perimeter: " + r4.perimeter());
    
    System.out.println();
    
    System.out.println("Rectangle 1 and 2 the same: " + r1.equals(r2));
    System.out.println("Rectangle 2 and 3 the same: " + r2.equals(r3));
    System.out.println("Rectangle 1 and 4 the same: " + r1.equals(r4));
    
    System.out.println();
    
    System.out.println("Number of created Rectangles: " + RectanglePudell.getRectangleCount());
    
  } // main(String[])
  
} // Rectangle_runner