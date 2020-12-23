package Top_Interview_Questions.Easy.Strings;

import java.util.HashMap;

public class anagramOrNot {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram"; 

        boolean res = findanagram(s1, s2);

        if(res){
            System.out.println("True");
        }
    }

    private static boolean findanagram(String s1, String s2) {


        HashMap<Character,Integer> hmap = new HashMap();
        
        for(char ch : s1.toCharArray()){
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }
            else{
                hmap.put(ch, 1);
            }
        }

        for(char ch : s2.toCharArray()){
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)-1);
            }

            if(hmap.containsKey(ch) && hmap.get(ch)==0){
                hmap.remove(ch);
            }
        }

        if(hmap.size()==0) return true;
        else return false;
        

    }

    public boolean isAnagram(String s, String t) {
     
        if(s.length()!=t.length()){
            return false;
        }
        
        int[] char_count = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }
        
        for(int n: char_count){
            if(n!=0){
                return false;
            }
        }
    return true;
    }
    
}
