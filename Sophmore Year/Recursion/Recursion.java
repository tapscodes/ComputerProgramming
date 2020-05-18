/*
 * Recursion depends on smaller solution from the same problem
 * in hava that means we have a method that calls itself
 */ 
class Recursion
{
  public static void main(String[] args)
  {
    //whatsItDo1(3);
    //whatsItDo2(3);
    //uhOh(10);
    System.out.println(whatsItDo3(5));
  }//main(String[])\
  public static void whatsItDo1 (int n)
  {
    System.out.println(n);
    if(n>0)
      whatsItDo1(n-1);//recursive method call
  }//WhatsItDo1(int) 
  public static void whatsItDo2 (int n)
  {
    if(n>0)
      whatsItDo1(n-1);//recursive method call
       
    System.out.println(n);
  }//WhatsItDo2(int)
  public static String whatsItDo3(int n)
  {
    String s="";
    if(n>0)
      for (int i=n;i>0;i--)
      s+="o";
    else
      return s;
    return s+"\n"+ whatsItDo3(n-1);
  }//WhatsItDo3(int)
  public static void uhOh(int n)
  {
    System.out.println(n);
    uhOh(n-1);
  }//uhOh
  
}//Recursion

















