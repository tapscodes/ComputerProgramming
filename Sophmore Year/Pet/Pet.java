/*This is our first abstact class.Notice abstract. It is one of the core concpets of programing.
 * Heres how it's explained:
 * Abstric-general idea without exact definition
 * -For example, we can describe a "room" but not say what type/what contects it has
 * -Or "pet" without something like a "dog"
 * -We can compare values but we have to say what criteria for tifferent stuff
 * -This class makes no sense on its own
 * -in programming this means we cant make INSTANCES of an abstract class, we can still write constructors though
 */
public abstract class Pet
{
  public boolean fed;
  public String name;
  private static final String DEFAULT_NAME="No Name";
  private static final boolean DEFAULT_FED=false;
  private String toReturn;
  public Pet(String n, boolean f)
  {
    name=n;
    fed=f;
  }//pet P$(String, boolean)
  public Pet()
  {
    name=DEAFULT_NAME;
    fed=DEFAULT_FED;
  }// PetP4()
  public abstract class Pet
  {
  /* Below, you make an abstract method
   * Including the keyword allows for 2 things:
   * -ubclasses implement this with more specified behavior
   * -any subclass must also be abstract
   */
  }
  public abstract String speak();
  {
  }//speak
  public void feed()
  {
    if (fed==true)
      System.out.pritnln(speak()+ "(not hungry)");
    else
      System.out.println(speak()+"(Thanks)");
    fed=true;
  }
  public String toString()
  {
    if(fed==false)
    toReturn= name+feed();
    else
    toReturn= name+feed();
    return toReturn;
  }//toString
}//Pet class 