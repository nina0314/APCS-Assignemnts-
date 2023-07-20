
/**
 * This program finds the estimate of pi based on user input of number of trials and darts per trial. 
 *
 * Nina Nielsen
 * 10/03/2018
 */
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class EstimatePi
{
    public static int numberHits (int trials, int numberDarts)
    {
        //Initialize 
        int numHits = 0; 
        double [] x = new double [numberDarts];
        double [] y = new double [numberDarts];
        Random randNumList = new Random();
        for(int i = 0; i < trials; i++) //Create loop 
        {
           for ( i = 0; i < numberDarts; i++) //Create loop 
           {
               x[i] = (randNumList.nextDouble() * 1.0); //generate random numbers from 0.0 to 1.0  
               y[i] = (randNumList.nextDouble() * 1.0); //generate random number from 0.0 to 1.0
            
            if (Math.pow(x[i],2) + Math.pow(y[i],2) <= Math.pow(1,2)) 
            {
                numHits++; //Count number of hits only if it satisfies the equation above 
            }
        }
    }
    return numHits;  //return number of hits 
    }
    
    public static double PI (double numHits, int numberDarts, int trials)
    {
        double pi; //Initialize pi 
        pi = 4 * (numHits / numberDarts); //Calculate pi using the given formula 
        return pi; //return pi 
    }
    
    public static void results (int numberDarts, int trials)
    {
        double total = 0.0; //Initialize total 
        for(int i = 0; i < trials; i++)
        {
            double numHits = numberHits(trials,numberDarts); //Initialize number of hits 
            double pi = PI(numHits, numberDarts, trials); //Initialize pi 
            total += pi; //Calculate total 
            System.out.printf("%nTrials [ " + (i+1) + " ]: pi = %16f", pi); //Print out results 
        }
            double average; //Initialize average 
            average = (total/trials); //Calculate average
            System.out.printf("%nAverage Calculation of PI is: %4.6f", average); //Print out average 
    }
    
    public static void main (String [] args) throws IOException
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("How many darts per trial: "); //Ask for user input (darts per trial)
        int numberDarts = in.nextInt();
        System.out.printf("How many trials: "); //Ask for user input(number of trials)
        int trials = in.nextInt();
        double numHits = numberHits(trials,numberDarts); //Initialize number of hits 
        results(numberDarts,trials); //print results 
        }
        
    }
     

