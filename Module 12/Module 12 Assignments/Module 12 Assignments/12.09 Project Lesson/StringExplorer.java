/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @Nina Nielsen
 * @29/12/2018
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        System.out.println();
        sample = "    I love to eat pizza and pasta and pizza     ";

        //  Add examples below for the following methods:
        //    trim()
        String trim = sample.trim();
        System.out.println(trim);
        System.out.println("After trim(), sample = " + sample);
        System.out.println();
        
        //    length()
        int length = sample.length();
        System.out.println("sample.length() = " + length);
        System.out.println();
        
        //    indexOf with one and two parameters
        
        int indexOf = sample.indexOf("pizza"); 
        System.out.println("sample.indexOf(\"pizza\") = " + indexOf);
        System.out.println();
        
        int indexOf1 = sample.indexOf("pizza",15);
        System.out.println("sample.indexOf(\"pizza\" , 15) = " + indexOf1);
        System.out.println();
        
        //    substring() with one and two parameters
        String substring = sample.substring(8);
        System.out.println("sample.substring(8) = " + substring);
        System.out.println();
        
        String substring1 = sample.substring(8,15);
        System.out.println("sample.substring(8,15) = " + substring1);
        System.out.println();
        
        //    compareTo()
        int compareTo = sample.compareTo("I love to eat sushi and cream haha");
        System.out.println("The difference between both senences is " + compareTo);
        System.out.println();
        
        // Replace()
        String target = "pizza";
        String replacement = "Salad";
        String replace = sample.replace(target,replacement);
        System.out.println(replace);
       
        //    any other String methods you'd like to try

    }

}