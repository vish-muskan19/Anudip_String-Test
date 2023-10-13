/* Write a Program to take a user-defined input in which
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters
Sample Input:
User gives input as "Hello"
Output should be: "Fbiil" */

import java.util.Scanner;

public class String_Test
{
    public static void main(String[] args)
    {
        //Scanner object to read user input
        Scanner sc=new Scanner(System.in);
        //user to enter a string
        System.out.println("Enter a string: ");
        //Read the input string from the user
        String input = sc.nextLine();

        //shiftCharacters method to process the input string
        String output = shiftCharacters(input);
        System.out.println("Output: "+output);
    }
    private static  String shiftCharacters(String input)
    {
        //StringBuilder named output to store the shifted characters
        StringBuilder output = new StringBuilder();

        for (char c: input.toCharArray())
        {
            //Check if the character is uppercase.
            if (Character.isUpperCase(c))
            {
                //subtract 2 from its ASCII value and append the corresponding character
                output.append((char)(c-2));
            }
            //If the character is lowercase
            else if (Character.isLowerCase(c))
            {
                // subtract 3 from its ASCII value and append the corresponding character
                output.append((char)(c-3));
            }
            else {
                output.append(c);
            }
        }
        //Return the resulting string after shifting all characters
        return output.toString();
    }
}
