package Other_questions.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class subArraywithZerosum {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        if(subArraywithZerosum(arr)){
            System.out.println("Contains 0 Sum subarray");
        }

        System.out.println(subArraywithZerosumAnotherApproach(arr));
    }

    private static boolean subArraywithZerosum(int[] nums) {

        Set<Integer> hSet = new HashSet<>();
        int sum = 0;
        for(int num : nums){
            sum += num;

            if(hSet.contains(sum) || sum == 0 || num == 0){
                return true;
            }
            hSet.add(sum);
        }
        return false;
    }

    public static int subArraywithZerosumAnotherApproach(int[] nums){

        HashMap<Integer,Integer> hmap = new HashMap<>();

        int sum = 0;
        int maxlen = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == 0){
                maxlen = i + 1;
            }

            if(hmap.containsKey(sum)){
                maxlen = Math.max(maxlen, i - hmap.get(sum));
            }
            else{
                hmap.put(sum,i);
            }

        }

        return maxlen;

    }
}