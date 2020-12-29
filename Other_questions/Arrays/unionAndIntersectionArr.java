package Other_questions.Arrays;

public class unionAndIntersectionArr {
    
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int[] arr1 = {1,3};

        unionAndIntersectionArr(arr,arr1);
    }

    private static void unionAndIntersectionArr(int[] arr, int[] arr1) {
        System.out.print("INTERSECTION IS :: ");
        intersection(arr,arr1);
        System.out.println();
        System.out.print("UNION IS :: ");
        printunion(arr,arr1);
        System.out.println();
    }

    private static void printunion(int[] arr, int[] arr1) {
        int i = 0, j = 0;

        while( i < arr.length && j < arr1.length ){
            if(arr[i] == arr1[j]){
                System.out.print(arr[i]+ " ");
                i++;
                j++;
            }
            else if( arr[i] > arr[j] ){
                System.out.print(arr[j]+" ");
                j++;
            }
            else if( arr[i] < arr[j] ){
                System.out.print(arr[i]);
                i++;
            }
        }

        while(i < arr.length){
            System.out.print(arr[i++]+ " ");
        }

        while(j < arr1.length){
            System.out.print(arr1[j++]+ " ");
        }
    }

    private static void intersection(int[] arr, int[] arr1) {

        int i = 0, j = 0;

        while(i < arr.length && j < arr1.length){
            if(arr[i] == arr1[j]){
                System.out.print(arr[i]+" ");
                i++;j++;
            }
            else if( arr[i] < arr[j] ){
                i++;
            }
            else if( arr[i] < arr[j] ){
                j++;
            }
        }
    }
}