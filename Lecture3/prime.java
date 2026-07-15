package Lecture3;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=in.nextInt();
        prime(num);
    }
    static void prime(int n){
        int count=0;
        for(int i=2;i<n;i++)
            {
                if(n%i==0){
                    System.out.println(n+ "is not a prime number");
                    break;
                }
                count++;
            }   
            if(count!=0){
                   System.out.println(n+ "is  a prime number");
            }

    }
}
