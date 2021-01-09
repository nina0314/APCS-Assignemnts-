
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Nina Nielsen
 * @version 16/06/18       
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        
        int a = 14;
        int b = 190;
        int c = 45;
        int d = 3;
        int f = 72;
        //Addition
        System.out.println("Addition");
        System.out.print(a + "+" + b + "=");  
        System.out.println(a+b);
        System.out.println(c + "+" + d + "=" + (c+d));
        //System.out.println();
        System.out.println();
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( a + "-" + b + "=");
        System.out.println(a-b);
        System.out.println( c + "-" + d + "=" + (c-d));
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
        
        //Multiplication
        System.out.println("Multiplication!");
        System.out.println (d + "*" + f + "=");
        System.out.println(d*f);
        //Division
        System.out.println();
        System.out.println("Division");
        System.out.println(f + "/" + d + "=");
        System.out.print(f/d);
        // 2.03 Additional int Equations
        System.out.println();
        
        System.out.println('8' + '2');
        System.out.println(" 128" + "32");
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
