
/**
 * This program will calculate the average number of Hyenas before spotting a Striped Hyena. 
 *
 * Nina Nielsen
 * 06/08/2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class AnimalPopulation
{
    public static void main (String [ ] args) throws IOException 
    {
        //Initialise
        Scanner in = new Scanner(System.in); 
        Random randNumList = new Random();
        PrintWriter outFile = new PrintWriter(new File("Hyena.txt"));
        int trials; 
        int total = 0;   
        String border = "*****************************************************"; 
       
        //Gather input
        System.out.println("Welcome to the Striped Hyena Simulator ");
        System.out.println(); 
        System.out.println("How many trials should be simulated?");
        System.out.println();
        System.out.println("Please enter a value greater or equal to 1000: ");
        trials = in.nextInt();
        
        //Ask user to input again if their input was less than 1000
        while (trials < 1000)
        { 
            System.out.println("Please try again. Enter a number greater than 1000");
            trials = in.nextInt();
        }
        for(int loop = 1; trials >= 1000 && loop <= trials; loop++) 
        
        {
            int randNum = 0;
         while ((randNum) != 10) //Goes back when randNum equals 10
        {
            randNum = (randNumList.nextInt(10) + 1); //Randomises integers from 1 - 10
            outFile.println(randNum); //Prints all integers
            total ++ ; //Adds the total numbers 
            
        }
        }
        outFile.close( ); //Close file
        
        double average = (double) total / (double) trials; //Calculate Average
        double roundOff = Math.round(average * 100.0) / 100.0; //Round average to second decimal place
        System.out.println();
        System.out.println("Simulating trials now... please wait one moment..."); 
        System.out.println(); 
        System.out.println(border);
        System.out.println("\t\t The results: "); //Print results
        System.out.println("The average number of Hyenas observed until spotting a Striped Hyena at the wildlife park is: " + roundOff); //Print the average  
        
        
        
        
}
        
        
    
}
