//13)	Develop a Java program using a class named SimpleInterest to calculate the simple interest.
//  The program should accept the principal amount, rate of interest, and time in years as input from the user 
// and display the calculated simple interest.

 package OOPS;
import java.util.Scanner;
public class Q13 {
public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the principal amount:");
    float principal=in.nextFloat();
    System.out.println("Enter the Rate of intrest:");
    float rate=in.nextFloat();
    System.out.println("Enter the time(in yr):");
    float time=in.nextFloat();

    double SI=(principal*rate*time)/100;
    System.out.println("Simple Intrest= "+SI);
}
}