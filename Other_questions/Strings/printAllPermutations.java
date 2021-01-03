package Other_questions.Strings;

import java.util.Scanner;

public class printAllPermutations {
    public static void main(String[] args) {
        String s = "ABC";
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int numberofcases = Integer.parseInt(n);
        printAllPermutations(s,0,s.length()-1);
    }

    private static void printAllPermutations(String str, int l, int r) {
        if (l == r) 
            System.out.println(str); 
        else{ 
            for (int i = l; i <= r; i++){ 
                str = swap(str,l,i); 
                printAllPermutations(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    }

    public static String swap(String a, int i, int j){ 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}