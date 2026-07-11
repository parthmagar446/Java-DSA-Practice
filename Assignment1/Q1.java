
package Assignment1;
import java.util.Scanner;

public class Q1{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = in.nextInt();
        if(a%2==0)
        {
            System.out.println(a+"is Even ");
        }
        else{
            System.out.println(a+" is Odd");
        }
    }
}
