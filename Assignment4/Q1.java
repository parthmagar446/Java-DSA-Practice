package Assignment4;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=in.nextInt();
        System.out.println("Enter b:");
        int b=in.nextInt();
        System.out.println("Enter c:");
        int c=in.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
    static void max(int a,int b,int c){
        int max;
        if (a>b && a>c) {
            max=a;
        }else if(b>c && b>a){
            max=b;
        }else{
            max=c;
        }
        System.out.println("max="+ max);
    }

    static void min(int a, int b, int c){
        int min;
        if (a<b && a<c) {
            min=a;
        }else if(b<c && b<a){
            min=b;
        }else{
            min=c;
        }
         System.out.println("max="+ min);
    }

}
