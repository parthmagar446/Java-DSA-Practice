package Assignment1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        for(int i=0;i<=10;i++)
        {
            int pro=num*i;
            System.out.printf("%d * %d = %d\n2",num,i,pro);
        }
        in.close();
    }    
}
