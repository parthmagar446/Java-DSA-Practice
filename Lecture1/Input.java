package Lecture1;
import java.util.Scanner;
public class Input{
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine();
        System.out.println("Name="+name);
        System.out.println("enter the roll no:");
        int rollno=input.nextInt();
        System.out.println("roll no="+rollno);
    }
    
}
