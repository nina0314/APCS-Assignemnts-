
/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Nina Nielsen
 * @version 27/07/18
 */
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        double counter = 0;
        double theTerminator = 150;          //initialize the terminating value
        
        
        while(counter < theTerminator)     //test the terminating condition
        {
            System.out.println("counter = " + (theTerminator - counter));
            counter++;
        }//end of while loop

    }//end of main method
}//end of class
