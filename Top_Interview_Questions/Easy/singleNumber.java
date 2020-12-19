package Top_Interview_Questions.Easy;

import java.util.HashMap;

public class singleNumber {
 
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        int res = singleNumber(arr);
        System.out.println(res+" is the result");

        int res1 = singleNumberOtherApproach(arr);
        System.out.println(res1+" is the result");
    }

    private static int singleNumberOtherApproach(int[] arr){

        if(arr.length ==1) return arr[0];
        int res = 0;
        for( int num : arr){
            res ^= num;
        }
        return res;
    }

    private static int singleNumber(int[] arr) {

        if(arr.length == 1) return arr[0];
        HashMap<Integer,Integer> hmap = new HashMap();
        for(int i = 0; i < arr.length; i++ ){
            if(!hmap.containsKey(arr[i])){
                hmap.put(arr[i], 1);
            }
            else{
                hmap.put(arr[i], hmap.get(arr[i])+1);
            }
        }
        
        for(int i = 0 ; i < arr.length; i++){
            if(hmap.get(arr[i])==1){return arr[i];}
        }

        return 0;
    }

    
    
}
