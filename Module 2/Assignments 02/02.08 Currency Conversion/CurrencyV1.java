/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Nina Nielsen
 * @version 21/06/18       
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double wonSpent = 1662683.15;          // Korean Won Spent
        double wonExchangeRate = 1039.18;      // 1 US dollar = 1039.18 Won
        double dollarsSpentInKorea = 0.0;      // US dollars spent in Korea
        double dollarsAfterKorea = 0.0;        // US dollars remaining after Korea
        
        double euroSpent = 567.27;             // European Euro Spent
        double euroExchangeRate = 0.82;        // 1 US dollar = 0.82 Euro
        double dollarsSpentInItaly = 0.0;      // US dollars spent in Italy
        double dollarsAfterItaly = 0.0;        // US dollars remaining after Italy
        
        double bahtSpent = 30375.85;           // Thai Baht Spent
        double bahtExchangeRate = 30.81;       // 1 US dollar = 30.81 Baht
        double dollarsSpentInThailand = 0.0;   // US dollars spent in Thailand
        double dollarsAfterThailand = 0.0;    // US dollars remaining after Thailand
        
        String border = "——————————————————————————————————————————————————————————";
        
        //remaining variables below here

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("Budget: " + "$" + startingUsDollars );
        System.out.println();
        
        dollarsSpentInKorea = wonSpent / wonExchangeRate;
        dollarsAfterKorea = startingUsDollars -= dollarsSpentInKorea;
        System.out.println("Korea:");
        System.out.print(" Won Spent:                       ");
        System.out.println("₩" + wonSpent);
        System.out.print(" US $1 =                          ");
        System.out.println("₩" + wonExchangeRate );
        System.out.print(" Dollars Spent in Korea:          ");
        System.out.println("$" + dollarsSpentInKorea);
        System.out.print(" Remaining Dollars:               ");
        System.out.println("$" + dollarsAfterKorea );
        
        System.out.println();
        
        dollarsSpentInItaly = euroSpent / euroExchangeRate;
        dollarsAfterItaly = dollarsAfterKorea -= dollarsSpentInItaly;
        System.out.println("Italy:");
        System.out.print(" Euro Spent:                      ");
        System.out.println("€" + euroSpent); 
        System.out.print(" US $1 =                          ");
        System.out.println("€" + euroExchangeRate );
        System.out.print( " Dollars Spent in Italy:         ");
        System.out.println( " $" + dollarsSpentInItaly);
        System.out.print(" Remaining Dollars:               ");
        System.out.println("$" + dollarsAfterItaly);
        
        System.out.println();
        
        dollarsSpentInThailand = bahtSpent / bahtExchangeRate;
        dollarsAfterThailand = dollarsAfterItaly -= dollarsSpentInThailand;
        System.out.println("Thailand:");
        System.out.print(" Baht Spent:                      ");
        System.out.println("฿" + bahtSpent);
        System.out.print(" US $1 =                          ");
        System.out.println("฿" + bahtExchangeRate);
        System.out.print(" Dollars Spent in Thailand:       ");
        System.out.println("$" + dollarsSpentInThailand);
        System.out.print(" Remaining Dollars:               ");
        System.out.println("$" + dollarsAfterThailand);
        
        System.out.println(border);
        System.out.print("Remaining Dollars:                ");
        System.out.println("$" + dollarsAfterThailand);
         
        System.out.println();
        
        
        // Complete the code below for Souvenir Purchases
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;             //cost per item of first souvenir
        int budget1 = 100;          //budget for first item
        int totalItems1 = 0;        //how many items can be purchased
        int fundsRemaining1 = 0;        //how much of the budget is left
        
        costItem1 = 12;
        budget1 = 100;
        totalItems1 = budget1/costItem1;
        fundsRemaining1 =  budget1 % costItem1; 
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        
                System.out.println();
                
                
                
                
        //Calculations for Souvenir #2
        double costItem2 = 29.99;            //cost per item of second souvenir
        int budget2 = 500;              //budget for second item
        int totalItems2 = 0;                    //how many items can be purchased
        double fundsRemaining2 = 0.0;          //how much of the budget is left
        
        costItem2 = 29.99;
        budget2 = 500;
        totalItems2 =(int)(budget2/costItem2);
        fundsRemaining2 =budget2 % costItem2;
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);
        
        

    } // end of main method
} // end of class
