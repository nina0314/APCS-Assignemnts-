/**
 *  Purpose: This program uses the gallons of gas emissions and converts it into pounds and tons and prints the results.
 *  
 * @ Name: Nina Nielsen
 * 
 * @ Date: Oct 31 2018
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        double gallonsOfGas = 2410; //Initialize gallonsOfGas 

        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas); //Invoke method 
        footprint.calcTonsCO2(); //Invoke calcTonsCO2 method 
        footprint.convertTonsToPounds(); //Invoke convertTonstoPounds() method 

        //Print 
        System.out.println("           CO2 Emissions"); 
        System.out.println("  Gallons   Pounds      Tons"); 
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(), //Print getGallons method
                                                      footprint.getPoundsCO2(), //Print getPoundsC02 method
                                                      footprint.getTonsCO2()); //Print getTonsC02 method 

        System.out.println();
    }
}

