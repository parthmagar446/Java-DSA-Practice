package Lecture2;
import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter charcter:");
        char input=in.next().trim().charAt(0);
        if(input>='a' && input<='z')
        {
            System.out.println("lower case");
        }
        else
        {
            System.out.println("Upper case");
        }
    }
    
}
