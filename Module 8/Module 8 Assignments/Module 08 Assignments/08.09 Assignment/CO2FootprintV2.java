/**
 * Purpose: This class uses gallons and makes calculations to convert the gallons to pounds and tons. 
 * It contains mutator methods to calculate the CO2 in tons and CO2 in pounds
 * It contains getter methods of gallons, tons, and pounds.
 * Private instance variables include the myGallonsUsed, myTonsC02, and myPoundsC02
 *
 */
public class CO2FootprintV2
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    
    /**
     * Constructor for objects of type CO2FootprintV2
     * @parameter gallons is gallons of gas used 
     * PreCondition: gallons is a positive value 
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * mutator method to calculate the gas in tons (no parameter)
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed; //Conversion of Gallons to Tons
    }

    /** 
     * mutator method to convert tons to pounds (no parameter) 
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205; //Conversion of tons to pounds
    }

    /**
     * Getter method to return the gas used in gallons (no parameter)
     * @return gas used in gallons 
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * getter method to return the gas used in tons (no parameter)
     * @return gas used in tons
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * getter method to return the gas used in pounds (no parameter)
     * @return gas used in pounds
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

