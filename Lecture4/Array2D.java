package Lecture4;
import java.util.Scanner;
import java.util.Arrays;
public class Array2D {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the element of 2D Array:");
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("3x3 Marix:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
       }
    
}
