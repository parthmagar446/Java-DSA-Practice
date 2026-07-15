package Lecture3;
import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("a = ");
        int a=in.nextInt();
        System.out.print("b = ");
        int b=in.nextInt();
        System.out.printf("before swapping: a=%d , b=%d\n",a,b);
        swap(a,b);
        
    }

    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.printf("after swapping: a=%d , b=%d",a,b);
    }
}