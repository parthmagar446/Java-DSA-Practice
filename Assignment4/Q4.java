package Assignment4;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number a:");
        int a=in.nextInt();
        System.out.println("Enter number b:");
        int b=in.nextInt();
        add(a,b);
    }
    static void add(int a,int b){
        int sum=a+b;
        System.out.println("sum= "+sum);
    }
}
