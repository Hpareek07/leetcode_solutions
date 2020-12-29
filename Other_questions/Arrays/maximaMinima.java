package Other_questions.Arrays;

public class maximaMinima {

    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5};
        //Result = 5, 4, 3, 2, -1
        //Complexity O(n) :: Time , O(1) :: Space
        maximaMinima(arr);
    }

    private static void maximaMinima(int[] arr) {

        int localmax = 0, localmin = 0, max = 0, min = 0;

        for(int elem : arr){
            if(elem > localmax) localmax = elem;
            if(elem < localmin) localmin = elem;

            if(localmax > max) max = localmax;
            if(localmin < min) min = localmin;
        }

        System.out.println(max+ " ::  is the Max and " + min+ " is the min");

    }
    
}