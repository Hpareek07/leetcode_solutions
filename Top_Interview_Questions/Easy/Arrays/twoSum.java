package Top_Interview_Questions.Easy.Arrays;

import java.util.Arrays;

public class twoSum {
    
    public static void main(String[] args) {
        // int[] arr = {2,7,11,15};
        int[] arr = {3,2,4};
        int k = 8;

        int[] res = twoSum(arr,k);
        for(int i : res){
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] arr, int tgt) {

        int left = 0, right = arr.length-1;
        Arrays.sort(arr);
        while(left < right){
            if(arr[left]+arr[right] == tgt) return new int[] {arr[left],arr[right]};

            else if (arr[left]+arr[right] > tgt) right--;

            else if (arr[left]+arr[right] < tgt) left++;
        }
        return new int[] {};

    }

    
}