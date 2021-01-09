
/**
 * The purpose of this program is to illustrate providing
 * a menu for the user and the use of methods for String
 * comparisons.
 *
 * @author George Boole
 * @version 06/04/17
 */
import java.util.Scanner;
public class MathMenu
{
    public static void main(String [] args)
    {
        int answer;                                 //variable for answer to arithmetic calculations
        Scanner in = new Scanner(System.in);        //Scanner class object
        


        //Input
        System.out.println("This program will perform arithmetic operations");
        System.out.println("on two numbers you enter.  Do not enter a 0, please.");
        System.out.println();
        System.out.print("Please enter two integers separated by a space: ");
        int num1 = in.nextInt();                    //first number entered
        int num2 = in.nextInt();                    //second number entered
        System.out.println();
       
       
        //Display menu
        System.out.println("Select a letter that corresponds to a menu option");
        System.out.println("[A] Addition");
        System.out.println("[S] Subtraction");
        System.out.println("[M] Multiplication");
        System.out.println("[D] Division");
        System.out.println("[R] Remainder");
        System.out.println("[Q] Quit");
        System.out.print("Enter A, S, M, D, R, or Q: ");
        String choice = in.next();
        System.out.println();

        // Perform requested arithmetic and print answer
        if(choice.equalsIgnoreCase("A"))              //why isn't the equals() method used here?
        {
            System.out.println("You chose A for addition");
            System.out.print(num1 + " plus " + num2 + " equals ");
            answer = num1 + num2;
            System.out.println(answer);
        }
        else if(choice.equalsIgnoreCase("S"))
        {
            System.out.println("You chose S for subtraction");
            System.out.print(num1 + " minus " + num2 + " equals ");
            answer = num1 - num2;
            System.out.println(answer);
        }
        else if(choice.equalsIgnoreCase("M"))
        { 
            System.out.println("You chose M for multiplication");
            System.out.print(num1 + " multiply " + num2 + " equals ");
            answer = num1 * num2;
            System.out.println(answer);
        }
        else if(choice.equalsIgnoreCase("D"))
        {
            System.out.println("You chose D for division");
            System.out.print(num1 + " divide " + num2 + " equals ");
            answer = num1 / num2;
            System.out.println(answer);
        }
        else if(choice.equalsIgnoreCase("R"))
        {
            System.out.println("You chose R for remainder");
            System.out.print(num1 + " remainder " + num2 + " equals ");
            answer = num1 % num2;
            System.out.println(answer);
        }
        else if(choice.equalsIgnoreCase("Q"))
        {
            System.out.println("You chose Q for Quit");
            System.out.println("You have quit this performance");
        }
        else
        {
             System.out.println("You did not choose a valid menu option!");
        }
          
          String word = "sunflower";
          String x = word.substring(3);
          String y = word.substring (3,9);
          if (x==y)
          System.out.print(1);
          else if (x.equals(y))
          System.out.print(2);
          else 
          System.out.print(3);
          
     }//end of main method
}//end of class

