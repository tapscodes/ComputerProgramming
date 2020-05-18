import java.util.Scanner;
  import java.util.Arrays;
public class RHS_Student
{
  //possiblr states:
  //int - id
  //int lunch pin
  //boolean- present
  // int locker num
  //double gpa
  //string[] schedule
  //int grade level
  //string concellor
  
  //possible behaviors
  //buy lunch
  //log in 
  //SignIn
  //SignOut
  //add classs
  //drop class
  //study
  //take assesment
  
  /*class and instance variables
   * 
   * class vcariables are values share between all instances of the class
   * created using a certain keyword static
   * 
   * instances variables - the value is specific to one case of the object
   * we cannot directly access these variables from static methods
   * 
   * by convention, we almost always make these private
   * we do not want other files to access thes values unless we say so
   * 
   * to avoid confusion for now do not reuse these names for new variables below
   */
  
  private int grade;
  private double GPA;
  private boolean present = false;
  private String[] schedule;
  private static int studentCount = 0; //current count of number of created students
   private int id;
   
   private static final double MAX_GPA = 5.3;//maxium gpa allowed in school
   private static final double MIN_GPA= 0.0;//minimum gpa allowed in school
   
  //----------------------------------------------------------------------------------------------------------------
   /*constructors
    * 
    * constructors are used to create instances of an object
    * like all methods with the same name constructors are differenciated by parameters
    * constructors have no return type(not even void)
    * same name as the class
    */
   //default constructors set each variable to some default values
   public RHS_Student()
   {
     //this looks for another constructor in the class that takes these [parameter types
     //we are using the other constructor to do the commented stuff
     this(9, MIN_GPA, false, new String[]{"Homeroom", "Study hall","Study hall","Study hall","Study hall","Lunch","Study hall","Study hall","Study hall","Study hall"});
//     grade=9;
//     GPA= MIN_GPA;
//     present= false;
//     schedule = {"Homeroom", "Study hall","Study hall","Study hall","Study hall","Lunch","Study hall","Study hall","Study hall","Study hall"};
//     studentCount++;
//     id=studentCount;
   }//RHS_Student
   
   //primary constructor set each variable to a specific value
   public RHS_Student(int g, double gpa, boolean p, String[] s)
   {
      
 setGrade(g);
     if(gpa>MAX_GPA||gpa<MIN_GPA)
     {
       GPA=MIN_GPA;
       System.out.println("invalid gpa entry set to zero");
     }
     else
        GPA= gpa;
     present= p;
     schedule= s;
     
     studentCount++;
     id = studentCount;
   }//RHS_Student(int, double, boolean, string[]
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   
   /*Acessor getter methods
    * 
    * The primary job of acessory methods is too provide access to private variables
    * their only function is too return the value of those variables
    */
   public int getID()
   {
     return id;
   }//getId90
   public static int getSC()
   {
    return studentCount; 
   }//sc
   public int getG()
   {
    return grade; 
   }//get grade
   //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   /*
    * Mutators stetter Methods
    * 
    * The primary job of a mutator method is too change the value of ethods
    * only function is too sett the value of those variables
    */
   public void setGrade(int g)
   {
      if(g<=12&& g>=9)
       grade= g;
       else
     {
       grade=9;
       System.out.println("invalid grade entry setting grade to 9");
     }
   }
  public void signIn()
  {
    present= true;
  }//sign in
  public void signOT()
  {
    present = false;
  }//sign out
  
  //we can write any other methods ha we may find useful
  
  public void dropClass(int p)
  {
    schedule[p] = "Study Hall";
  }//drop class
  
  public void addClass(int p, String c)
  {
    schedule[p] = c;
  }
  
  public boolean equals(RHS_Student s)
  {
    if(id==s.id)
      return true;
    else
      return false;
  }
  
  public String toString()
  {
  String toReturn = "Student ID:"+ id+"\n   Grade:"+Grade+"\n GPA:"+ GPA+ "\n   attendence"+ present;  
  }
  if (present)
    toReturn += "present";
  return toReturn;
} // MazeStarter