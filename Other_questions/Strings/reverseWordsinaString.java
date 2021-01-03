package Other_questions.Strings;

import java.util.ArrayList;

public class reverseWordsinaString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";

        String res = reverseWordsinaString(s);

        System.out.println(res+ "");


        for(String s1 : reverseWordsinaStringAnotherApproach(s)){
            System.out.print(s1+".");
        }
        System.out.println();
    }

    private static String reverseWordsinaString(String s) {

        String arr[] = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1;i >=0 ; i--){
            if(i==0){
                sb.append(arr[i]);
                break;
            }
            sb.append(arr[i]+".");
        }
        
        return sb.toString();
    }

    private static String[] reverseWordsinaStringAnotherApproach(String s) {

        String arr[] = s.split("\\.");

        int left = 0, right = arr.length - 1;

        while(left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
}