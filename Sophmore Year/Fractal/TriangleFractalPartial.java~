import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.lang.Math;

// You will edit this class to create your fractal. DO NOT CREATE A NEW FILE.
public class TriangleFractalPartial extends JPanel
{
  // These two variables are set in the constructor. Different fractals require
  // different window sizes and shapes to show the full effect.
  private double windowWidth;
  private double windowHeight;
  
  // Regardless of your fractal choice, you will likely have some type of starting
  // dimension. This could be a triangle side length, a circle radius, a line length,
  // or something else. You may have multiple such dimensions.
  private double startingLength;
  
  // You will need to have some way to stop your recursion, and this will likely be
  // with some minimum that, once a dimension reaches it, stops the recursion.
  private double minLength;
  
  private static final double PI = 3.14;
  
  // This is your factal constructor. You may have more or less parameters depending
  // on your choice.
  public TriangleFractalPartial(double wW, double wH, double sL, double mL)
  {
    windowWidth = wW;
    windowHeight = wH;
    startingLength = sL;
    minLength = mL;
    
  } // TriangleFractalPartial(double, double, double, double)
  
  // The following method is automatically called when you create an instance of your
  // fractal. This is where your drawing begins.
  public void paintComponent(Graphics g)
  {
    // Here, you will begin creating the variables you will need to draw your shapes.
    // For example, if you are drawing lines, you will need x and y coordinates for the
    // endpoints, as you will use the drawLine method.
    double leftX = 0; // bottom left vertex
    double middleX = windowWidth / 2.0; // top vertex
    double rightX = windowWidth; // bottom right vertex
    double topY = windowHeight - windowHeight * Math.sin(3.14 / 3); // top vertex
    double bottomY = windowHeight; // both bottom vertices
    
    // Here, you will draw your first shape.
    g.drawLine((int) leftX, (int) bottomY, (int) middleX, (int) topY);
    g.drawLine((int) middleX, (int) topY, (int) rightX, (int) bottomY);
    g.drawLine((int) leftX, (int) bottomY, (int) rightX, (int) bottomY);
    
    // Here, you will call your other method (below) which will be your recursion.
    // This method below will call itself several times. You may need to call it
    // more than once here.
    
    // The line below calls the drawTriangle method below with the vertices of the next triangle (which are the midpoints of the first).
    drawTriangle(0.5 * startingLength, (leftX + middleX) / 2, (bottomY + topY) / 2, (rightX + middleX) / 2, (bottomY + topY) / 2, (leftX + rightX) / 2, (bottomY + bottomY) / 2, g);
    
  } // paintComponent(Graphics)
  
  private static double distance(double x1, double y1, double x2, double y2)
  {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    
  } // distance(double, double, double, double)
  
  // You will write another method here that is your recursion. This method should
  // take care of drawing the extra "branches" or shapes off of your original.
  // Which parameters this method takes depends entirely on the shapes you choose, but
  // you MUST send it the g parameter. In all likelihood, the other parameters will be
  // very similar to those you send to your built-in drawing method (like drawLine).
  // You will also likely send it some type of dimension related to your startingDimension
  // variable above--this will be checked against the minDimension below.
  public void drawTriangle(double length, double leftMidX, double leftMidY, double rightMidX, double rightMidY, double bottomMidX, double bottomMidY, Graphics g)
  {
    // Here you will check that the dimension you are currently working with is in
    // fact still greater than the minimum you set earlier in the constructor.
    if(length > minLength)
    {
      // Here, you will manipulate the variables that get sent recursively to this
      // method. How this is done depends entirely on the shape you chose.
      double newLeftMidX = (leftMidX + bottomMidX) / 2; // midpoint of the left side of the triangle about to be drawn
      double newLeftMidY = (leftMidY + bottomMidY) / 2;
      
      // Here you will draw the shape you are currently on. You will use the same
      // built-in method you called in the paintComponent method above (like drawLine).
      
      // This draws a triangle based on whatever points you sent this method.
      g.drawLine((int) leftMidX, (int) leftMidY, (int) bottomMidX, (int) bottomMidY);
      g.drawLine((int) leftMidX, (int) leftMidY, (int) rightMidX, (int) rightMidY);
      g.drawLine((int) rightMidX, (int) rightMidY, (int) bottomMidX, (int) bottomMidY);
      
      double newLength = 0.5 * length;
      
      // Here, you will perform the recursive calls to this current method. You will
      // likely do this as many times as you did at the bottom of the paintComponent
      // method. Send it the variables you altered just inside the if statement of
      // this method.
      
      // This recursive call takes care of the triangle that will go to the bottom-left
      // of whatever one you are currently on. Follow through the calculations and note how
      // this gets me that eventual triangle's vertices. You will have to do something
      // similar for the "upper" and "bottom-right" triangles.
      drawTriangle(newLength, newLeftMidX - newLength, newLeftMidY, newLeftMidX, newLeftMidY, bottomMidX - newLength, bottomMidY, g);
      
    } // if
    
  } // drawTriangle(double, double, double, double, double, double, double, Graphics)
  
  public static void main(String[] args)
  {
    // Leave as-is; we are just creating the output window.
    JFrame aWindow = new JFrame();
    
    // Here, set the values you will send to the constructor. You have to play with
    // these--certain sizes work better for certain fractals.
    double windowW = 500.0;
    double windowH = 500.0;
    double startingLen = 500;
    double minLen = 5;
    
    // Here you will use your constructor created above.
    TriangleFractalPartial theFractal = new TriangleFractalPartial(windowW, windowH, startingLen, minLen);
    
    // Leave as-is; we are just setting up the output window.
    theFractal.setPreferredSize(new Dimension((int) windowW, (int) windowH));
    aWindow.add(theFractal);
    aWindow.pack();
    aWindow.setVisible(true);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  } // main(String[])
  
} // TriangleFractalPartial