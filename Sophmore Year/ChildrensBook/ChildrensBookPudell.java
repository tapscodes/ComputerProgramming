/*
 * ChildrensBookPudell
 * By:Tristan P.-S.
 * Subclass for the BookPudellClass
 */
public class ChildrensBookPudell extends BookPudell
{
  //declares variables and default values for this program
  private String illustrator;
  private int minAge;
  private int maxAge;
  public static final String DEFAULT_TITLE="Picture Book";
  public static final String DEFAULT_AUTHOR="No author";
  public static final String  DEFAULT_ILLUSTRATOR="No illustrator";
  public static final int DEFAULT_YEAR=2000;
  public static final int DEFAULT_PAGES=10;
  public static final int DEFAULT_MIN_AGE=0;
  public static final int DEFAULT_MAX_AGE=0;
  //sets variables to their values
  ChildrensBookPudell(String t, String a, String i, int y, int p, int
min, int max)
  {
  super(t, a, y, p);
  //sets min+max Ages only if they are positive
  if(min<0)
    System.out.println("Invalid minAge");
  else if (max<0)
    System.out.println("Invalid maxAge");
  else
  {
    minAge=min;
    maxAge=max;
  }
  illustrator=i;
  }
  //sets default values for this subclasss
  ChildrensBookPudell(String i, int min, int max)
  {
   this(DEFAULT_TITLE, DEFAULT_AUTHOR, i, DEFAULT_YEAR, DEFAULT_PAGES, min, max);
  }
  //sets default values for the normal class
  ChildrensBookPudell()
  {
    this(DEFAULT_TITLE, DEFAULT_AUTHOR, DEFAULT_ILLUSTRATOR, DEFAULT_YEAR, DEFAULT_PAGES, DEFAULT_MAX_AGE, DEFAULT_MIN_AGE);
  }
  //acessor method for illustrator
  public String getIllustrator()
  {
    return illustrator;
  }
  //sets minAge to default if <0, normal value otherwise
  void setMinAge(int min)
  {
if(minAge>=0)
  minAge=min;
else
  minAge=DEFAULT_MIN_AGE;
  }
  //sets maxAge to default if <0, normal value otherwise
  void setMaxAge(int max)
  {
if(minAge>minAge)
  maxAge=max;
else
  maxAge=DEFAULT_MAX_AGE;
  }
  //toString(printing) methods, changing based on if there is an age range or simply a minimum age
  public String toString()
  {
    if (maxAge==0)
      return getTitle()+" ("+getYear()+")\n Author: "+getAuthor()+"\n Pg. "+ getPagesRead()+"/"+getPages()+"\n Illustrator: " + illustrator+"\n Ages: " +minAge+ " and up";
    else
      return getTitle()+" ("+getYear()+")\n Author: "+getAuthor()+"\n Pg. "+ getPagesRead()+"/"+getPages()+"\n Illustrator: " + illustrator+"\n Ages: " +minAge+ " to " + maxAge;
  }
}