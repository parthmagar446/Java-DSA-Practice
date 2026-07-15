package Assignment4;
import java.util.Scanner;
public class Q3 {
  public static void main(String [] args){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the age:");
    int age=in.nextInt();
    voterID(age);
  }  
  static void voterID(int n){
    if(n>=18){
        System.out.println("Elegible for voting");
    }else{
        System.out.println(" not Elegible for voting");
    }
  }
}
//git commit -m "Added Q2(Even & Odd function) problem in Assignment 4"