package Top_Interview_Questions.Easy.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class intersectArray {
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersect(nums1,nums2);

        for(int res1 : res){
            System.out.println(res1);
        } 
    }

    private static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hmap =  new HashMap<>();

        for(int i : nums1){
            if(hmap.containsKey(i)){
                hmap.put(i, hmap.get(i)+1);
            }
            else{
                hmap.put(i, 1);
            }
        }

        ArrayList<Integer> intersection = new ArrayList();

        for(int i : nums2){
            if(hmap.containsKey(i) && hmap.get(i) > 0){
                intersection.add(i);
                hmap.put(i, hmap.get(i)-1);
            } 
        }

        return intersection.stream().mapToInt(i -> i).toArray();
    }

}