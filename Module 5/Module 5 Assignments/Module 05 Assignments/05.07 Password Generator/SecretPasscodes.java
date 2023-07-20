
/**
 * This program generates characters based on the users input to produce a randomised password.  
 *
 * Nina Nielsen
 * 07/08
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
public class SecretPasscodes
{
  public static void main (String [] args) throws IOException  
  {
  //Initialise
  Scanner in = new Scanner(System.in); 
  PrintWriter outFile = new PrintWriter(new File("Password.txt")); 
  int userSelection;  //Declare userSelection as int
  int userPassword;   //Declare userPassword as int 
  Random randNumList = new Random(); 
  
  //Print choice menu 
  String border = "***********************************************************";
  System.out.println("\t  Welcome to the Password Generator!");
  System.out.println(border);
  System.out.println("*\t [1] Lowercase Letters \t\t\t       ");
  System.out.println("*\t [2] Lowercase and Numbers \t\t       ");
  System.out.println("*\t [3] Lowercase, Uppercase, and Numbers\t       ");
  System.out.println("*\t [4] Lowercase, Uppercase, Numbers, and Symbols");
  System.out.println("*\t [5] Quit\t\t\t\t       ");
  System.out.println(border);
  
  //Gather input
  System.out.println("Enter Selection (1-5): ");
  userSelection = in.nextInt();
 
   while(userSelection < 1 || userSelection > 5) //While user does not input a valid number, ask them to try again 
   {
      System.out.println("\tYou typed in a invalid number! Please try again.");
      userSelection = in.nextInt();
 
   }
   
   if(userSelection == 5) //If user inputs number 5, exit the program
     {
         System.out.println("Thank you for using the Password Generator.");
     }
     else 
     { 
     System.out.println("Enter Password Length (6 or more): "); //Gather password length input 
      userPassword = in.nextInt(); 
    while(userPassword < 6) //While user inputs a number less than 6, ask them to try again 
      {
      System.out.println("\tYour number was less than 6! Please try again.");
      userPassword = in.nextInt();
    }
    
    for (int outer = 1; outer <= userPassword; outer++) //loop for choice selection and length number
    {
        outFile.print(outer + ":  "); //Prints the counter on the file 
        
       for (int inner = 1; inner <= userPassword; inner++) //loop for character sets 
    {
       int randNum = 0; //Initialise randNum to 0 
       
       if(userSelection == 1) //LowerCase
      {
          while(!(randNum >= 97 && randNum <= 122))
          {
              randNum = randNumList.nextInt(123);
          }
      }
      else if(userSelection == 2) //Lowercase and Numbers
      {
          while(!(randNum >= 97 && randNum <= 122 || randNum >= 48 && randNum <=57))
          {
              randNum = randNumList.nextInt(123);
          }
      }
      else if(userSelection == 3) //Lowercase, Uppercase, and Numbers
      {
          while(!(randNum >= 97 && randNum <= 122 || randNum >= 48 && randNum <= 57 || randNum >= 65 && randNum <= 90))
          {
              randNum = randNumList.nextInt(123); 
          }
      }
      else if (userSelection == 4) //Lowercase, Uppercase, Numbers, and Symbols
      {
          while(!(randNum >= 97 && randNum <= 122 || randNum >= 48 && randNum <=96 || randNum >=91 && randNum <=96 || randNum >= 123 && randNum <= 126))
          {
              randNum = randNumList.nextInt(127);
          }
       }
       outFile.print((char)randNum); //Print the randomised passwords  
    }  //end for loop 
     
    System.out.println("Enter Selection (1-5): "); //Ask user to select a choice again 
    userSelection = in.nextInt();
    
     while(userSelection < 1 || userSelection > 5) //While the user does not input a valid choice, ask them to try again 
     {
      System.out.println("\tYou typed in a invalid number! Please try again.");
      userSelection = in.nextInt();
 
     } 
     if(userSelection == 5) //Exit
     {
         System.out.println("Thank you for using the Password Generator."); 
         break;//Break the loop 
     }
     else //If user does not input 5, ask for password length and repeat generating random passwords
     {
         System.out.println("Enter Password Length (6 or more): ");
         userPassword = in.nextInt();
         
     while(userPassword < 6) //While the user does not input a valid choice, ask them to try again
      {
      System.out.println("\tYour number was less than 6! Please try again."); 
      userPassword = in.nextInt(); 
     }  
       outFile.print("\n");
     } 
    } //end for loop 
   }
   outFile.close( ); //Close file 
     
  //Initialise
  String token = " " ;
  File fileName = new File("Password.txt");
  Scanner inFile = new Scanner(fileName);
  System.out.println();
  System.out.println("Here are your randomly generated passwords:"); //Print results 
  while( inFile.hasNext() )
     {
         token = inFile.nextLine( );      //read next token from file
         System.out.println(token);   //print value of token
     }
  inFile.close( ); //Close file 
}
}
 




