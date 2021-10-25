package HomeworkWeek8;

public class Question13
{
    public static boolean hasSharedDigit(int n1, int n2)
    {
        if(n1>=10 && n1<=99 && n2>=10 && n2 <=99 ||   n1/10==n2/10  )
        {
            return true;
        }
        return false;

    }


    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));

    }
}
