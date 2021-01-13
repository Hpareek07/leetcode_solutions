package Other_questions.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class substitue {
    public static void main(String[] args) {
        String s = "keyboard";
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());    

        char[] firstArr = new char[n];

        char[] secondArr = new char[n];

        for(int i = 0; i < n; i++){
            firstArr[i] = sc.nextLine().charAt(0);
        }

        int m = Integer.parseInt(sc.nextLine());    

        for(int i = 0; i < n; i++){
            secondArr[i] = sc.nextLine().charAt(0);
        }

        HashMap<Character,Character> hmap = new HashMap();

        for(int i = 0; i< n; i++){
            hmap.put(firstArr[i], secondArr[i]);
            hmap.put(secondArr[i], firstArr[i]);
        }

        System.out.println(substitue(s,hmap));
    }

    private static String substitue(String s, HashMap<Character,Character> hMap) {
        char[] arr = s.toCharArray();
        for(int i = 0 ; i< s.length(); i++){

            if(hMap.containsKey(arr[i])){
                arr[i] = hMap.get(arr[i]);
            }
        }

        for(char c : arr){
            System.out.print(c);
        }

        return arr.toString();
    }
}