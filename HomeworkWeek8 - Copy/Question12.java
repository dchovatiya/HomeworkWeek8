package HomeworkWeek8;

import java.util.Scanner;

/*12. Write a programme to input any number and check if it is prime or not.
        (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
        17.... are the prime numbers.*/
public class Question12
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input any number: ");
        int num = s.nextInt();

        for(int i=2;i<=Math.sqrt(num);i++)
        {

            if(num%i!=0 )
            {
                if(num%3==0 || num%5==0)
                {
                    System.out.println("It is not a prime number.");
                }
                else
                {
                    System.out.println("It is a prime number.");
                }
            }else
            {
                System.out.println("It is not a prime number");
            }
            break;

        }
        s.close();

    }
}










