package Lecture2;
import java.util.Scanner;
public class countnum {
    public static void main(String[] args)
    {
        
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        System.out.println("Enter the num to count:");
        int n=in.nextInt();
        int count=0;
        for(int i=num;i>0;i=i/10)
        {
            int rem=i%10;
            if(rem==n)
            {
                count++;
            }
        }
        System.out.printf("the number %d is repeated %d times",num,count);
    }
 }
