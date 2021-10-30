
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 *
 * @author Charles Babbage 
 * @version 06/05/17
 */
import java.util.Scanner;
public class HeadsOrTailsV2
{
    public static void main(String[] args)
    {
        // Declare and initialize variables
        int blue = 0;
        int red = 0;
        int yellow = 0;
        int green = 0;
        int spinnerCount = 0;
        int totalSpins = 0;
        double randNum = 0.0;
        

        
       

        // Simulate flipping coins.
        while(spinnerCount < 15)
        {
            randNum = Math.random();
            System.out.print(spinnerCount + "\t" + randNum);

            if(randNum < 0.25)        
            {
                blue++;
                System.out.println("\t blue");
            }
            else if(randNum >= 0.25 && randNum < 0.5)
            {
                red++;
                System.out.println("\t red");
            }
            else if(randNum >= 0.5 && randNum < 0.75)
            {
                yellow++;
                System.out.println("\t yellow");
            }
               else
           {
               green++;
               System.out.println("\t green");
           }
            spinnerCount++;

        }//end while

         int num = 0;
   while(num < 5)
   {
     num++;
     System.out.print(num + " ");
   }
   System.out.println(num);
    }
}
