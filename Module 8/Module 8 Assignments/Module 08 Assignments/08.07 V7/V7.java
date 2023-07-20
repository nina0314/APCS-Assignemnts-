
/**
 * This program prints out how many calories each person had in a day and calculates the average between the calories they had at lunch and dinner. 
 *
 * Nina Nielsen
 * 10/29/2018
 */
public class V7
{
    private String myName;
    private double myLunchCalories;
    private double myDinnerCalories;
    
    public V7 (String name,double lunCal, double dinCal)
    {
        myName = name;
        myLunchCalories = lunCal; 
        myDinnerCalories = dinCal; 
    }
    
    public double V7 () //Calculate average calories between the two
    {
        return (myLunchCalories + myDinnerCalories) / 2;
    }
    
    public int calcAvgCalories(int lunCal, int dinCal)
    {
        return (int) (myLunchCalories + myDinnerCalories) / 2;
    }
    
    public String getName()
    {
        return myName;
    }
    
    public double getLunCal()
    {
        return myLunchCalories;
    }
    
    public double getDinCal()
    {
        return myDinnerCalories;
    }
    
}
