package Other_questions.Arrays;

public class revArray {

        public static void main(String[] args) {
            int[] arr = {-1,2,3,4,5};
            //Result = 5, 4, 3, 2, -1
            //Complexity O(n) :: Time , O(1) :: Space
            revArray(arr);
        }

        private static void revArray(int[] arr) {
            int left = 0, right = arr.length - 1;
            while(left < right) {
                arr[left] = arr[left] + arr[right];
                arr[right] = arr[left] - arr[right];
                arr[left] = arr[left] - arr[right];

                left++;
                right--;
            }
            

            for(int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        
}