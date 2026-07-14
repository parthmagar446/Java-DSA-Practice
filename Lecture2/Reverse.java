package Lecture2;
import java.util.Scanner;
public class Reverse {
    public static void main (String [] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number:");
        int num=in.nextInt();
        System.out.print("Reverse= ");
        int i;
        for(i=num;i>0;i=i/10)
        {
            int rem= i %10;
            System.out.print(rem);
        }
    }
}
