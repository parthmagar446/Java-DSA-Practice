package Assignment4;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        int r=in.nextInt();
        cc(r);
        ac(r);
    }
    static void cc(int n){
        float circumference=2*3.14f*n;
        System.out.println("Circumference= "+ circumference);
    }
    static void ac(int n){
        float Area=3.14f*n*n;
        System.out.println("Area= "+ Area);
    }
}
