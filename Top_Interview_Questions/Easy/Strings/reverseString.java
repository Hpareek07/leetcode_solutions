package Top_Interview_Questions.Easy.Strings;

public class reverseString {
    
    public static void main(String[] args) {
        String s = "hello";
        char[] ch = reverse(s.toCharArray());

        for(char c : ch){
            System.out.print(c+" ");
        }
    }


    public static char[] reverse(char[] arr){
        StringBuilder sb = new StringBuilder();

        for(char c : arr){
            sb.append(c);
        }
        // System.out.println(sb.reverse().toString());        
        return sb.reverse().toString().toCharArray();

    }
}