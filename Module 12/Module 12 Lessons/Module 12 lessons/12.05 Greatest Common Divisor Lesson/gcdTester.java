
/**
 * Write a description of class GreatestCommonDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class GreatestCommonDivisor
{
GreatestCommonDivisor ()
{
}
    //precondition x, y non-negative
  public int gcd(int x, int y)
  {
      if(x < y)
      return gcd(y, x);
      else if(y == 0)
      return x;

      else
      return gcd(y, x % y);
    }
}

public class gcdTester
{
    public static void main(String[] args)
    {
        int x;
        int y;
        GreatestCommonDivisor method = new GreatestCommonDivisor();
        
        x = 126;
        y = 90;
        System.out.println("Example 1: x = " + x + " y = " + y);
        System.out.println(x + " / " + y + " = " + method.gcd(x,y));
        System.out.println();
    }
}
