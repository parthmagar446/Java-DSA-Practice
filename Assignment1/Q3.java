package Assignment1;
import java.util.Scanner;
public class Q3{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principle:");
        float P=input.nextFloat();
        System.out.println("Enter the rate:");
        float R=input.nextFloat();
        System.out.println("Enter the time:");
        float T=input.nextFloat();
        float SI=(P*R*T)/100;
        System.out.println("Simple Intrest= "+SI);
    }
}