
/**
 * The purpose of this program is to illustrate the use of the
 * Math class ranomd() method.
 *
 * @author Nina Nielsen
 * @version 26/07/18
 */
import java.util.Scanner;
public class RandomMethodDemo
{
    public static void main(String [] args)
    {
        double randomNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your terminator");
        int terminator = in.nextInt(); 
        int counter = 1;
        System.out.println("Random Number from .4 to .6");
        while(counter <= terminator)
        {
            randomNumber = Math.random();
            counter ++;
           if( randomNumber < 0.90 && randomNumber > 0.24 )
        {
            System.out.println(counter + ": " + randomNumber);
            
        }
        }//end of while loop
        
        
    }//end of main method
}//end of class


/*
 *

if( randomNumber > 0.4 && random number < 0.6 )
{

}
 */