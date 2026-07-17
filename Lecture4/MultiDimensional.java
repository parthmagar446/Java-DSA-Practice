package Lecture4;
import java.util.Scanner;
import java.util.Arrays;
public class MultiDimensional {
    public static void main(String[] args){
        //initiallization off array (uneven coloumn case)
        // method 1
        int arr[][]={
            {1,2,},
            {3,4,5,},
            {6,7,8,9}
        };

        //method 2:
        int arr2[][]=new int[3][];
        arr2[0]=new int[]{9,8};
        arr2[1]=new int[]{7,6,5};
        arr2[2]=new int[]{4,3,2,1};
        
        //output:
        //method 1:
        System.out.println("arr1:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        //method 2:
        System.out.println("arr2:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(Arrays.toString(arr2[i]));
            System.out.println();          
        }

    }
}

