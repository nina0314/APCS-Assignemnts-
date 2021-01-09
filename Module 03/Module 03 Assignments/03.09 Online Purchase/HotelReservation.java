
/**
 * This program allows the user to book a hotel room by using a user interface system. The inputted information is then printed out as a reciept. 
 *
 * @Nina Nielsen
 * @02/07/2018
 */
import java.util.Scanner;
public class HotelReservation
{
    public static void main(String[] args)
    {
        String border = "˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*˜*";
        //Initializing Variables 
        double adultPrice;   //Calculates the number of adults x cost per night per adult x number of nights
        double adultPrice1;  //Calculates the number of adults  x cost per night per adult
        double childPrice;   //Calculates the number of children x cost per night per child x number of nights
        double childPrice1;  //Calculates the number of children x cost per night per child
        double totalPrice;   //Calculates the adultPrice + childPrice 
        
        System.out.println("Welcome to Nina Hotel's Website");
        System.out.print("\n");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your first and last name:  ");  
        String firstName = in.next();      //UI input for first name
        String lastName = in.nextLine();   //UI input for last name
        
        System.out.print("\n");
        
        System.out.print("Please enter today's date (mm/dd/yyyy):  ");
        String date = in.next();   //UI input for date
        
        System.out.print("\n");
        
        System.out.print("Number of nights during stay:  ");
        String numberOfStay = in.next();   //UI input for number of stay 
        int stay = Integer.parseInt(numberOfStay); //Converting inputted string into integer 
        
        System.out.print("\n");
        

        System.out.print("Number of adults:  ");
        String numberOfAdults = in.next();  //UI input for number of adults 
        int adult = Integer.parseInt(numberOfAdults);  //Converting inputted string into integer
        
        System.out.print("Number of children : ");
        String numberOfChildren = in.next(); //UI input for number of children
        int children = Integer.parseInt(numberOfChildren); //Converting inputted string into integer
        
        System.out.print("\n");
        System.out.print("Price per night for adults (individual): $89.5"); //States the cost of adults per night 
        System.out.print("\n");
        System.out.println("Price per night for children (individual): $50.5"); //States the cost of children per night
        System.out.print("\n");
        
        System.out.print("Please enter your debit card information (#####-###-####): "); 
        String card = in.next(); //UI input for debit card information 
        System.out.print("\n");
        System.out.print("Please Enter your PIN (####): "); //UI input for PIN information 
        String pin = in.next();
        
        System.out.println();
        System.out.println(border);
        System.out.println(border);
        
        System.out.println(); 
        System.out.println("Your e-Reciept"); 
        System.out.println(date);
        System.out.print("\n");
        System.out.print("Order number: na003");
        
        System.out.println();
        
        String firstInitial = firstName.substring(0, 1); //Establishing first name initial
        String name = firstInitial + "." + lastName; //Adding initial to last name 
        
        System.out.print("\n\t Name: " + name); //Printing the intial and last name 
        
        String account = card.substring(10); //Taken out the last 4 digits from the debit card info
        String newaccount = "#####-###-" + account;  //Adding te last 4 digits to the concealed digits
        System.out.print("\n\t Account: " + newaccount); //Printing the concealed debit card info 
        System.out.print("\n\t Number of Nights Staying: " + stay); //Printing the number of nights staying
        System.out.print("\n\t Room Type: Double Room"); //Printing the room type
        adultPrice1 = (double)adult * 89.5;  //Calculating number of adults x cost per night per adult 
        System.out.print("\n\t Price Per Night ($89.5) x " + numberOfAdults + " Adults = $" + adultPrice1 ); //Printing number of adults x cost per night per adult
        childPrice1 = (double)children * 50.5; //Calculating number of children x cost per night per children 
        System.out.print("\n\t Price Per Night ($50.5) x " + numberOfChildren + " Children: = $" + childPrice1); //Printing number of children x cost per night per child
        
        adultPrice = (double)adult * 89.5 * stay; //Calculating number of adults x cost per night per adult x number of nights staying 
        childPrice = (double)children * 50.5 * stay; //Calculating number of children x cost per night per child x number of nights staying 
        totalPrice = adultPrice + childPrice; //Calculating total price 
        System.out.print("\n\t Total Price: $" +  totalPrice); //Printing total price 
        System.out.println();
        System.out.print("\n\t $" + totalPrice + " will be debited to your account. "); //Printing the amount of money to be debited from their account 
        System.out.print("\n");
        System.out.print("\n\t Thank you. Please enjoy your stay!"); //Final Message 
        
        System.out.print("\n");
        System.out.println();
        System.out.println(border);
        System.out.println(border);
        
        
        
    }
    
    
}
