package Other_questions.Arrays;

public class arrInversion {
    public static void main(String[] args) {
        int[] arr = {8,4,2,1};

        int res = arrInversion(arr);
        System.out.println(res+" is the result");
    }

    private static int arrInversion(int[] arr) {

        int invcount = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                    invcount++;
                }
            }
        }

        return invcount;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}