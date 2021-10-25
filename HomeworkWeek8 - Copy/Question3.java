package HomeworkWeek8;

import java.util.Locale;
import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message*/
public class Question3
{
    public static void main(String[] args)
    {
        String inputAlphabet=" ";
        System.out.println("I can tell you if a letter in the alphabet is a vowel or a consonant.");
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a letter from english alphabet:");
        inputAlphabet=s.next();
        //check the length
        if(inputAlphabet.length()==1)
        {
            //convert input letter to lowercase
            inputAlphabet=inputAlphabet.toLowerCase();
            // is input letter between a and z and not a number or other char
            if(inputAlphabet.compareTo("a")>=0)
            {
                if(inputAlphabet.equals("a")|| inputAlphabet.equals("e")|| inputAlphabet.equals("i")|| inputAlphabet.equals("o")|| inputAlphabet.equals("u"))
                {
                    System.out.println(inputAlphabet + " is a VOWEL.");
                }else
                {
                    System.out.println(inputAlphabet + " is a CONSONANT.");
                }
            }else
            {
                //if between a to z end.
                System.out.println(inputAlphabet +" is not valid.You might have entered something other then a to z.");
            }
        }else
        {
            // if length ends.
            System.out.println(inputAlphabet + " is not valid. More then one letter has been entered.");
        }
    }
}


