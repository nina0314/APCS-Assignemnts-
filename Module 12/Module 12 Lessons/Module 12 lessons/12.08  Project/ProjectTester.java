
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Project
{
    Project()          // default constructor
    {
    }
    
    public int fOf(int x)
    {
        if (x <= 10)            // the base case
        {
            System.out.println(x + " <= , therefore ... f(" + x + ") = -2");
            return 2;
        }
        else
        {
            System.out.println(x + " > 9, therefore ... f(" + x + ") = f(" + x + " - 5) + 2 = f(" + (x - 6) + ") + 2");
            return fOf(x - 4) + 2;   // recursive call
        }
    }

}

public class ProjectTester
{
    public static void main(String[] args)
    {
        int x;
        Project rMethods = new Project();

        System.out.println("---------------------------------");
        System.out.println("       f(x - 4) + 2    if x >  10");
        System.out.println("f(x) = ");
        System.out.println("       2              if x <= 10");
        System.out.println("---------------------------------");
        System.out.println();


        // Call fOf with an x value of 20
        x = 20;
        System.out.println("Example 1:  x = " + x);
        System.out.println("f(" + x + ") = " + rMethods.fOf(x));
        System.out.println();
    }
}