
/**
 * Write a description of class aa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class aa
{
    public static void main(String[] args)
    {
       int blue = 0;
int red = 0;
int yellow = 0;
int green = 0;
int spinnerCount = 1;
int totalSpins = 0;
double randNum = 0.0;

while(spinnerCount <= 15)
{
randNum = Math.random();
System.out.print(spinnerCount + "\t" + randNum);

if(randNum < 0.25)
{
blue++;
System.out.println("\t blue");
}
else if(randNum >= 0.25 && randNum < 0.5)
{
red++;
System.out.println("\t red");
}
else if(randNum >= 0.5 && randNum < 0.75)
{
yellow++;
System.out.println("\t yellow");
}
else
{
green++;
System.out.println("\t green");
}
spinnerCount++;

}//end while 
 boolean p = false;
    int[] a = { 5, 4, 9, 2, 5, 3, 0, -1 };
    int g = 0;

    while ( !p && g < a.length ) 
    {
      p = ( p || (a[ g ] % 3 == 0) );
      g++;
    } 
    System.out.println("g = " + g);
    
    
}
}
