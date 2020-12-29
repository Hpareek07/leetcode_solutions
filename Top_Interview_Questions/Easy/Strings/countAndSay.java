package Top_Interview_Questions.Easy.Strings;

public class countAndSay {

    public static void main(String[] args) {
        int num = 1;

        String first = "flower";
        String second  = "flight";
        String prefix = "flowe";
        System.out.println(second.indexOf(prefix)+ " second.indexOf(first)");;
        prefix = prefix.substring(0, prefix.length() -1 );
        System.out.println(prefix+ " ");
        String s = countAndSay(num);

        System.out.println(s);
    }

    public static String countAndSay(int n) {
        if(n==1) return "1";
        String ans = "1";
        for(int i=2; i<=n; i++){
            ans = recursiveFunc(ans);
        }
        return ans;
    }
    
    public static String recursiveFunc(String s){
        char ch = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != ch){
                sb.append(count).append(ch);
                ch = s.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }


    
}