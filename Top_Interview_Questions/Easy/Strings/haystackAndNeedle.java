package Top_Interview_Questions.Easy.Strings;

public class haystackAndNeedle {

    public static void main(String[] args) {
        String haystack = "hello", needle = "d";

        int res = haystackAndNeedle(haystack,needle);
        System.out.println(res);
    }

    private static int haystackAndNeedle(String haystack, String needle) {

        if(needle.equalsIgnoreCase("")){
            return 0;
        }

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    
}