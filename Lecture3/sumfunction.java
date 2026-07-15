package Lecture3;
import java.util.Scanner;
public class sumfunction {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=in.nextInt();
        System.out.println("Enter num2:");
        int num2=in.nextInt();
        System.out.println("sum= "+sum(num1,num2));
        
    }   
    static int sum (int a,int b)
    {
        int sum=a+b;
        return sum;
    } 
}
