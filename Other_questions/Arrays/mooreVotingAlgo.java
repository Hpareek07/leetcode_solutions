package Other_questions.Arrays;

public class mooreVotingAlgo {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int res = mooreVotingAlgo(arr);
        System.out.println(res);


       
    }

    private static int mooreVotingAlgo(int[] arr) {
        //         HashMap<Integer,Integer> hmap = new HashMap<>();
        
//         for(int num : nums){
//             if(hmap.containsKey(num)){
//                 hmap.put(num,hmap.get(num)+1);
//             }
//             else{
//                 hmap.put(num,1);
//             }
//         }
        
//         for(int num : nums ){
//             if(hmap.get(num) > nums.length/2) return num;
//         }
//         return 0;
        int count = 0;
        int elem = 0;
        for(int i = 0;i<arr.length;i++){

            if(count == 0){
                elem = arr[i];
            }

            if(arr[i] == elem) count++;
            else count--;
        }

        return elem;
    }
}