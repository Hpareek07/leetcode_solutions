package Top_Interview_Questions.Easy.Strings;

public class reverseInt {
    
    public static void main(String[] args) {
        int num = -210;

        System.out.println(reverse(num));
        
    }

    public static int reverse(int num){
        long rev =0,a=num;
        if(a<0)
            a = 0-a;
        while(a>0)
        {
            rev = rev*10+a%10;
            a= a/10;
        }
        if(num<0)
            rev = 0-rev;
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) 
            return 0;
        
        return (int)rev;
    }
}