/**
 *This project prints out the data of temperature and precipitation and 
 * calculates the average and total based on user input. 
 *
 * @author Nina Nielsen
 * @version 28/08/18
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static void main(String [] args)
    {
     //Initialize
     Scanner in = new Scanner(System.in); 
     
     String city = "Orlando,";
     String state = " Florida";
     String tempLabelF = "(F)";
     String tempLabelC = "(C)";
     String precipLabelIn = "(in.)";
     String precipLabelCm = "(cm.)";
     String [ ] monthOfYear = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
     double [ ] orlandoTempF = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2,82.4, 82.5, 81.1, 75.3,68.8, 63.0};
     double [ ] orlandoPrecipI = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
     double orlandoTempC;
     double orlandoPrecipCm;
     double total = 0;
     double average = 0;
     double sum = 0;
     String border = "*************************************************";
     
     //Ask user input
     System.out.printf("Please Select a temperature scale (F for Fahrenheit, C for Celsius): ");
     String userTemp = in.next();
     System.out.printf("Please Select a precipitation scale (i for Inches, c for Centimeters): ");
     String userPrecip = in.next();
     
    //Print data and calculate average/total based on user input
     if(userTemp.equalsIgnoreCase("C"))
    {
        if(userPrecip.equalsIgnoreCase("i"))
    {
     System.out.printf("%n\t\t Weather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelC + "     Precipitation" + precipLabelIn);
            System.out.printf("%n" + border); 
      for(int n = 0; n < monthOfYear.length; n++)
            {
            orlandoTempC = (( orlandoTempF[n] - 32.0) * 5.0) / 9;  //Convert Fahrenheit to Celsius
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , orlandoTempC, orlandoPrecipI[n]);
             total = total += orlandoPrecipI[n]; 
            sum = (sum + orlandoTempC);
            average = sum / monthOfYear.length;
            }  
     System.out.printf("%n" + border);
     System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
     
    }
    else if(userPrecip.equalsIgnoreCase("c"))
    {
        System.out.printf("%n\t\tWeather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelC + "     Precipitation" + precipLabelCm);
            System.out.printf("%n" + border);
        for(int n = 0; n < monthOfYear.length; n++)
            {
            orlandoTempC = (( orlandoTempF[n] - 32.0) * 5.0) / 9; //Convert Fahrenheit to Celsius
            orlandoPrecipCm = orlandoPrecipI[n] * 2.54; //Convert Inches to Centimeters
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , orlandoTempC, orlandoPrecipCm);
            total = total += orlandoPrecipCm;
            sum = (sum + orlandoTempC);
            average = sum / monthOfYear.length;
            }
        System.out.printf("%n" + border);
        System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
    }
    }
  
    if(userTemp.equalsIgnoreCase("F"))
    {
         if(userPrecip.equalsIgnoreCase("i"))
         {
            System.out.printf("%n\t\tWeather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelF + "     Precipitation" + precipLabelIn);
            System.out.printf("%n" + border);
            for(int n = 0; n < monthOfYear.length; n++)
            {
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , orlandoTempF[n], orlandoPrecipI[n]);
            total = total += orlandoPrecipI[n];
            sum = (sum + orlandoTempF[n]);
            average = sum / monthOfYear.length;
            }  
            System.out.printf("%n" + border);
            System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
         }
         else if(userPrecip.equalsIgnoreCase("c"))
         {
            System.out.printf("%n\t\tWeather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelF + "     Precipitation" + precipLabelCm);
            System.out.printf("%n" + border);
            for(int n = 0; n < monthOfYear.length; n++)
            {
            orlandoPrecipCm = orlandoPrecipI[n] * 2.54; //Convert Inches to Centimeters
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , orlandoTempF[n], orlandoPrecipCm);
            total = total += orlandoPrecipCm;
            sum = (sum + orlandoTempF[n]);
            average = sum / monthOfYear.length;
            } 
            System.out.printf("%n" + border);
            System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
         }
    }
     

    //Second set of Data 
    
   /*
    String city = "Tallahassee,";
     String state = " Florida";
     String tempLabelF = "(F)";
     String tempLabelC = "(C)";
     String precipLabelIn = "(in.)";
     String precipLabelCm = "(cm.)";
     String [ ] monthOfYear = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
     double [ ] TallahasseeTempF = {51.8, 54.8,61.1, 66.4, 74.4, 80.4,82.4, 82.1, 78.9, 69.1,60.4, 53.7};
     double [ ] TallahasseePrecipI = {5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};
     double TallahasseeTempC;
     double TallahasseePrecipCm;
     double total = 0;
     double average = 0;
     double sum = 0;
     String border = "*************************************************";
     
     System.out.printf("Please Select a temperature scale (F for Fahrenheit, C for Celsius): ");
     String userTemp = in.next();
     System.out.printf("Please Select a precipitation scale (i for Inches, c for Centimeters): ");
     String userPrecip = in.next();

     if(userTemp.equalsIgnoreCase("C"))
{
        if(userPrecip.equalsIgnoreCase("i"))
    {
     System.out.printf("%n\t\t Weather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelC + "     Precipitation" + precipLabelIn);
            System.out.printf("%n" + border); 
      for(int n = 0; n < monthOfYear.length; n++)
            {
            TallahasseeTempC = (( TallahasseeTempF[n] - 32.0) * 5.0) / 9;
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , TallahasseeTempC, TallahasseePrecipI[n]);
             total = total += TallahasseePrecipI[n];
            sum = (sum + TallahasseeTempC);
            average = sum / monthOfYear.length;
            }  
     System.out.printf("%n" + border);
     System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
    }
    else if(userPrecip.equalsIgnoreCase("c"))
    {
        System.out.printf("%n\t\tWeather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelC + "     Precipitation" + precipLabelCm);
            System.out.printf("%n" + border);
        for(int n = 0; n < monthOfYear.length; n++)
            {
            TallahasseeTempC = (( TallahasseeTempF[n] - 32.0) * 5.0) / 9;
            TallahasseePrecipCm = TallahasseePrecipI[n] * 2.54;
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , TallahasseeTempC, TallahasseePrecipCm);
            total = total += TallahasseePrecipCm;
            sum = (sum + TallahasseeTempC);
            average = sum / monthOfYear.length;
            }
        System.out.printf("%n" + border);
        System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
    }
}
   
if(userTemp.equalsIgnoreCase("F"))
{
         if(userPrecip.equalsIgnoreCase("i"))
         {
            System.out.printf("%n\t\tWeather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelF + "     Precipitation" + precipLabelIn);
            System.out.printf("%n" + border);
            for(int n = 0; n < monthOfYear.length; n++)
            {
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , TallahasseeTempF[n], TallahasseePrecipI[n]);
            total = total += TallahasseePrecipI[n];
            sum = (sum + TallahasseeTempF[n]);
            average = sum / monthOfYear.length;
            }  
            System.out.printf("%n" + border);
            System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
         }
         else if(userPrecip.equalsIgnoreCase("c"))
         {
            System.out.printf("%n\t\tWeather Data");
            System.out.printf("%n\t   Location: " + city + state);
            System.out.printf("%nMonth     Temperature " + tempLabelF + "     Precipitation" + precipLabelCm);
            System.out.printf("%n" + border);
            for(int n = 0; n < monthOfYear.length; n++)
            {
            TallahasseePrecipCm = TallahasseePrecipI[n] * 2.54;
            System.out.printf("%n%-7s%11.1f%22.1f", monthOfYear[n] , TallahasseeTempF[n], TallahasseePrecipCm);
            total = total += TallahasseePrecipCm;
            sum = (sum + TallahasseeTempF[n]);
            average = sum / monthOfYear.length;
            } 
            System.out.printf("%n" + border);
            System.out.printf("%n     Average: %4.1f        Annual: %6.1f", average,total);
        }
}
*/


}
}    

     


