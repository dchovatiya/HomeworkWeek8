package HomeworkWeek8;
/*6. Write a program in Java to display the pattern like a triangle with a number.
        For eg.
        Input number of rows: 10
        Expected Output:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910*/
import java.util.Scanner;

public class QuestionSix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++) //for rows
        {
            for(int j=1;j<=i;j++) //for columns
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
