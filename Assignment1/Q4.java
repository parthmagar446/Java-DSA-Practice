package Assignment1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number(type 999 to stop):");
        int sum=0;
        while(true)
        {
            int input=in.nextInt();
            if(input==999)
            {
                break;
            }
            sum=sum+input;
        }
        System.out.println("sum= "+ sum);
    }
    
}
