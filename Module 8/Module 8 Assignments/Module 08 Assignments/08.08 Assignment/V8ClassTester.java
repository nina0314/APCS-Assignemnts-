
/**
 * This program prints out how many calories each person had in a day and calculates the average between the calories they had at lunch and dinner. 
 *
 * Nina Nielsen
 * 29/10/2018
 */
public class V8ClassTester
{
    public static void main (String [] args)
    {
        //Initialize 
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double total = 0.0; 
        
        //Invoke constructor  
        V8[] person = {new V8 ("Amanda", 14,  560.5, 440.5),
                       new V8("Daniel", 16,  650.5, 750.0),
                       new V8("Steward",18,  740.5, 500.0)};
             
        
        //Print 
        System.out.printf("%n%73s","Calories intake in a day (per person)");
        System.out.printf("%n%n%9s%20s%26s%30s%33s","Name","Age","Lunch Calories", "Dinner Calories", "Average Calories");
        System.out.printf("%n----------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < person.length; i ++) //for loop 
        {
         person[i].getName();
         person[i].getAge();
         person[i].getLunCal();
         person[i].getDinCal();
         person[i].getAverageCalories();
         person[i].calcAvgCalories();  
        }
        for(int i = 0; i < person.length; i++) //for loop 
        {
            System.out.println(person[i]); //The toString() method prints object
        }
        System.out.printf("%n----------------------------------------------------------------------------------------------------------------------");
         for(int i = 0; i < person.length; i++) //for loop 
        {
        if(person[i].calcAvgCalories() < min) 
        
            min = person[i].calcAvgCalories(); //Calculate average calories 
        
        if(person[i].calcAvgCalories() > max)
        
            max = person[i].calcAvgCalories(); //Calculate average calories 
        
        }
        
        System.out.printf("%n%103s%10.2f%-1s","Minimum",min, "cal"); //print minimum
        System.out.printf("%n%103s%10.2f%-1s","Maximum",max, "cal"); //print maximum 
        
        for(int i = 0; i < person.length; i ++)
        {
           total += person[i].calcAvgCalories(); //Find total 
        }
        double average = total / person.length; //Average 
        
        System.out.printf("%n%103s%10.2f%-1s","Average", average, "cal"); //Print average 
        }
}

