package OOPS;
//16)	Develop a Java Calculator program by creating a class with separate methods to perform basic 
//arithmetic operations such as addition, subtraction, multiplication, and division. 
//The program should accept two numbers from the user, perform the selected arithmetic operation,
// and display the result.
import java.util.Scanner;
public class Calcultor {

    public void addition(int a,int b){
        System.out.println(a+b);
    }

    public void subtract(int a,int b){
        System.out.println(a-b);
    }

    public void multiplication(int a,int b){
        System.out.println(a*b);
    }
    public void division(int a,int b){
        if(b==0){
            System.out.println("can not calculate");
        }else{
            System.out.println(a/b);

        }
        
    }

    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
        Calcultor cal=new Calcultor();
        System.out.println("Enter num1:");
        int num1=in.nextInt();
        System.out.println("Enter num2:");
        int num2=in.nextInt();
 
        System.out.println("Enter the operati0n(+,-,*,/):");
        char op=in.next().charAt(0);
        switch (op){
            case '+': cal.addition(num1, num2);
            break;
            case '-':cal.subtract(num1, num2);
            break;
            case '*': cal.multiplication(num1, num2);
            break;
            case '/':cal.division(num1, num2);
            break;
            default:System.out.println("invalid operation");
        }

        
    }

}
