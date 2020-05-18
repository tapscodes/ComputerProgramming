/*
 * Author:Tristan P.-S.
 * FactorialPudell class
 */
//import java.Util.Math;
public class FactorialPudell
{
  public static int factorialFor(int n)
  {
    if(n==0)
      n=1;
    else
    {
    for (int i=n-1;i>0;i--)
      n*=(i);
    }
    return n; 
  }//FactorialFor(int)
  public static int factorialRecursion(int n)
  {
    if (n>0)
      n*=factorialRecursion(n-1);
    else
      n=1;
      return n;
  }//FactorialRecursion(int)
  public static String binary(int num, int nDigits)
  {
    /*Number-2^power of each location(based on amount of digits, if the number is <0 then its 0, if its 1, its 1, if its >1 use that instead
    int old=num;
    int digits=nDigits;
    String result="";
    digits-=1;
    num=num-2*Math.pow(nDigits);
    if(num>1)
    {
      old=num;
    return "1";
    binary(old, nDigits);
    }
    else if(num==1)
    {
      return "1";
    binary(old, nDigits);
  }
    else
    {
      return "0";
      binary(old, nDigits);
    }
    DIDN'T GET TO FINISH THIS ON TIME
    */
    return "Not done";
  }//Binary(int, int)
}//FactorialPudell