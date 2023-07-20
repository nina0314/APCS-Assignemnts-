
/**
 * This program calculates the distance in feet of the apple after launched at different speeds and angles.  
 *
 * @Nina Nielsen
 * @Nov 8 2018
 */
public class CatapultApplesTester
{
    public static void main (String [] args)
    {
        //Initialize 
        int [] speed = { 20, 25, 30, 35, 40 };
        double [] angles = { 25, 30, 35, 40, 45, 50};
        
        //Initialize double array
        double distance[][] = new double [speed.length][angles.length];
        
        //Invoke Constructor
        CatapultApples projectile = new CatapultApples();
        
        //Print 
        System.out.printf("%55s","Projectile Distance (feet)");
        System.out.println();
        System.out.printf("%n%5s%14s%14s%14s%14s%14s%14s", "MPH","25deg","30deg","35deg","40deg","45deg","50deg");
        System.out.printf("%n*****************************************************************************************");
        for(int row = 0; row < speed.length; row++)
        {
            System.out.printf("%n%4d ", speed[row]);
            for(int col = 0; col < angles.length; col++)
            {
                distance[row][col] = projectile.calcDistance(speed[row],angles[col]);
                System.out.printf("%14.2f", distance[row][col]);
            }
        }
    }
}
