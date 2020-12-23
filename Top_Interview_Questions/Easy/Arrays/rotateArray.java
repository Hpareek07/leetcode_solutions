package Top_Interview_Questions.Easy.Arrays;


public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        rotateArray(arr,d);
    }
    private static void rotateArray(int[] arr, int d) {
        for (int i = 0; i < d;i++){
            rightRotate(arr,arr.length);
        }
        System.out.println("###############################");
        for(int e : arr){
            System.out.println(e+" is the array");
        }
        System.out.println("###############################");
    }

    private static void rightRotate(int[] arr, int length) {

        int temp = arr[length-1];
        // System.out.println("Value of temp is :" + temp);
        int i;
        for( i = length-1; i > 0 ; i--){
            // System.out.println("Value of ith an i-1th Index is :" + arr[i] + " "+arr[i-1]);
            arr[i] = arr[i-1];
        }
        // System.out.println("Value of i is :"+ i );
        arr[i] = temp;

    }
}
