package Assignment1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args)
    {

    Scanner in=new Scanner(System.in);
    System.out.println("Enter num1:");
    int num1=in.nextInt();
    System.out.println("Enter num2:");
    int num2=in.nextInt();
    int a=num1;
    int b=num2;
    while (b!=0)
    {
       int temp=b;
       b=a%b;
       a=temp;
    }
    int HCF=a;
    
    int LCM=(num1*num2)/HCF;
    System.out.printf("HCF of %d & %d= %d\n",num1,num2,HCF);
    System.out.printf("LCM of %d & %d= %d\n",num1,num2,LCM);
}

}















/*HCF :
Divide the larger number by the smaller.
Replace the larger with the smaller, and the smaller with the remainder.
Repeat until remainder = 0. The divisor at that step = HCF.
Example: HCF(36,48):
48 ÷ 36 = 1 remainder 12
36 ÷ 12 = 3 remainder 0 → HCF = 12.

LCM:
HCF(a,b)*LCM(a,b)=a*b
*/
