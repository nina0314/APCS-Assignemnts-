
/**
 * This program prints out how many calories each person had in a day and calculates the average between the calories they had at lunch and dinner. 
 *
 * Nina Nielsen
 * 29/10/2018
 */
public class V7ClassTester
{
    public static void main (String [] args)
    {
       
        //Invoke constructor  
        V7 person1 = new V7("Amanda", 560.5, 440.5);
        V7 person2 = new V7("Daniel", 650.5, 750.0);
        V7 person3 = new V7("Steward", 740.5, 500.0);
        
        //Invoke method 
        String name1 = person1.getName();
        String name2 = person2.getName();
        String name3 = person3.getName();
        double lunCal1 = person1.getLunCal();
        double lunCal2 = person2.getLunCal();
        double lunCal3 = person3.getLunCal();
        double dinCal1 = person1.getDinCal();
        double dinCal2 = person2.getDinCal();
        double dinCal3 = person3.getDinCal();
        
        
        
        //Print 
        System.out.printf("%n%65s","Calories intake in a day (per person)");
        System.out.printf("%n%n%9s%25s%28s%30s","Name","Lunch Calories", "Dinner Calories", "Average Calories");
        System.out.printf("%n---------------------------------------------------------------------------------------------");
        System.out.printf("%n%10s%18.2f%-1s%25.2f%-1s%26.2f%-1s", name1, lunCal1, "cal", dinCal1, "cal", person1.V7(),"cal");
        System.out.printf("%n%10s%18.2f%-1s%25.2f%-1s%26.2f%-1s",name2, lunCal2, "cal", dinCal2, "cal", person2.V7(),"cal");
        System.out.printf("%n%10s%18.2f%-1s%25.2f%-1s%26.2f%-1s",name3, lunCal3, "cal", dinCal3, "cal", person3.V7(),"cal");
    }
}
