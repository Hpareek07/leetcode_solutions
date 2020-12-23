package Top_Interview_Questions.Easy.Arrays;

/* 
Problem Statement : 

Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

*/

public class removeDuplicatesfromSortedArray{
    public static void main(String[] args){
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        int length = removeDuplicateElements(arr);

        for(int i = 0; i<length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int removeDuplicateElements(int[] arr) {
        
        if(arr.length == 0 || arr.length == 1){
            return 1;
        }

        int ptr = 0;
        
        for(int i = 0; i< arr.length - 1; i++){

            if( arr[i] != arr[i+1]){
                arr[ptr] = arr[i];
                ptr++;
            }

        }

        // Adding last Element
        arr[ptr++] = arr[arr.length-1];

        return ptr;
    }
}