/*
 * Auithor:Tristan P.-s>
 * StoryBookPage class
 * Prints a page in a story book
 */
//My Line:Suddenly, the real Waluigi, not the evil one, appears with his brother Wario through a portal, and they say �come with us to defeat the evil Waaaaaaaaluigi�.
// DO NOT TOUCH THESE IMPORT STATEMENTS
// If you find any you need to add, that is fine, but don't delete these.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.net.URL;
import javax.imageio.*;
import java.lang.*;
import java.awt.image.*;
import java.io.*;

// A 'JPanel' is part of our eventual page window that will contain our images and text.
// Since we're using the 'extends' keyword, calling our StoryBookPage constructor will
// create a more-specific JPanel that we can customize.
public class StoryBookPage extends JPanel
{
  // DO NOT TOUCH THESE DIMENSIONS.
  // They are set to this so that all pages are the same size.
  // However, I WOULD recommend you position things with sizes/positions related to these
  // coordinates, so changing the size scales everything with it.
  public static final int WINDOW_WIDTH = 1000;
  public static final int WINDOW_HEIGHT = 600;
  
  // The constructor below is where you will change anything and everything.
  // The rest of the program is set up to properly display your final product.
  // This is the only method you should be changing in any way.
  public StoryBookPage()
  {
    // DO NOT TOUCH THESE LINES.
    // I am setting up the coordinate-plane layout for you, and specifying window dimensions.
    setLayout(null);
    setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    
    // This is the method that sets the background for the StoryBookPage.
    // Use it as you see fit.
    // The 'Color' class is also built in, and 'WHITE' is an example of one of its variables.
    setBackground(Color.WHITE);
    
    // The JLabel is likely to be your most used class. We will use it for images and text.
    // This first line instantiates a JLabel, and we send the constructor what is
    // called an 'ImageIcon' parameter. Get this parameter by calling the imageDisplay
    // method I've created below--send it the file name and the dimensions.
    // Make sure the image file is in the same folder as wherever you've put this class.
    JLabel potato = new JLabel(imageDisplay("potato.png", 1000, 600));
    JLabel maa = new JLabel(imageDisplay("maa.png", 100, 100));
    JLabel med = new JLabel(imageDisplay("med.png", 100, 100));
    JLabel meg = new JLabel(imageDisplay("meg.png", 100, 100));
    JLabel mzon = new JLabel(imageDisplay("mzon.png", 100, 100));
    // This method sets the position (first two numbers) and size (last two numbers)
    // of the JLabel in the StoryBookPage.
    potato.setBounds(0, 0, 1000, 600);
    maa.setBounds(400,300,100,100);
    med.setBounds(600,300,100,100);
    meg.setBounds(800,300,100,100);
    mzon.setBounds(200,300,200,200);
    // This is another use of JLabel. Now, we are using it to display whatever text we'd like.
    JLabel text = new JLabel();
    add(text);
    // Use of the 'setText' method below is the main difference vs. using JLabel for
    // images. There are other methods for changing font size/style if you'd like.
    // The <html> and other tags are only needed if you'll want to control output
    // on several lines.
    text.setText("<html>Suddenly, the real Waluigi, not the evil one, appears with his brother Wario through a portal, and they say �come with us to defeat the evil Waaaaaaaaluigi�.<html>");
    text.setBounds(10, 400, 200, 100);
        // This line adds your created JLabel to the StoryBookPage
    add(maa);
    add(med);
    add(meg);
    add(mzon);
    add(potato);
  } // StoryBookPage()
  
  // DO NOT TOUCH THIS METHOD.
  // Use it to scale an image for use in a JLabel.
  private ImageIcon imageDisplay(String imageFileName, int width, int height)
  {
    BufferedImage image = null;
    // validate that the file exists in the right place
    try
    {
      image = ImageIO.read(new File(imageFileName));
      
    } // try
    catch (IOException e)
    {
      e.printStackTrace(); // print an error if the file is not found or incorrect
      
    } // catch
    
    // scale the image
    Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    
    // return the new ImageIcon
    return new ImageIcon(scaledImage);
    
  } // imageDisplay(String, int, int)
  
  // DO NOT TOUCH THE MAIN METHOD.
  // Here, I am ensuring you can actually see your page displayed.
  // I add a few things so that your page functions like everyone else's.
  // An example is the 'next page' button.
  public static void main(String[] args)
  {
    JFrame window = new JFrame();
    window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    
    StoryBookPage page = new StoryBookPage();
    
    JButton nextPage = new JButton();
    nextPage.setText("next page");
    nextPage.setBounds(WINDOW_WIDTH - 110, 10, 100, 25);
    page.add(nextPage);
    
    window.add(page);
    window.getRootPane().setDefaultButton(nextPage);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  } // main(String[])
  
} // StoryBookPage