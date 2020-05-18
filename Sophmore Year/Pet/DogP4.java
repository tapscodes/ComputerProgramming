public class DogP4 extends Pet
{
  private boolean houseTrained;
  public DogP4()
  {
    super();
    houseTrained=false;
  }//DogP4
  public String speak()
  {
    return "Bark!";
  }//speak
   public String toString()
  {
     if (houseTrained=true)
    return super.toString()+"trained";
    else
    return super.toString();
  }//toString
}//DogP4