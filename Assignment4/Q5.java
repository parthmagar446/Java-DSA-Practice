package Assignment4;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number a:");
        int a=in.nextInt();
        System.out.println("Enter number b:");
        int b=in.nextInt();
        product(a,b);
    }
    static void product(int a,int b){
        int product=a*b;
        System.out.println("product= "+product);
    }
}
