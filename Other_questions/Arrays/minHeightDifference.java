package Other_questions.Arrays;

import java.util.Arrays;

public class minHeightDifference {
    
    public static void main(String[] args) {
        // int[] arr = {1,5,15,10};
        // int[] arr = {4,6};
        // int[] arr = {1, 5, 8, 10};
        int[] arr = {2,6,3,4,7,2,10,3,2,1};
        int k = 10;
        minHeightDifference(arr,k);
    }

    private static void minHeightDifference(int[] arr, int k) {

        // Sorted Array :: 1 , 5 , 10 , 15
        // Small :: 4  Big :: 12
        Arrays.sort(arr);
        int n = arr.length-1;
        int ans = arr[n] - arr[0];
        int min = 0;
        int max = 0;
        int small = arr[0]+k;
        int big = arr[n]-k;
        System.out.println("Value of Small and Big is : "+small+ " "+big);
        if(small > big){
            int temp = small;
            small = big;
            big = temp;
        }
        for (int i = 1; i < n - 1;i++){
            min = Math.min(small, arr[i] - k );
            max = Math.max(big, arr[i]+k);
            System.out.println("Value of Max :: Min and MAX-MIN is : "+max+ " "+min+" "+(max-min));
            ans = Math.min(ans, max-min);
        }

        System.out.println(ans+" is the answer");

        // return ans;

    }
}