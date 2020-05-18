/*
 * Unlike dog, we leave our Bird class abstract
 * We assume that different bird made different sounds, therefore it makes sense to make a speak method later
 */
public abstract class Bird extends Pet
{
  private double wingspan;
  private static final double DEFAULT_WINGSPAN=10;
  public Bird(String n, boolean f, double w)
  {
    super(n, f);
    if(w<0)
      wingspan=DEFAULT_WINGSPAN;
    else
      wingspan=w;
  }//Bird
  public Bird()
  {
    super();
  }//Bird
}
