
/**
 * This program reads the data that includes the surfaceGravity of each planet and calculates the weight of the user on those planets based on their input. 
 *
 * Nina Nielsen
 * 10/1/2018
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
public class PlanetWeight
{
    public static double [] readGravity (String [] planets) throws IOException
    {
        double [] surfaceGravity = new double [planets.length]; //Initialize array
        File fileName = new File ("surfaceGravity.txt"); 
        Scanner inFile = new Scanner (fileName);
        while (inFile.hasNextLine())
        {
            for(int i = 0; i < planets.length; i++) //read surfaceGravity from file 
            {
                surfaceGravity[i] = inFile.nextDouble();
                                    inFile.nextLine();
            }
        }
        inFile.close();
        return surfaceGravity; //Return surfaceGravity
    }
    
    public static double[] weightPlanet(double surfaceGravity [], double userpounds, String[] planets)
    {
        double [] weight = new double [planets.length]; //Initialize array
        for(int i =0; i < planets.length; i++) //calcualte weight based on each planet
        {
            weight[i] = (userpounds / 9.79) * surfaceGravity[i];
        }
        return weight; //return weight 
    }
    
    public static void results (String[] planet, double[] surfaceGravity, double[] weight)
    {
        System.out.printf("%n\t%34s", "My Weights on the Planets"); 
        System.out.printf("%n\t%8s%18s%21s", "Planet","Gravity","Weight (lbs)");
        System.out.printf("%n  ******************************************************");
        for(int i =0; i < planet.length; i++) //print planet surfaceGravity and weight 
        {
            System.out.printf("%n%16s%16.2f%19.2f%n",planet[i],surfaceGravity[i],weight[i]); 
        }
        System.out.printf("%n  ******************************************************");
    }
    
    public static void main (String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in); 
        System.out.printf("%n Please enter your weight in pounds (Ex.150 pounds)"); //Ask user input 
        double userpounds = in.nextDouble();
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter","Saturn", "Uranus", "Neptune"}; //Initialize array
        double [] surfaceGravity = readGravity(planets); //Initialize array
        double [] weight = weightPlanet(surfaceGravity,userpounds,planets); //Initialize array
        results(planets,surfaceGravity,weight); //Print results 
        
    }
}
