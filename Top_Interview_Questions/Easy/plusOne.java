package Top_Interview_Questions.Easy;

import java.util.Arrays;
import java.util.List;

public class plusOne {
    
    public static void main(String[] args) {
        // int arr[] = {1,2,1,9};
        int arr[] = {9};
        for( int num : plusOne(arr,0,arr.length-1)){
            System.out.print(num+" ");
        }
    }

    private static int[] plusOne(int[] arr,int start, int end) {

        for( int i = arr.length-1; i>=0; i--){
            if(arr[i]!=9){
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }

        int[] newArray = Arrays.copyOf(arr, arr.length+1);

        newArray[0] = 1;

        return newArray;
    }


}
