package Other_questions.Arrays;

public class dutchFlagProb {

    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,2,1};
        dutchFlagProb(arr);
        //Complexity O(n) :: Time , O(1) :: Space
    }

    private static void dutchFlagProb(int[] arr) {
        int onecount = 0, zerocount = 0, twocount = 0;

        for(int elem : arr){
            if(elem==0) zerocount++;
            if(elem==1) onecount++;
            if(elem==2) twocount++;
        }

        for(int i = 0; i<arr.length;i++){
            if(zerocount >= 1) {
                arr[i] = 0; zerocount--;
            }
            else if(onecount >= 1){
                arr[i] = 1; onecount--;
            } 
            else if(twocount >=1 ){
                arr[i] = 2; twocount--;
            } 
        }

        for(int elem : arr){
            System.out.print(elem+ " ");
        }

        System.out.println();
    }

}