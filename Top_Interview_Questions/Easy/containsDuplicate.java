package Top_Interview_Questions.Easy;

import java.util.Arrays;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};

        if(containsDuplicate(arr)) {
            System.out.println("Contains Duplicate");
        }
    }

    public static boolean containsDuplicate(int[] arr){
            //         HashMap<Integer,Boolean> hmap = new HashMap();
                    Arrays.sort(arr);
                    for( int i = 0; i<arr.length-1;i++){
                        // if(hmap.containsKey(arr[i])) return true;
                        // else{
                        //     hmap.put(arr[i],true);
                        // }
                        if(arr[i]==arr[i+1]) return true;
                    }
                    
                    // System.out.println(hmap.toString());
                    
                    return false;
    }
    
}
