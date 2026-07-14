package Assignment1;
import java.util.Scanner;

public class Q6{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Indian currency:");
        float Ruppee=in.nextFloat();
        float Dollar=0.01044f* Ruppee;
        System.out.println("dollar= "+Dollar);
    }
}