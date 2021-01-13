package Other_questions.Arrays;

import java.util.Arrays;

public class search2DMatrix {
    public static void main(String[] args) {
        // int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int find = 13;
        int res = search2DMatrix(arr,find);
        System.out.println(res);
    }

    private static int search2DMatrix(int[][] arr,int elem) {

        int rows = arr.length;
        System.out.println("Number of rows is : "+rows);
        int col = arr[0].length - 1;
        int index_find = -1;
        for(int i = 0; i < rows; i++){
            if(elem >= arr[i][0] && elem <= arr[i][col]){
                index_find = Arrays.binarySearch(arr[i], elem);
            }
        }

        return index_find;
    }
}