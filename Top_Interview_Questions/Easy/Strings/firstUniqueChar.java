package Top_Interview_Questions.Easy.Strings;

import java.util.HashMap;

public class firstUniqueChar {

    public static void main(String[] args) {
        String s = "leetcode";

        // int res = findunique(s);
        int res = finduniqueinonego(s);
        System.out.println(res+" is the result");
    }

    private static int findunique(String s) {

        HashMap<Character,Integer> hmap = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }
            else{
                hmap.put(ch, 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(hmap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    

    public static int finduniqueinonego(String s ){

        for(char ch : s.toCharArray()){
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                return s.indexOf(ch);
            }
        }

        return -1;
    }
}