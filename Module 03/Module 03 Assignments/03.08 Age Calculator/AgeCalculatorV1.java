/**
 * The purpose of this program is to calculate your age in minutes
 *
 * @Nina Nielsen
 * @02/07/2018
 */
import java.util.Scanner;
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {
        //construct a Scanner object called in
        Scanner in = new Scanner(System.in);
        
        
        //ask user for input
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");

        System.out.print("Please enter your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);

        //calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        double ageInHours = (int)approxAgeInDays * 24;
        double ageInMinutes = ageInHours * 60;
        
        String firstInitial = firstName.substring(0, 1);
        String name = firstInitial + "." + lastName;

        // display name and minutes to screen
        System.out.println("Name: " + name);
        System.out.print("\t\t Age in Minutes: " + ageInMinutes + "\n");
        
        
        
        
    }
}
