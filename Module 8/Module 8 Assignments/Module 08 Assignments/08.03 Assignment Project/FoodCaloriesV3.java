
/**
 * This program uses the two calories of pizza and pasta to find the difference between them and the average of the two. 
 *
 * Nina Nielsen
 * 10/27/2018
 */
public class FoodCaloriesV3
{
    public FoodCaloriesV3() //Constructor 
    {
    }
    
    public double calcDiffCalories (double c1, double c2) //Calculate Difference in calories
    {
        return c1 - c2;
    }
    
    public double calcAvgCalories (double c1, double c2) //Calculate average calories between the two
    {
        return (c1 + c2) / 2;
    }
    
    public static void main (String [] args)
    {
        //Initialize
        double pizza, pasta, differenceCalories, averageCalories;
        
        pizza = 266.0; 
        pasta = 200.0;
        
        //Invoke constructor  
        FoodCaloriesV3 calories = new FoodCaloriesV3();
        
        //Invoke method 
        differenceCalories = calories.calcDiffCalories(pizza,pasta);
        averageCalories = calories.calcAvgCalories(pizza,pasta);
        
        //Print 
        System.out.printf("%n%73s","Calories of Pizza and Pasta (per 100 grams)");
        System.out.printf("%n%n%18s%25s%22s%36s","Pizza Calories (100g)","Pasta Calories (100g)", "Diff. of Calories", "Average Calories Between the Two");
        System.out.printf("%n--------------------------------------------------------------------------------------------------------");
        System.out.printf("%n%9.2f%-1s%22.2f%-1s%24.2f%-1s%25.2f%-1s",pizza ,"cal", pasta,"cal", differenceCalories ,"cal" , averageCalories , "cal");
        
    }
}
