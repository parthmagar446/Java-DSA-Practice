package Assignment2;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        int sum=0;
        for(int i=num;i>0;i=i/10){
            int rem=i%10;
            int cube=rem*rem*rem;
            sum=sum+cube;
        }
        if(num==sum){
            System.out.println("It is the armstrong number");
        }
        else{
            System.out.println("It is not the armstrong number");
        }
    }
}
