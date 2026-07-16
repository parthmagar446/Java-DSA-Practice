package Assignment4;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        int input=in.nextInt();
        sumnatural(input);
    }
    static void sumnatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum =" +sum);
    }
}
