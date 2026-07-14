package Assignment2;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        int Reverse=0;
        for(int i=num;i>0;i=i/10)
        {
            int rem=i%10;
            Reverse= Reverse*10+rem;
        }
        if(num==Reverse)
        {
            System.out.println("the number is palindrome");
        }
        else
        {
            System.out.println("the number is not palindrome");
        }
    }
    
}
