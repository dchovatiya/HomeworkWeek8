package HomeworkWeek8;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class Question9
{
    public static void main(String[] args)
    {
        int a=0,b=1,c=0;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        for(int i=2;i<10;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
