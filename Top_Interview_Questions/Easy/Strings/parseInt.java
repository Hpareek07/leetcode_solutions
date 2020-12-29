package Top_Interview_Questions.Easy.Strings;

public class parseInt {

    public static void main(String[] args) {
        String s = " 3.14159";
        String testcase = "   -4193 with words";
        int num = parseInt(s);

        System.out.println(num+" is the number");
    }

    private static int parseInt(String s) {
        if(s.stripLeading().charAt(0)>=65){
            return 0;
        }

        System.out.println((int) Float.parseFloat(s.stripLeading().replaceAll("[^0-9-+\\.]", "")));
        int res = (int) Float.parseFloat(s.stripLeading().replaceAll("[^0-9-+\\.]", ""));
        System.out.println(res);
        try{

            if(Float.parseFloat(s.stripLeading().replaceAll("[^0-9-+.]", ""))<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(Float.parseFloat(s.stripLeading().replaceAll("[^0-9-+.]", ""))>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            res = (int) Float.parseFloat(s.stripLeading().replaceAll("[^0-9-+\\.]", ""));
            return res;
        }
        catch(Exception e ){
            return 0;
        }
    }
    
}