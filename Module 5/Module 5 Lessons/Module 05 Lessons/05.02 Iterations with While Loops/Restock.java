
/**
 * This program simulates the fish population within a pond and predicts
 * when to restock based on the growth delay formula. The while loop
 * terminates when the population goes below a desired value.
 *
 * @author Nina Nielsen
 * @version 27/07/18
 */
public class Restock
{
    public static void main(String[] args)
    {
        int year = 2010;             //initial year
        int fishPop = 12500;         //max fish population
        double decreaseRate = .224;  //annual rate of decrease

        while(fishPop >= 1500)
        {
            fishPop -= (int)(fishPop * decreaseRate);
            year++;
        }
        System.out.println("In " + year
                            + " the fish population will decrease to "
                            + fishPop );
        System.out.println("Needs to be restocked in " + year );
        
   
      String s = "";
    String t = "abracadabra";
    while ( s.length() < t.length() )
    {
      s += t.substring( 0,1 );
      t = t.substring( 1 );
      System.out.println("s " + s);
      System.out.println("t " + t);
    } 
    
       }//end of main method
}//end of class
