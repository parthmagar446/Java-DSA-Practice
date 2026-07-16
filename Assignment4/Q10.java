package Assignment4;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        if(ispalindrome(num)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
    static boolean ispalindrome(int n){
        int temp= n;
        int rev=0;
        for(int i=n;i>0;i=i/10){
            int rem=i%10;
            rev=rev*10+rem;
        }
        if(rev==temp){
            return true;
        }else{
            return false;   
        }

    }
}
