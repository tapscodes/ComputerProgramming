/*
 * Now we are specific enough to make speak
 * We don't need abstact, we only need Bird, not Pet
 * Bird inherited the abstract speak method, so we must make it an extension of Bird
 * Parakeets make a tweet sound, so we do it here
 */ 
public class Parakeet extends Bird
{
  public Parakeet(String n, boolean f, double w)
  {
    super(n, f, w);
    name=n;
    fed=f;
  }//Parakeet
  public Parakeet
  {
    this(DEFAULT_NAME, DEFAULT_FED);
  }//Parakeet default
  public String speak()
  {
    return "Tweet!";
  }//Parakeet speak
}//Parakeet class