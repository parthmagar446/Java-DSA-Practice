package Lecture4;
import java.util.Scanner;
import java.util.Arrays;
public class SwapArrayIndex {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Array Before Swapping:");
        System.out.println(Arrays.toString(arr));
        Swap(arr,1,4);
        System.out.println("Array After Swapping:");
        System.out.println(Arrays.toString(arr));

    }

    static void Swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
}
