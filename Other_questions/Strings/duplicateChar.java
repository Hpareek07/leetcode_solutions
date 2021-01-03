package Other_questions.Strings;

import java.util.HashMap;

public class duplicateChar {
    public static void main(String[] args) {
        String s = "aabbccc";

        duplicateChar(s);
    }

    private static void duplicateChar(String s) {

        HashMap<Character,Integer> hmap = new HashMap<>();


        for(char c  : s.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);
            }
            else{
                hmap.put(c, 1);
            }
        }
        for(Character c : hmap.keySet()) {
            if(hmap.get(c)>1) System.out.print(c+" ");
        }
        System.out.println();
    }

    
}