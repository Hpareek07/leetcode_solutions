package Top_Interview_Questions.Easy.Strings;

import java.util.regex.Pattern;

public class palindromeOrNot {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        if(isPalindrome(s)){
            System.out.println("Is Palindrome!!");
        }
        else{
            System.out.println("Not Palindrome!!");
        }
    }

    private static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0 , right = s1.length()-1;

        while(left <= right){
            if(s1.charAt(left) == s1.charAt(right)){
                left++;
                right--;
            }
            else{
                System.out.println(s1.charAt(left)+" "+s1.charAt(right));
                return false;
            }
        }

        return true;
    }
    
}