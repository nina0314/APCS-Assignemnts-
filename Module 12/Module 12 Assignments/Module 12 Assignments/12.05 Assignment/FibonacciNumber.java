
/**
 *This program uses user input to calculate the fibonacci number. 
 *
 * @Nina Nielsen 
 * @12/27/2018
 */
import java.util.Scanner;
public class FibonacciNumber
{
    
    FibonacciNumber()
    {
    }

    public int fibonacciNum(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacciNum(n-1) + fibonacciNum(n -2); 
        }
    }
    
   
    public static void main(String [] args) 
    {
        FibonacciNumber result = new FibonacciNumber();
        System.out.println("Enter a number from 0 to 45");
        System.out.println("Enter \"q\" to quit");
        Scanner in = new Scanner(System.in);
        String number = in.next();
         while(!number.equalsIgnoreCase("q"))
        {
            int number1 = Integer.parseInt(number);
            int value = result.fibonacciNum(number1);
            System.out.println("Value is: " + value);
            number = in.next();
        }
        System.out.println("Thank you!");
        }
}

