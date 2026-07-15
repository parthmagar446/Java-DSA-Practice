package Assignment4;
import java.util.Scanner;
public class Q2 {
   public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=in.nextInt();
    OEfinder(num);
   }
   static void OEfinder(int num){
    if(num%2==0){
        System.out.println(num+ "is EVEN");
    }else{
        System.out.println(num+ "is ODD");
    }
   }
   
}
