
/**
 * Write a description of class Recursive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursive
{
    Recursive()
   {
       
   }
   
    public int numberOfDigits(int n)
{
    if (n <= 9)
    {
        return 1;
    }
    else
    {
        return 1 + numberOfDigits(n/10);
    }
} 

public static void main (String [] args)
{ 
 Recursive method = new Recursive();
 int n = 10406; 
 
 System.out.println("This method has " + method.numberOfDigits(n) + " digits");

}
}
