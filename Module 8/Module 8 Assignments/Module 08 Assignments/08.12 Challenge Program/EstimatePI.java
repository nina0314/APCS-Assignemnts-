
/**
 *Purpose: This class uses the number of trials and number of darts used to make calculations to find the number of hits and the average, maximum, and minimum pi.. 
 * It contains mutator methods to calculate the number of hits and pi.
 * It contains getter methods of trials, numberDarts,numberHits, and PI.
 * Private instance variables include the myTrials, myNumberDarts, myCalcNumberHits, myCalcPI, myCalcAveragePi, myMinimum, myMaximum.
 *
 */
import java.util.Random;

public class EstimatePI
{
    //Declare private variables
    private int myTrials, myNumberDarts,myCalcNumberHits;
    private double myCalcPI, myCalcAveragePi, myMinimum, myMaximum; 
            
    //constructor for objects of type EstimatePI
    /**
     * Constructor for objects of type EstimatePI
     * @parameter number of Darts used in each trial
     * @parameter number of trial
     * 
     */
    EstimatePI(int numberDarts, int trials) 
    {
        myNumberDarts = numberDarts;
        myTrials = trials;
        myCalcNumberHits = 0;
        myCalcPI = 0.0;
        myCalcAveragePi = 0.0;
    }
    
    //getter method to return the value of the number of trials
    /**
     * Getter method to return the trial number (no parameter)
     * @return trial number 
     */
    public int getTrials()
    {
        return myTrials;
    }
    
    //getter method to return the value of the number of darts
    /**
     * Getter method to return the number of darts (no parameter)
     * @return number of darts
     */
    public int getNumberDarts()
    {
        return myNumberDarts;
    }
    
    //mutator method to calculate the number of hits
    /**
     * mutator method to calculate the number of hits (no parameter)
     */
    public void calcNumberHits()
    {
        double [] x = new double [myNumberDarts];
        double [] y = new double [myNumberDarts];
        Random randNumList = new Random();
        for(int i = 0; i < myTrials; i++)
            for(i = 0; i < myNumberDarts; i++)
            {
            x[i] = (randNumList.nextDouble() * 1.0); //generate random numbers from 0.0 to 1.0  
            y[i] = (randNumList.nextDouble() * 1.0); //generate random number from 0.0 to 1.0
            
            if (Math.pow(x[i],2) + Math.pow(y[i],2) <= Math.pow(1,2)) 
            {
                myCalcNumberHits ++;
                //Count number of hits only if it satisfies the equation above 
            }
            
            }
        
    }
    
    //getter method to return the value of the number of hits
    /**
     * Getter method to return the number of hits (no parameter)
     * @return number of hits 
     */
    public int getCalcNumberHits()
    {
        return myCalcNumberHits;
    }
    
    //mutator method to calculate the PI
    /**
     * mutator method to calculate the pi (no parameter)
     */
    public void calcPI()
    {
        myCalcPI = 4 * ((double) myCalcNumberHits /(double) myNumberDarts);
    }
     
    //getter method to return the value of PI
    /**
     * Getter method to return pi (no parameter)
     * @return pi  
     */
    public double getCalcPI()
    {
        return myCalcPI;
    }
 
    // returns a String of the object's values. 
    public String toString()
    {
        return String.format("%n%3s%-1d%-1s%11d%14d%16.3f","[",myTrials,"]", myNumberDarts, myCalcNumberHits, myCalcPI);
    }
    
}
