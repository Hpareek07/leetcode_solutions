package Other_questions.Arrays;

import java.util.HashSet;

public class duplicateNumberinNplusonearr {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(duplicateNumberinNplusonearr(arr));
    }

    private static int duplicateNumberinNplusonearr(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();
        for(int elem : arr){
            if(hs.contains(elem)) return elem;
            hs.add(elem);
        }

        return 0;
    }
    
}