/**
 * This program demonstrates how to assign values to individual
 * positions in a String array.
 *
 * @author Nina Nielsen
 * @version 27/08/18
 */
import java.util.Scanner;

public class AnnualWeatherV1
{
    public static void main(String [] args)
    {
     String city = "Orlando,";
     String state = " Florida";
     String [ ] monthOfYear = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
     double [ ] orlandoTemp = {60.9, 62.6,67.4, 71.5, 77.1, 81.2,82.4, 82.5, 81.1, 75.3,68.8, 63.0};
     double [ ] orlandoPrecip = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
     double total = 0;
     double average = 0;
     double sum = 0;
     String border = "*************************************************";
       for( int n = 0; n < monthOfYear.length; n++)
        {
            total = total += orlandoPrecip[n];
            sum = (sum + orlandoTemp[n]);
            average = sum / monthOfYear.length;
        }
     System.out.println("\t\tWeather Data");
     System.out.println("\t   Location: " + city + state);
     System.out.println("\nMonth     Temperature (F)    Precipitation (in.)");
     System.out.println(border);
     for(int n = 0; n < monthOfYear.length; n++)
     {
         System.out.println(monthOfYear[n] + "\t\t" + orlandoTemp[n] + "\t\t" + orlandoPrecip[n]);
     }
       
     System.out.println(border);
     System.out.println("   Average: " + average + "    Annual: " + total);
}
}
