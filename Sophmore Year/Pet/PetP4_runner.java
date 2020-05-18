public class PetP4_runner
{
  public static void main(String[] args)
  {
   // Can't run Pet P4 p=new PetP4("Buddy", false);, the class is abstract
    DogP4 fido= new DogP4("Fido", false, false);
    //Bird flaps = new Bird("Flaps", false, 5); doesn't work
    Parakeet polly = new Parakeet("Polly", false, 10);//works\
    System.out.println(fido.speak());
    System.out.println();
    System.out.println(polly.speak());
    System.out.println();
    //using feed method
    fideo.feed();
    System.out.println();
    polly.feed();
    System.out.println();
    fido.feed();
    public static void exercise(Pet p)
    {
      System.out.println(p.speak()+" (I'm tired)");
    }//exercisde(Pet)
  }//main method
}//Pet runner class