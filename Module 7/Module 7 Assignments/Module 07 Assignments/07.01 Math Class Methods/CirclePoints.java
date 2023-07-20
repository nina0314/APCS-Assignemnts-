
/**
 * This program asks for user to input radius and x coordinate. Then it calculates the y value and prints the output. 
 *
 * Nina Nielsen
 * 12/09/2018
 */
import java.util.Scanner;
public class CirclePoints
{
    public static void main(String[ ] args)
    {
      //Initialize
      Scanner in = new Scanner(System.in); 
      double radius; 
      double xCoordinate;
      double yValue;
      double xValue;
      
      String x1 = "x1";
      String y1 = "y1";
      String x2 = "x2";
      String y2 = "y2";
      String border = "**************************************************************";
      
      System.out.printf("Enter radius (Ex. 1.0): "); //Ask for user to input radius 
      radius = in.nextDouble();
      
      System.out.printf("Enter x coordinate (Ex. 0.1):"); //Ask for user to input x coordinate 
      xCoordinate = in.nextDouble(); 
      
      System.out.printf("%n\t       Points on a circle with a Radius of " + radius); //Print output 
      System.out.printf("%n%n%11s%16s%16s%16s", x1 , y1, x2, y2);
      System.out.printf("%n   " + border);
      double x = radius; 
      
      for(int i = 0; i <= 20; i ++) //Create loop 
      {
          yValue = Math.sqrt(Math.pow(radius,2) - Math.pow(x,2));  //Calculate y coordinate 
          System.out.printf("%n%12.2f%16.2f%16.2f%16.2f",x, yValue, x,  (0 - yValue)); //Print out x and y coordinate 
          x = x - xCoordinate; 
       }
      System.out.printf("%n   " + border);
    }
}
