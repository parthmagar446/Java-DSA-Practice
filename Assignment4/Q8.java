package Assignment4;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int marks=in.nextInt();
        grade(marks);
    }
    static void grade(int n){
        if(n>=91 && n<=100){
            System.out.println("grade = AA");
        }else if(n>=81 && n<=90){
            System.out.println("grade = AB");
        }else if(n>=71 && n<=80){
            System.out.println("grade = BB");
        }else if(n>=61 && n<=70){
            System.out.println("grade = BC");
        }else if(n>=51 && n<=60){
            System.out.println("grade = CD");
        }else if(n>=41 && n<=50){
            System.out.println("grade = DD");
        }else if(n<=40){
            System.out.println("grade = Fail");
        }else{
            System.out.println("Invalid marks");
        }
    }
}
//git commit -m "Added Q4(Sum function) problem in Assignment4"                       