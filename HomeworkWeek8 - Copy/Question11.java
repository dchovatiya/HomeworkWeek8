package HomeworkWeek8;

public class Question11
{
    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number > 0) {
            while (number != 0) {
                int even = number % 10;
                if (even % 2 == 0) {
                    sum = sum + even;
                }
                number = number / 10;
            }
            System.out.println(sum);
        } else {
            return -1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);

    }
}
