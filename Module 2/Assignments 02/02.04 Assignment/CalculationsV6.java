
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Nina Nielsen
 * @version 16/06/18       
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        
        int inum1 = 14;
        int inum2 = 190;
        int inum3 = 45;
        int inum4 = 3;
        int inum5 = 72;
        int inum6 = 25;
        int inum7 = 9;
        
        //Declare double variables
        double dNum1=43.21;
        double dNum2 =3.14;
        double dNum3 = 10.05;
        
        //Addition
        System.out.println("Addition:");
        System.out.print(inum1 + " + " + inum2 + " = ");  
        System.out.println(inum1+inum2);
        System.out.println(inum3 + " + " + inum4 + " = " + (inum3+inum4));
        //System.out.println();
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction:");
        System.out.print(inum1 + " - " + inum2 + " = ");
        System.out.println(inum1-inum2);
        System.out.println( inum3 + " - " + inum4 + " = " + (inum3-inum4));
        //System.out.println();
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication:");
        System.out.print(inum1 + " * " + inum6 + " = "); 
        System.out.println(inum1*inum6);
        System.out.println(inum1 + " * " + inum4 + " = "+ (inum1*inum4));
        //System.out.println();
        System.out.println();
        
        // Division 
        System.out.println("Division:");
        System.out.print(inum3 + " / " + inum4 +" = ");
        System.out.println(inum3/inum4);
        System.out.println(inum6 + " / " + inum1 + " = " + (inum6/inum1));
        //System.out.println();
         System.out.println();
         
        // Modulus 
        System.out.println("Modulus:");
        System.out.print(inum6 + " % " + inum4 + " = ");
        System.out.println(inum6%inum4);
        System.out.println(inum2 + " % " + inum1 + " = " + (inum2%inum1));
        //System.out.println();
        System.out.println();
        
        //Multiplication and Modulus
        System.out.println("Multiplication and Modulus:");
        System.out.print(inum4 + " * " + inum6 + " % " + inum3 + " = ");
        System.out.println(inum4*inum6%inum3);
        
        //Division and Addition
        System.out.println();
        System.out.println("Division and Addition:");
        System.out.print(inum6 + " / " + inum4 + " + " + inum1 + " = ");
        System.out.println(inum6/inum4+inum1);

         //Subtraction and Multiplication
        System.out.println();
        System.out.println("Subtraction and Multiplication:");
        System.out.print(inum1 + " - " + inum4 + " * " + inum7 + " = ");
        System.out.println(inum1-inum4*inum7);
        //System.out.println();
        System.out.println();
        
        // Addition with Doubles
        System.out.println("Addition with Doubles :");
        System.out.println(inum6 + " + " + inum7 + " = " + (inum6 + inum7));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        //System.out.println();
        System.out.println();
        
        //Addition 
        System.out.println("Division with Doubles:");
        System.out.print(dNum3 + " / " + inum6 + " = " );
        System.out.println(dNum3/inum6);
        //System.out.println();
        System.out.println();
        
        //Multiplication Adddition Division
        System.out.println("Multiplication, Addition, and Division with Doubles:");
        System.out.print(dNum2 + " * " + dNum1 + " + " + dNum3 + " / " + dNum2 + " = ");
        System.out.println(dNum2*dNum1+dNum3/dNum2);
        //System.out.println();
        System.out.println();
        
        //Division Modulus and Addition
        System.out.println("Division, Modulus, and Addition with Doubles:");
        System.out.print(dNum3 + " / " + dNum1 + " % " + dNum2 + " + " + dNum3 + " = ");
        System.out.println(dNum3/dNum1%dNum2+dNum3);
        //System.out.println();
        System.out.println();
        
        //Addition Substraction Multiplication
        System.out.println("Addition, Subtraction, and Multiplication with Doubles:");
        System.out.print(dNum1 + " + " + dNum3 + " - " + dNum2 + " * " + dNum3 + " = ");
        System.out.println(dNum1 + dNum3 - dNum2 * dNum3);
        //System.out.println();
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
