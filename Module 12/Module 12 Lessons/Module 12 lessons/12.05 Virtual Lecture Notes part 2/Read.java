
/**
 * Write a description of class Read here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Read
{
public static int recur(int n)
{
     if(n < 4)
     {
          return 2;
     }
     else
     {
          return recur(n / 4) + 2;
     }
}
  
  public static void main (String [] args)
  {
      
      System.out.println(recur(16));
   }
    
}
