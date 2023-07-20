
/**
 *  This class uses the number of trials and number of darts used to make calculations to find the number of hits and the average, maximum, and minimum pi..
 *
 * @author Nina Nielsen
 * @version Nov 4 2018
 */
import java.util.Random;
public class EstimatePITester
{
    public static void main (String [] args) 
    {
        //Initialize
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double total = 0.0;
        
        //Create Array of Data
        EstimatePI[] pi = {
        new EstimatePI(3466, 1), new EstimatePI(3000, 2),new EstimatePI(2034, 3),
        new EstimatePI(5430, 4), new EstimatePI(3546, 5),new EstimatePI(6543, 6), 
        new EstimatePI(7846, 7), new EstimatePI(5243, 8), new EstimatePI(5243, 9), 
        new EstimatePI(6345, 10), new EstimatePI(4756, 11)};
       
        //Invoke Methods
        for(int i = 0; i < pi.length; i++)
        {
            pi[i].calcNumberHits();
            pi[i].calcPI();
        }
        
        //Print out table 
       System.out.println("             Average PI per Trial                 "); 
       System.out.println("|       |            |              |            |");
       System.out.println("|       |            |              |            |");
       System.out.println("| Trial | # of Darts |  # of Hits   |     PI     |");
       System.out.println("|-------|------------|--------------|------------|");
        for(int i = 0; i < pi.length; i++)
        {
            System.out.println(pi[i]);
        }
       System.out.println("--------------------------------------------------"); 
        for (int i = 0; i < pi.length; i++) //Calculate max and min using loop
        {
            if(pi[i].getCalcPI() < min)
            min = pi[i].getCalcPI(); //Print minimum value
            if(pi[i].getCalcPI() > max)
            max = pi[i].getCalcPI(); //Print maximum value 
        }
       System.out.printf("%37s%10.3f","Minimum:",min); //print minimum
       System.out.printf("%n%37s%10.3f","Maximum:",max); //print maximum 
       for(int i = 0; i < pi.length; i ++)
        {
           total += pi[i].getCalcPI(); //Find total 
        }
        double average = total / pi.length; //Calculate Average
       System.out.printf("%n%37s%10.3f","Average:", average); //Print average 
    }
}
