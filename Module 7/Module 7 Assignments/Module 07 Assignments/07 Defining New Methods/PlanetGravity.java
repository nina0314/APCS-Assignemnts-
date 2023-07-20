
/**
 * This program calculates the diameter, mass, and surface gravity of each planet. 
 *
 * Nina Nielsen
 * 10/1/2018
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PlanetGravity
{
    public static double [] gravity(double[] diameter, double [] mass)
    {
        double [] surfaceGravity = new double [diameter.length]; //Initialize array 
        
        for(int i = 0; i < diameter.length; i++) 
        {
            double gravConstant = 6.67E-11;
            double radius = (diameter[i] * 1000) / 2; //calculate radius 
            double radiusM = Math.pow(radius,2);
            surfaceGravity [i] = (gravConstant * mass[i]) / radiusM; //Calculate surfaceGravity 
            
        } 
        return surfaceGravity;
    }
    public static void printResults (String [] planet, double [] diameter, double[] mass, double[] surfaceGravity)
    {
        System.out.printf("%n%35s","Planetary Data");
        System.out.printf("%n%-14s%7s%14s%18s%n","Planet","Diameter(km)","Mass(kg)","g(m/s^2)");
        System.out.printf("**********************************************************");
        for(int i = 0; i < planet.length; i ++)
        {
            System.out.printf("%n%-14s%7.0f%19.2e,%15.2f%n",planet[i],diameter[i],mass[i],surfaceGravity[i]); //Print planet, diameter, mass, and surface Gravity 
        }
    }
    
    public static void file (double[] surfaceGravity)throws IOException
    {
        PrintWriter outFile = new PrintWriter (new File("surfaceGravity.txt"));
        double [] result = surfaceGravity;
        for(int i = 0; i < result.length; i ++) //Print surfaceGravity to file 
        {
            outFile.printf("%-7.2f%n",result[i]);
        }
        outFile.close(); //Close file 
    }
    
    public static void main (String [] args) throws IOException
    {
        String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter","Saturn", "Uranus", "Neptune"}; //Initialize array 
        double [] diameter = {4880,12103.6,12756,6794,142984,120536,51118,49532}; //Initialize array 
        double [] mass = {3.30E23,4.869E24,5.972E24,6.4219E23,1.900E27,5.68E26,8.683E25,1.0247E26};  //intialize array 
        double [] surfaceGravity = gravity(diameter,mass);  //Initialize array
        printResults(planet, diameter, mass, surfaceGravity); //Print results 
        file(surfaceGravity); //Print surfaceGravity to file 
    }
    
}

