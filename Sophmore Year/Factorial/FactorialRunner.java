/* Running this file should produce the following output:
 * 
 * Using looping, 5! = 120
 * Using recursion, 5! = 120
 * Using looping, 0! = 1
 * Using recursion, 0! = 1
 * 
 * If you did the extra credit, your output should also include that below, once you
 * uncomment the corresponding lines in the main method:
 * 
 * The number 11 in 8-bit binary = 00001011
 * The number 0 in 8-bit binary = 00000000
 * The number 255 in 8-bit binary = 11111111
 * The number 256 in 8-bit binary = Error: Need more digits to represent 256 in 8-bit binary.
 * The number 256 in 9-bit binary = 100000000
 * 
 */
public class FactorialRunner
{
  public static void main(String[] args)
  {
    System.out.println("Using looping, 5! = " + FactorialPudell.factorialFor(5));
    System.out.println("Using recursion, 5! = " + FactorialPudell.factorialRecursion(5));
    System.out.println("Using looping, 0! = " + FactorialPudell.factorialFor(0));
    System.out.println("Using recursion, 0! = " + FactorialPudell.factorialRecursion(0));
    
    // Uncomment the lines below if you did the extra credit to check your answers.
    System.out.println();
    
    System.out.println("The number 11 in 8-bit binary = " + FactorialPudell.binary(11, 8));
    System.out.println("The number 0 in 8-bit binary = " + FactorialPudell.binary(0, 8));
    System.out.println("The number 255 in 8-bit binary = " + FactorialPudell.binary(255, 8));
    System.out.println("The number 256 in 8-bit binary = " + FactorialPudell.binary(256, 8));
    System.out.println("The number 256 in 9-bit binary = " + FactorialPudell.binary(256, 9));
    
  } // main(String[])
  
} // FactorialRunner