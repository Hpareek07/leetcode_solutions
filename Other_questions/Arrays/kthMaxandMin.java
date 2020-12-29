package Other_questions.Arrays;

import java.util.Iterator;
import java.util.PriorityQueue;

public class kthMaxandMin {
    
    public static void main(String[] args) {
        // int[] arr = {-1,2,3,4,5};
        int arr[] = { 11, 3, 2, 1, 15, 5, 4,
            45, 88, 96, 50, 45 };
        int k = 3;
        //Result = 5, 4, 3, 2, -1
        //Complexity  :: Time ,  :: Space
        kthMaxandMin(arr,k);
    }

    private static void kthMaxandMin(int[] arr,int k ) {
        PriorityQueue<Integer> minHeap =  new PriorityQueue<Integer>(); 

        for(int elem : arr){
            minHeap.add(elem);
        }

        for(int i = 0; i < k;i++){

            if(minHeap.peek() < arr[i]){
                continue;
            }
            else{
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        // Iterator iterator = minHeap.iterator();
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        // for(Object elem : minHeap.toArray()) {
        //     System.out.println(elem.toString());
        // }
        System.out.println(minHeap.toArray()[k-1]);
        System.out.println(minHeap.toArray()[arr.length-k+1]);
        
             
    }

}