
/**
 * This program demonstrates the use of the Integer class constants
 * MIN_VALUE and MAX_VALUE when finding the minimum and maximum
 * value within a numeric array.
 *
 * @author David J. Farber
 * @version 06/06/17
 */

public class FindMinMax
{
    public static void main(String[] args)
    {
        int [] numList = {3, 99, -1, 5, -10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numList.length; i ++)
        {
            if(numList[i] < min)
                min = numList[i];

            if(numList[i] > max)
                max = numList[i];
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);

        System.out.println("\nThe Constants");
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        
   String[] a =  {"ha","hi","hu"};

// code to initialize a



    int[] b = { 5, 4, 3, 2, 1 };
    int t = 3;

    b[ t ] = b[ t - 1 ];
    b[ t + 1 ] = b[ t ] - 1;
  
    int y = b[ 4 ];
    System.out.println(y);
    int x = b[ y - 1 ] + 1;    
    
    System.out.println(x);

    
      double[] c = { 1.1, 17.9, 32.1, 96.8, 101.5 };
    double[] d = c;

    c[ 2 ] = d[ 2 ] + 1.0;
 
    System.out.println( d[ 2 ] );
    }
}

