
/**
 * This program calculates the distance in feet of the apple after launched at different speeds and angles. 
 *
 * @Nina Nielsen
 * @Nov 8 2018 
 */
public class CatapultApples
{
    /**
     * Constructor for objects of type CatapultApples
     * @nothing in parameter 
     */
    public CatapultApples()
    {
    }
    
    /**
     * method to calculate distance 
     * @parameter includes speed and angles 
     * @return distance 1
     */
    public double calcDistance(int speed, double angles)
    {
        double radians = Math.toRadians(angles);
        double sine = Math.sin(2 * radians);
        double distance = ((Math.pow((double)speed,2) * sine) / 9.8);
        double distance1 = distance * 3.2808;
        return distance1;
    }
}
