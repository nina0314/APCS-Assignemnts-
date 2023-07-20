
/**
 * This program demonstrates how to assign values to individual
 * positions in a String array by reading the values from
 * a text file.
 *
 * @author Nina Nielsen
 * @version 12/08/18
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StringArrayDemoV3
{
    public static void main(String[ ] args) throws IOException
    {
        int index = 0;
        String [ ] dwarfNames = new String[7];
        File fileName = new File("seven.txt");
        Scanner inFile = new Scanner(fileName);

        // Input: read from text file and assign values one at a time to the array
        while (inFile.hasNext())
        {
            dwarfNames[index] = inFile.next();
            index++;
        }


        // Output: traverse the array and display the contents
        for(int n = 0; n < dwarfNames.length; n++)
        {
            System.out.println("Dwarf number " + (n + 1) + " is: "
                                  + dwarfNames[n] + ".  He is in array position "
                                  + n + ".");
        }
        inFile.close();
        
               double[] a1 = {1.2, 2.3, 3.4, 4.5, 5.6};

        double[] a2 = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] a3 = new double[5];


        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] + a2[i];
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a3[i]);
        }
    }

}
    //end of main method
//end of class
