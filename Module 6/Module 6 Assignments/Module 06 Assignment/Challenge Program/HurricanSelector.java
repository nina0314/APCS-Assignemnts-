
/**
 * This program prints out data (category, pressure, mph..) of Hurricanes based on the range of years the user inputs (1995 to 2015).
 *
 * @Nina Nielsen
 * @01/09/2018
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class HurricanSelector
{
  public static void main(String[] args) throws IOException
  {
        //Initialize
        int total = 0;
        int arrayLength = 0;
        int category1 = 0;
        int category2 = 0;
        int category3 = 0;
        int category4 = 0;
        int category5 = 0;
        int minCategory = Integer.MAX_VALUE;
        int maxCategory = Integer.MIN_VALUE;
        int minPressure = Integer.MAX_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        double minWindSpeed = Integer.MAX_VALUE;
        double maxWindSpeed = Integer.MIN_VALUE;
        
        Scanner in = new Scanner(System.in); //Initialize user input scanner method 
        File fileName = new File("HurricaneData.txt"); 
        Scanner inFile = new Scanner(fileName); //Read inFile 
        
        //Calculate the arrayLength 
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            total ++;
        }
        arrayLength += total; //Assign arrayLength to the length of array 
   
        inFile.close(); //Close inFile
        
        //Initialize all arrays
        int [ ] year = new int [arrayLength];
        int [ ] category = new int [arrayLength];
        int [ ] wind = new int [arrayLength];
        int [ ] pressure = new int [arrayLength];
        String [ ] month = new String [arrayLength];
        String [ ] name = new String [arrayLength];
        double [ ] windMph = new double [arrayLength];
        
        //Read inFile1 
        File fileName1 = new File("HurricaneData.txt"); 
        Scanner inFile1 = new Scanner(fileName1);
        
        //Fill in data for each array 
        while(inFile1.hasNextLine())
        {
        for(int i = 0; i < arrayLength; i++)
        {
            year[i] = inFile1.nextInt();
            month[i] = inFile1.next();
            pressure[i] = inFile1.nextInt();
            wind[i] = inFile1.nextInt();
            name[i] = inFile1.next();
            windMph[i] = wind[i] * 1.15078; //Convert wind (knot) to mph 
       
        }
        
        }
          
    
      inFile1.close(); //Close inFile1
          
       
        //Initialize variables
        int n = 0;
        double categoryAvg = 0;
        double pressureAvg = 0;
        double mphAvg = 0;
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        String y = "Year";
        String h = "Hurricane";
        String c = "Category";
        String p = "Pressure (mb)";
        String s = "Wind Speed (mph)";
        String border = "*****************************************************************************";
        
        
        //Ask user for range 
        System.out.printf("Please enter starting year (1995 - 2015): "); //First year 
        int userStartYear = in.nextInt();
        System.out.printf("Please enter ending year (1995 - 2015): "); //Last year 
        int userEndYear = in.nextInt(); 
        
        //Ask user to try again if the range is invalid 
        while((userStartYear < 1995 || userStartYear > 2015) || (userEndYear < 1995 || userEndYear > 2015))
        {
            System.out.printf("Invalid range! Please try again!");
            System.out.printf("\nPlease enter starting year (1995 - 2015): ");
            userStartYear = in.nextInt();
            System.out.printf("Please enter ending year (1995 - 2015): ");
            userEndYear = in.nextInt();
        }
        
        //Assign each hurricane to a category and find total of number of each categories within the range  
        for(int i = 0; i < arrayLength; i++)
        {
            if(year[i] >= userStartYear && year[i] <= userEndYear)
            {
            if(windMph[i] <= 95.0) //Assign hurricane to category 1 if less or equal to 95.0
            {
                category[i] = 1;
                category1++;
            }
            else if(windMph[i] >= 96.0 && windMph[i] <= 110.0) //Assign hurricane to category 2 if equal or more than 96 and less or equal to 110.0
            {
                category[i] = 2;
                category2++;
            }
            else if(windMph[i] >= 111.0 && windMph[i] <= 129.0) //Assign hurricane to category 3 if equal or more than 111.0 and less or equal to 129.0
            {
                category[i] = 3;
                category3++;
            }
            else if(windMph[i] >=130.0 && windMph[i] <= 156.0) //Assign hurricane to category 4 if equal or more than 130.0 and less or equal to 156.0
            {
                category[i] = 4;
                category4++;
            }
            else //Assign hurricane to category 5 if more or equal to 157.0 
            {
                category[i] = 5;
                category5++; 
            }
          
           }
        }
        
        //Print heading of range 
        System.out.printf("%n%35s to %4s",userStartYear,userEndYear); 
        System.out.printf("%n%n%-9s%10s%15s%20s%23s",y,h,c,p,s); // Year, Hurricane, Category, Pressure, Speed 
        System.out.printf("%n" + border);
        
        //Print each data array for year, hurricane, category, pressure, and speed 
        for(int i = 0; i <  arrayLength ; i++)
        {   
            if(year[i] >= userStartYear && year[i] <= userEndYear)
            {
              System.out.printf("%n%-9d%10s%13d%17d%20.2f", year[i], name[i], category[i], pressure[i], windMph[i]);
              n++; // Calculate total of iterations within range 
              sum += category[i]; //Calculate sum of pressure 
              categoryAvg = (sum / n); //Calculate average of category 
              sum1 += pressure[i]; //Caluclate sum of pressure
              pressureAvg = (sum1 / n); //Calculate average of pressure 
              sum2 += windMph[i]; //Calculate sum of wind speed
              mphAvg = (sum2 / n); //Calculate average of wind speed 
              
              //Find minimum and maximum values for categories, pressure, and wind speed within the range
            if(category[i] < minCategory) //Minimum category 
            minCategory = category[i]; 
            if(category[i] > maxCategory) // Maximum category
            maxCategory = category[i]; 
            
            if(pressure[i] < minPressure) //Minimum pressure
            minPressure = pressure[i]; 
            if(pressure[i] > maxPressure) //Maximum pressure
            maxPressure = pressure[i]; 
            
            if(windMph[i] < minWindSpeed) //Minimum wind speed 
            minWindSpeed = windMph[i];
            if(windMph[i] > maxWindSpeed) //Maximum wind speed
            maxWindSpeed = windMph[i];
     
            }
            
        }
        
        //Print the average, minimum and maximum value of the category, pressure, and speed (mph) 
        System.out.printf("%n" + border);  
        System.out.printf("%n \t   Average: %14.1f%17.1f%18.2f", categoryAvg, pressureAvg, mphAvg);
        System.out.printf("%n \t   Minimum: %12d%17d%20.2f", minCategory,minPressure,minWindSpeed);
        System.out.printf("%n \t   Maximum: %12d%17d%20.2f", maxCategory,maxPressure,maxWindSpeed);
        
        
        //output summary of categories (sum of each category from 1 - 5) on a text file 
        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));
        outFile.printf("%n Summary of Categories:");
        outFile.printf("%n Cat 1: " + category1);
        outFile.printf("%n Cat 2: " + category2);
        outFile.printf("%n Cat 3: " + category3);
        outFile.printf("%n Cat 4: " + category4);
        outFile.printf("%n Cat 5: " + category5);
        
        outFile.close(); //close outfile
        
        //read infile3
        File fileName3 = new File("Summary.txt");
        Scanner inFile3 = new Scanner(fileName3);
        String token = " ";
        
        //read infile3 and print the text file consisting the summary of categories (Summary.txt)
         while(inFile3.hasNext() )
         {  
         token = inFile3.nextLine( );      //read next token from file
         System.out.printf("%n" + token);   //print value of token
        }
       
        inFile3.close(); //close infile3 
        
  }
}

