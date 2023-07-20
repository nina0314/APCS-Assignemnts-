
/**
 * The purpose of this program is to illustrate the use of
 * the for loop as a counter.
 *
 * Nina Nielsen
 * 02/08/2018
 */
import java.util.ArrayList;
import java.util.List;
 public class Shape
  {
     public static void main(String [] args)
     {
    ArrayList < Integer > a = new ArrayList < Integer >();
    ArrayList b = a;
    a.add(4);
    b.add(5);
    a.add(6);
    b.add(7);
    //System.out.println(b.get(2));
    
    Shape d = new Shape();
    
    //System.out.println(d.mystery(9));
    
    
    int arr[][] = {{1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12}};
               
    //System.out.println(arr[2][3]);
    
    / precondition: a and b are NOT null
public int doSomethingElse(int[] a, int[] b)
{
   int i, count = 0;

   if(a.length != b.length)
   {
      return -1;
   }

   for(i = 0; i < a.length; i++)
   {
      if((a[i] != 0) || ((b[i] / a[i]) > 10))
      {
         count++;
      }
   }

   return count;
}
ArithmeticException
ArrayIndexOutOfBoundsException
ClassCastException
IndexOutOfBoundsException
NullPointerException

Question 11(Multiple Choice Worth 2 points)

Which of the following sorting algorithms is described by this text? "Take the item at index 1 and see if it is in order compared to the item at index 0. If it is not, then swap the two items. Next take the item at index 2 and compare it to the items at the lower indexes. Move items in the lower indexes to a higher one until you find the proper location to place the value so that it is in the correct order. Continue this process with all remaining indexes."
Insertion sort
Heap sort
Merge sort
Quick sort
Selection sort

Question 12(Multiple Choice Worth 1 points)

An array always contains
objects
primitive types
either objects or primitive types
a mix of objects and primitive types
different kinds of objects

Question 13(Multiple Choice Worth 1 points)

Which of these expressions evaluates to 4.5?

    9 / (double)2
    9 / 2.0
    (double)(9 / 2)

I only
II only
I and II only
II and III only
I, II, and III

Question 14(Multiple Choice Worth 2 points)

Consider the following code:

String[] fruits = {"doggie", "badger", "cat", "gopher"};
int i = 3;
String str = "d";

for(String item : fruits)
{
   i = item.indexOf("d") + 2;
   str += item.substring(i);
}

System.out.println(str);

Assume that the loop accesses array elements in order. What is output by this code?
dgiegercatopher
dggieeratopher
dogbadcat
oggieerher
A StringIndexOutOfBoundsException occurs.

Question 15(Multiple Choice Worth 2 points)

The following method is intended to remove all values from the ArrayList < Integer > aList that have the same value as val; however, this method does NOT work correctly.

public void removeValue(ArrayList < Integer > aList, int val)
{
   int i;

   for(i = 0; i < aList.size(); i++)
   {
      if(aList.get(i) == val)
      {
         aList.remove(i);
      }
   }
}

If aList initially contains 2 3 4 3 3 4 4 5 4 3 2 1 and val is equal to 4, then aList should contain 2 3 3 3 5 3 2 1 after removeValue is invoked. What does aList actually contain after removeValue is invoked?
2 3 3 3 5 3 2 1
2 4 3 4 5 4 2 1
2 3 3 3 4 5 3 2 1
2 4 3 4 4 5 3 2 1
2 3 3 4 4 5 4 3 2 1

Question 16(Multiple Choice Worth 2 points)

What is the maximum number of locations a binary search algorithm will have to examine when looking for a particular value in a sorted array of 500 elements?
1
2
7
9
500

Question 17(Multiple Choice Worth 2 points)

Suppose the following array and integer are declared:

int[] numbers = {4, 5, 6, 7};
int index = 1 + 6 % 4 * 2;

What is the value of numbers[index]?
An ArrayIndexOutOfBoundsException occurs.
4
5
6
7

Question 18(Multiple Choice Worth 2 points)

Consider the expression: !((x > y) && (y <= 0)). It is equivalent to which of the following expressions?

    !(x > y) || !(y <= 0)
    !(x > y) && !(y <= 0)
    (x <= y) || (y > 0)

I only
II only
III only
I and III only
II and III only

Question 19(Multiple Choice Worth 1 points)

What is the maximum number of locations a sequential search algorithm will have to examine when looking for a particular value in an array of 100 elements?
1
12
25
50
100

Question 20(Multiple Choice Worth 2 points)

Consider the following code:

public class MyClass
{
   private int secret;

   public int getSecret()
   {
      return secret;
   }
}

Is the instance variable secret really private, meaning that it cannot be changed by client code?
Yes, because it is private
Yes, because it is private and non-static
No, because getSecret returns a reference to secret, which allows direct access to the instance variable
No, because getSecret returns the value of secret, which can be changed by the client
No, because MyClass is a public class, and so its instance variables are all accessible by outside classes

Question 21(Multiple Choice Worth 2 points)

Which of the following statements could be used to generate a random number between 1 and 9, inclusive, and assign it to the variable dice?

    int dice = (int)Math.random() * 9;
    int dice = Math.random() * 9 + 1;
    int dice = (int)(Math.random() * 9) + 1;

I only
II only
III only
I, II, and III
I and II only

Question 22(Multiple Choice Worth 2 points)

What is stored in the array arr after the following code executes?

int[ ] arr = {17, 34, 43, 71};
int i = 0;
while(i < arr.length)
{
   if((arr[i] % 2) == 1)
   {
      arr[i] = arr[i] % 3;
   }
   else
   {
      arr[i] = arr[i] / 3;
   }
   i++;
}
{1, 11, 2, 10}
{2, 10, 11, 1}
{2, 11, 1, 2}
{2, 11, 1, 10}
An ArrayIndexOutOfBoundsException occurs.

Question 23(Multiple Choice Worth 2 points)

Consider the following class descriptions and code. Account is an abstract class with one abstract method named getInterestRate. BasicCheckingAccount is a concrete class that extends Account. EnhancedCheckingAccount extends BasicCheckingAccount and overrides getInterestRate.

Account acct;
double rate1, rate2;
acct = new BasicCheckingAccount(< parameters not shown >);
rate1 = acct.getInterestRate(); // assignment 1
acct = new EnhancedCheckingAccount(< parameters not shown >);
rate2 = acct.getInterestRate(); // assignment 2

The reference to getInterestRate in assignment 2 is to the class
Account
BasicCheckingAccount
EnhancedCheckingAccount
SavingsAccount
The code cannot run, because the variable acct cannot be assigned to an EnhancedCheckingAccount object in the line before assignment 2.

Question 24(Multiple Choice Worth 2 points)

To extend an abstract class, a class must
extend an interface class
implement at least one abstract method from the abstract class
include new methods
specify the keyword implements
specify the keyword extends

Question 25(Multiple Choice Worth 1 points)

Which statements are true for both an abstract class and an interface?

    Interfaces imply an inheritance relationship
    Abstract classes imply an inheritance relationship
    A class may implement many interfaces, but extend only one class

I only
II only
III only
I and II only
II and III only

Question 26(Multiple Choice Worth 2 points)

Which expression correctly determines that String s1 comes before String s2 in lexicographical order?
s1 < s2
s1 <= s2
s1.compareTo(s2) == −1
s2.compareTo(s1) < 0
s1.compareTo(s2) < 0

Question 27(Multiple Choice Worth 2 points)

What does overloading mean?
Defining a subclass method with an identical name, return type, and parameter list that is invoked instead of the parent class method
Defining a subclass method with an identical name and parameter list subclass that is invoked instead of the parent class method
Defining two or more methods in a class with the same name, return type, and parameter list, to perform functions that are slightly different from one another
Defining two or more methods in a class with the same name but different return types and parameter lists, to perform functions that are slightly different from one another
Defining two or more methods in a class with the same name but different parameter lists, to perform functions that are slightly different from one another

You must check the box below prior to submitting your exam!
Check this box to indicate you are ready to submit your exam

[Explorer] 	[Toolbox] 	[Workload] 	[My Folders]

Instructors monitor ALL areas of a student's account

Student e-mail accounts are to be used for FLVS course-related email only and not for general introductions or spamming of people in your address book.

Please remember to click the Logoff link when you have completed your work in the course.
FDK401.02

   
    }
    public int mystery(int n)
   {
   if(n > 5)
   {
      return 1 + mystery(n - 1);
   }
   return n % 3;
 }
}
    
  

    //end of main method
//end of class