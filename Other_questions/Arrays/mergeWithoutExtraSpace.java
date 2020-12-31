package Other_questions.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] num1 = {3,27,38,43};
        int[] num2 = {9,10,82};

        mergeWithoutExtraSpace(num1,num2);
    }

    private static void mergeWithoutExtraSpace(int[] num1, int[] num2) {
        
        int j = 0;
        int i = 0;
        while(i <= num1.length - 1 && j < num2.length - 1){
            if(num1[i] > num2[j]){
                System.out.println("Inside!!!");
                int temp  =num1[i];
                num1[i] = num2[j];
                num2[j] = temp;
                Arrays.sort(num2);
                i++;
                j=0;
            }
            else if(num1[i] < num2[j]) i++;
        }

        for(int elem : num1){
            System.out.print(elem+" ");
        }
        for(int elem : num2){
            System.out.print(elem+ " ");
        }
        System.out.println();
    }
}