package Top_Interview_Questions.Easy.Arrays;

public class moveZeroes {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);
    }

    private static void moveZeroes(int[] arr) {
        int c = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[c++] = arr[i];
            }
        }

        for(int i = c; i < arr.length;i++){
            arr[i] = 0;
        }

        for(int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();

    }
    
}