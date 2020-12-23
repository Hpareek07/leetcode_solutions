package Top_Interview_Questions.Easy.Arrays;

public class rotateArraywithJugglingAlgo {
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;

        int gcd = calculateGCD(arr.length, d);

        rotateArrray(arr, d , gcd);
        System.out.println(gcd + " is the gcd");
    }

    private static void rotateArrray(int[] arr, int d, int gcd) {

        

    }

    public static int calculateGCD(int length, int d) {
        if(length == 0) return d;
        if(d ==  0) return length;

        if(length > d) return calculateGCD(length%d, d);
        return calculateGCD(length, d%length);
    }

}