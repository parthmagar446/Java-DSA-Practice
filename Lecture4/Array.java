package Lecture4;
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        //taking input:
        System.out.println("Enter the element of array 1:");
        //method 1:
        for(int i=0;i<5;i++){
            arr1[i]=in.nextInt();
        }

        System.out.println("Enter the element of array 2:");
        //method 2:
        for(int i=0;i<arr2.length;i++){
            arr2[i]=in.nextInt();
        }

        //output:
        //method 1:
        for(int i=0;i<5;i++){
            System.out.print(arr1[i]+ " ");
        }

        //method 2:
        //it requies to import Arrays class("import java.utils.Arrays")
        System.out.println(Arrays.toString(arr2));
    }
}
