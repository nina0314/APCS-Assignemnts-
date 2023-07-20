
/**
 * The purpose of this program is to demonstrate the PrintWriter 
 * class and its methods for writing to text files.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
class PrintWriterDemoV1
{
    public static void main (String [ ] args) throws IOException
    { 
       double randNum = 0;
       Random randNumList = new Random();
       PrintWriter outFile = new PrintWriter(new File("hello.txt"));
       
       for (int loop = 1; loop <= 5; loop++)
       {
           randNum = randNumList.nextDouble() * 1000.0;
           outFile.println(loop + randNum);
       }//end for loop

       outFile.close( );    //close the file when finished
    }//end of main method
}//end of class
