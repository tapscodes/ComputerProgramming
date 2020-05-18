public class RectanglePudell
{
  //variable declaration
  private int length;
  private int height;
  private int DEFAULT_LENGTH=2;
  private int DEFAULT_HEIGHT=2;
  private static int rectangleCount;
  private int rectangleID;
  public RectanglePudell(int l, int h)
  {
    //if statement if l and h are invalid
    if (l<=0 || h<=0)
  {
    length=DEFAULT_LENGTH;
    height=DEFAULT_HEIGHT;
  }
  else
  {
    length=l;
    height=h;
  }
  rectangleCount++;
    rectangleID=rectangleCount;
  }
  //sets default values
  public RectanglePudell()
  {
    length=DEFAULT_LENGTH;
    height=DEFAULT_HEIGHT;
    rectangleCount++;
    rectangleID=rectangleCount;
  }
  public int getLength()
  {
    return length;
  }
  public int getrectangleID()
  {
    return rectangleID;
  }
  //gets total amt of rectangles
  static int getRectangleCount()
  {
    return rectangleCount;
  }
 // calculates area
  int area()
  {
    return length*height;
  }
  //finds perimiter
  int perimeter()
  {
    return 2*length + 2*height;
  }
  //finds out if 2 rectangles are =
  boolean equals(RectanglePudell r)
  {
    if (length==r.length && height==r.height || length==r.height && height==r.length)
    return true;
    else
      return false;
  }
  //prints results
  public String toString()
  {
    return "Rectangle "+ rectangleID+":/n Length: " +length+"/n Height: " +height;
  }
  }