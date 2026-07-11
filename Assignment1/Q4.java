package Assignment1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args)
    {
    
    Scanner in=new Scanner(System.in);
    System.out.println("Enter num1:");
    float num1=in.nextFloat();
    System.out.println("Enter num2:");
    float num2=in.nextFloat();
    System.out.println("Enter the operation ('+','-','*','/'):");
    char op= in.next().charAt(0);
    if(op=='+')
    {
        float result=num1+num2;
        System.out.println("Sum= "+result);
    }
    else if(op=='-')
    {
        float result=num1-num2;
        System.out.println("Difference = "+result);
    }
    else if(op=='*')
    {
        float result=num1*num2;
        System.out.println("Multiplication = "+result);    
    }
    else if(op=='/')
    {
        float result=num1/num2;
        System.out.println("divison = "+result);    
    }
    else 
    {
        System.out.println("Invalid operators");    
    }
}
}