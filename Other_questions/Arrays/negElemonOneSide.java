package Other_questions.Arrays;

public class negElemonOneSide {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,3,-2,-3};

        negElemonOneSide(arr);
    }

    private static void negElemonOneSide(int[] arr) {
        int left = 0, right = arr.length - 1;

        while(left <= right){
            if(arr[left] < 0 && arr[right] < 0){
                left++;
            }
            else if(arr[left] > 0 && arr[right] > 0){
                right--;
            }
            else if(arr[left] >0 && arr[right] < 0){
                //swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }

        for(int elem: arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}