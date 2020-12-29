package Other_questions.Arrays;

public class cyclicalRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;

        while(k>0){
            cyclicalRotate(arr);
            k--;
        }

        for(int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();
        
    }

    private static void cyclicalRotate(int[] arr) {

        int temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

}