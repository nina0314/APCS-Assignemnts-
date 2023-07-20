
/**
 * This program calculates the percentage of 3 different combinations of families with two children. 
 * 
 *
 * Nina Nielsen
 * 02/08/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        String token = " " ;
        File fileName = new File ("test2.txt");
        Scanner inFile = new Scanner(fileName);
        int familiesWithGG = 0;
        int familiesWithBB = 0;
        int familiesWithBG = 0;
        double percentOfGG;
        double percentOfBG; 
        double percentOfBB;
        while(inFile.hasNext())
        {
            token = inFile.next();
            
            if(token.equals("BB"))
            {
                familiesWithBB ++;
            }
            else if(token.equals("GB") || token.equals("BG"))
            {
                familiesWithBG ++;
            }
            else
            {
                familiesWithGG ++; 
            }
            
        }
     
     
        int total = (familiesWithBB + familiesWithBG + familiesWithGG);
     
     
        double BB = (double)(familiesWithBB);
        double BG = (double)(familiesWithBG);
        double GG = (double)(familiesWithGG);
        double total1 = (double)(total);
     
        percentOfBB = Math.round((BB / total1) * 100.0 * 100.0) / 100.0;
        percentOfBG = Math.round((BG / total1) * 100.0 * 100.0) / 100.0 ;
        percentOfGG = Math.round((GG / total1) * 100.0 * 100.0) / 100.0 ;
            
        System.out.println("Composition statistics for families with two children.");
        System.out.println();
        System.out.println("Total Number of Families: " + total ); 
        System.out.println();
        System.out.println("Number of families with: ");
        System.out.println("\t\t  2 boys: " + familiesWithBB + " represents: " + percentOfBB + " % ");
        System.out.println("\t\t 2 girls: " + familiesWithGG + " represents: " + percentOfGG + " % ");
        System.out.println("\t1 boy and 1 girl: " + familiesWithBG + " represents: " + percentOfBG + " % ");
     
    
}
}
