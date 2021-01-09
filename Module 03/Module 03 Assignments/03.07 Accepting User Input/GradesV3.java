/**
 * The purpose of this program is to understand the way of using the scanner class method correctly and to let the user interact with the program by entering input on the keyboard.
 *
 *
 * 
 * @author Nina Nielsen 
 * @version 02/07/18
 */
import java.util.Scanner;
public class GradesV3
{
    public static void main(String[ ] args)
    {
        //local variables       
        int numTests = 0;           //counts number of tests
        int totalPoints = 0;        //total points for all tests
        double average = 0.0;       //average grade
        int d;
        
        String border = "************************Result*************************";
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your full name: ");
        String text = in.next();
        String fullName = text += in.nextLine();
        System.out.println("Name: " + fullName);
        System.out.println();
        
        System.out.println("Enter school name: ");
        String school = in.next();
        String schoolName = school += in.nextLine();
        System.out.println("School name: " +schoolName);
        System.out.println();
        
        System.out.println("Enter Subject: ");
        String subject = in.next();
        String subjectName = subject += in.nextLine();
        System.out.println("Subject: " + subjectName);
        System.out.println();
        
        System.out.println("Enter your first test score: ");
        int intValue1 = in.nextInt();
        System.out.println("1st test score: " + intValue1);
        numTests++;
        totalPoints += intValue1;
        //average =(double)totalPoints/numTests;
        System.out.println();
        
        System.out.println("Enter your second test score: ");
        int intValue2 = in.nextInt();
        System.out.println("2nd test score: " + intValue2);
        numTests++;
        totalPoints += intValue2;
        //average =(double)totalPoints/numTests;
        System.out.println();
        
        
        System.out.println("Enter your third test score (): ");
        int intValue3 =in.nextInt();
        System.out.println("3rd test score: " + intValue3);
        numTests++;
        totalPoints += intValue3;
        average =(double)totalPoints/numTests;
        System.out.println();
        
        System.out.println(border);
        System.out.println("Name: " + fullName);
        System.out.println();
        System.out.println("School: " + schoolName);
        System.out.println();
        System.out.println("Subject: " + subjectName);
        System.out.println();
        System.out.println("Total Points: " + totalPoints);
        System.out.println();
        System.out.println("Average Grade: " + average);
        System.out.println();
        
        
        
        
        
        
    
          
        
        
        
        
        
        
        
        
        
        
    }//end of main method
}//end of class
