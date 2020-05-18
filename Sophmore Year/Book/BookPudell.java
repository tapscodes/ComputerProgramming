public class BookPudell{
  //variable declaration
  private String title;
  private String author;
  private int year;
  private int pages;
  private int pagesRead;
  public BookPudell(String t, String a, int y, int p)
  {
    //default values set
    title = t;
    author = a;
    year = y;
    pages = p;
    pagesRead = 0;
  }
  //gets values into the constructor
  public String getTitle()
  {
    return title;
  }
  public String getAuthor()
  {
    return author; 
  }
  public int getYear()
  {
    return year; 
  }
  public int getPages()
  {
    return pages;
  }
  public int getPagesRead()
  {
    return pagesRead;
  }
  public void startOver()
  {
    //set pages to 0 since you start over
    pagesRead = 0; 
  }
  //finds pages left
  private int pagesLeft()
  {
    return pages - pagesRead; 
  }
  //book complete if statement
  public String read(int p)
  {
   pagesRead += p;
   if (pagesRead >= pages)
   {
     pagesRead = pages;
     return "Book Complete";
   }
   else
     return pagesLeft() + " pages remaining.";
  }
 //sends value 1 to read
  public String read()
  {
    return read(1); 
  }
  //prints out the book info
  public String toString()
  {
   return title + "(" + year + ")\n   Author:" + author + "\n   Pg. " + pagesRead + "/" + pages;
  }
}