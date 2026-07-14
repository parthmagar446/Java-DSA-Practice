package Lecture2;
import java.util.Scanner;
public class faibonacci {
    public static void main (String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the term:");
        int term = in.nextInt();
        int a=0;
        int b=1;
        System.out.printf("0 1\t");
        for(int i=2;i<=term;i++)
        {
            int temp=b;
            b=a+b;
            a=temp;
            System.out.printf(" %d\t",b);
        }

    }   
}
