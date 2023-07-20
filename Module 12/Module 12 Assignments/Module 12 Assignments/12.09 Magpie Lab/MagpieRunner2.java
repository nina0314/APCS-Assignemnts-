
/**
 * A simple class to run the Magpie class.

 * Code adapted from work by Laurie White for the College Board.
 *
 * Nina Nielsen
 * 29/12/2018
 */

import java.util.Scanner;

public class MagpieRunner2
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie2 maggie = new Magpie2();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equalsIgnoreCase("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
        System.out.println("See you soon");
    }

}
