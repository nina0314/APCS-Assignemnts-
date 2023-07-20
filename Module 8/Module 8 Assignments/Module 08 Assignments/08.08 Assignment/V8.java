
/**
 * This program prints out how many calories each person had in a day and calculates the average between the calories they had at lunch and dinner. 
 *
 * Nina Nielsen
 * 10/29/2018
 */
public class V8
{
    //declare private instance 
    private String myName;
    private double myLunchCalories, myDinnerCalories, myAverageCalories;
    private int myAge; 
    
    
    public V8 (String name, int age, double lunCal, double dinCal) 
    {
        myName = name;
        myAge = age; 
        myLunchCalories = lunCal; 
        myDinnerCalories = dinCal;
        myAverageCalories = 0.0;
    }
    
    //Calculate Average Calories 
    public double calcAvgCalories () //Calculate average calories between the two
    {
        return (myLunchCalories + myDinnerCalories) / 2;
    }
    
    //GetAverageCalories 
    public double getAverageCalories()
    {
       return myAverageCalories;
    }
    
    //GetName
    public String getName()
    {
        return myName;
    }
    
    //GetAge
    public int getAge()
    {
        return myAge;
    }
    
    //GetLunchCalories
    public double getLunCal()
    {
        return myLunchCalories;
    }
    
    //GetDinnerCalories
    public double getDinCal()
    {
        return myDinnerCalories;
    }
    
    //SetAge
    public void setAge (int age)
    {
        myAge = age;
    }
    
    //SetLunchCalories
    public void setLunCal(double lunCal)
    {
        myLunchCalories = lunCal; 
    }
    
    
    //SetDinnerCalories
    public void setDinCal(double dinCal)
    {
        myDinnerCalories = dinCal;
    }
    
    
    public String toString()
    {
        return String.format("%n%10s%18d%22.2f%-1s%27.2f%-1s%30.2f%-1s", myName, myAge, myLunchCalories,"cal",myDinnerCalories,"cal",calcAvgCalories(),"cal"); 
    }
}
