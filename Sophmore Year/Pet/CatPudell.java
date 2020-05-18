/*
 * CatPudell class
 * Author:Tristan P.-S.
 * This class extends the Pet class for cats
 */
public class CatPudell extends Pet
{
  private boolean indoorCat;
  private int numKittens;
  private int DEFAULT_NUMKITTENS=0;
  private boolean DEFAULT_INDOORCAT=true;
  CatPudell(int k, boolean in,String n, boolean f)
  {
    super(n, f);
    numKittens=k;
    indoorCat=in;
  }//primary constructor
  CatPudell()
  {
    numKittens=DEFAULT_NUMKITTENS;
    indoorCat=DEFAULT_INDOORCAT;
  }//default constructor
  void haveKittens(int n)
  {
    if (n>0)
      numKittens+=n;
  }//haveKittens primary
  void haveKittens()
  {
    haveKittens(4);
  }//havekittens Default
  String toString()
  {
    if (indoorCat==true)
      return super.toString()+"\n Indoor Cat\n Number of Kittens: "+numKittens;
      else
      return super.toString()+"\n Outdoor Cat\n Number of Kittens: "+numKittens;
  }//toString
}//class declaration