import java.awt.*;
import javax.swing.*;
import java.util.*;

// You will edit this class to create your fractal. DO NOT CREATE A NEW FILE.
public class FractalPudell extends JPanel
{
  // These two variables are set in the constructor. Different fractals require
  // different window sizes and shapes to show the full effect.
  private double windowWidth;
  private double windowHeight;
  
  // Regardless of your fractal choice, you will likely have some type of starting
  // dimension. This could be a triangle side length, a circle radius, a line length,
  // or something else. You may have multiple such dimensions.
  private double startingDimension;
  
  // You will need to have some way to stop your recursion, and this will likely be
  // with some minimum that, once a dimension reaches it, stops the recursion.
  private double minDimension;
  
  // This is your factal constructor. You may have more or less parameters depending
  // on your choice.
  public FractalPudell(double wW, double wH, double sD, double mD)
  {
    windowWidth = wW;
    windowHeight = wH;
    startingDimension = sD;
    minDimension = mD;
    
  } // FractalPudell(double, double, double, double)
  
  // The following method is automatically called when you create an instance of your
  // fractal. This is where your drawing begins.
  public void paintComponent(Graphics g)
  {
    // Here, you will begin creating the variables you will need to draw your shapes.
    // For example, if you are drawing lines, you will need x and y coordinates for the
    // endpoints, as you will use the drawLine method.
    double x=200;
    double y=200;
    // Here, you will draw your first shape.
    g.drawRect(((int)x),((int)y),((int)startingDimension),((int)startingDimension));
    
    // Here, you will call your other method (below) which will be your recursion.
    // This method below will call itself several times. You may need to call it
    // more than once here.
     drawShape(startingDimension, g, x, y, 1);
  } // paintComponent(Graphics)
  
  // You will write another method here that is your recursion. This method should
  // take care of drawing the extra "branches" or shapes off of your original.
  // Which parameters this method takes depends entirely on the shapes you choose, but
  // you MUST send it the g parameter. In all likelihood, the other parameters will be
  // very similar to those you send to your built-in drawing method (like drawLine).
  // You will also likely send it some type of dimension related to your startingDimension
  // variable above--this will be checked against the minDimension below.
  public void drawShape(double dimension, Graphics g,double x, double y,int repeat)
  {
    // Here you will check that the dimension you are currently working with is in
    // fact still greater than the minimum you set earlier in the constructor.
    if(dimension > minDimension)
    {
      
      // Here, you will manipulate the variables that get sent recursively to this
      // method. How this is done depends entirely on the shape you chose.
      double last=dimension;
      dimension=dimension/1.5;
      if (repeat==1)
      {
      x=x-dimension;
      y=y-dimension;
      }
      else if (repeat==2)
      {
        x=x+last;
          y=y-dimension;
      }
      else if(repeat==3)
      {
        x=x+last;
        y=y+last;
      }
      else if (repeat==4)
      {
        x=x-dimension;
        y=y+last;
      }
      // Here you will draw the shape you are currently on. You will use the same
      // built-in method you called in the paintComponent method above (like drawLine).
       g.drawRect(((int)x),((int)y),((int)dimension),((int)dimension));
      
      // Here, you will perform the recursive calls to this current method. You will
      // likely do this as many times as you did at the bottom of the paintComponent
      // method. Send it the variables you altered just inside the if statement of
      // this method.
      drawShape(dimension, g, x, y, repeat);
    } // if
    repeat++;
    if (repeat<5)
      drawShape(startingDimension, g, 200, 200, repeat);
  } // drawShape(Graphics)
  
  public static void main(String[] args)
  {
    // Leave as-is; we are just creating the output window.
    JFrame aWindow = new JFrame();
    
    // Here, set the values you will send to the constructor. You have to play with
    // these--certain sizes work better for certain fractals.
    double windowW = 500.0;
    double windowH = 500.0;
    double startingDim = 100;
    double minDim = 5;
    
    // Here you will use your constructor created above.
    FractalPudell theFractal = new FractalPudell(windowW, windowH, startingDim, minDim);
    
    // Leave as-is; we are just setting up the output window.
    theFractal.setPreferredSize(new Dimension((int) windowW, (int) windowH));
    aWindow.add(theFractal);
    aWindow.pack();
    aWindow.setVisible(true);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  } // main(String[])
  
} // FractalPudell