/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Charles Babbage (replace with your name)
 * @version 06/11/17       (replace with today's date)
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
        // Addition
        System.out.println("Addition");
        System.out.println( "25 + 9=" + (25 + 9) );
        System.out.println( "43.21 + 3.14 + 10.0=" + (43.21 + 3.14 + 10.0) );
        //System.out.println();
        System.out.println();
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25=" + (11-9-25) );
        System.out.println( "3.14 - 10.0=" + (3.14-10.0) );
        //System.out.println();
        System.out.println();
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9=" + (25*9) ); 
        System.out.println("3.14 * 10.0 * 10.0=" + (3.14*10.0*10.0) );
        //System.out.println();
        System.out.println();
        // Division
        System.out.println("Division");
        System.out.println( "9 / 25=" + (9/25) );
        System.out.println( "43.21 / 10.0=" +(43.21/10/0) );
        //System.out.println();
         System.out.println();
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9=" + (11%9));
        System.out.println( "10.0 % 3.14=" + (10.0%3.14));
        //System.out.println();
        System.out.println();
        // 2.03 Additional int Equations
        
        double x = 2.5;
        double y = (2 * x);
        double z;
        
        z=(int)(x + (2 * y));
        
        System.out.println("Answer = " + z);
        
       
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
