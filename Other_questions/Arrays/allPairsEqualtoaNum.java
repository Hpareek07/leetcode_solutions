package Other_questions.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class allPairsEqualtoaNum {
    public static void main(String[] args) {
        int k = 6;
        int[] arr = {1, 5, 7, -1};

        int pairs = allPairsEqualtoaNum(arr,k);
    }

    private static int allPairsEqualtoaNum(int[] arr, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);
 
            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
    }
}