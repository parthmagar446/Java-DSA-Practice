package Lecture4;
import java.util.Scanner;
import java.util.Arrays;
public class MaxArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        max(arr);
    }
    static void max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("greatest element in the array is :" +max );
    }
}
