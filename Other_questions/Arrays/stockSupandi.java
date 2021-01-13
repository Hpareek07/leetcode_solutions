package Other_questions.Arrays;

public class stockSupandi {
    public static void main(String[] args) {
        int n = 3;
        int buyprice = 4;

        stockSupandi(n,buyprice);
    }

    private static void stockSupandi(int n, int buyprice) {
        int wait = 0;
        if(buyprice <= n ) wait = n-buyprice;
        else{
            wait = rec(n, buyprice);
        }

        System.out.println(wait+ " is the days");
    }

    private static int rec(int n, int buyprice){
        // if(n<0) return 0;
        // if(n==buyprice) return 1;
        // return 1 + Math.min(rec(n-1, buyprice), rec(n*2, buyprice));

        int ans = 0; 
        int m = buyprice;
    // Continue till m is greater than n 
    while(m > n) 
    { 
        // If m is odd 
        if(m % 2 != 0)  
        { 
            // add one 
            m++; 
            ans++; 
        } 
          
        // divide m by 2      
        m /= 2; 
        ans++; 
    } 
      
    // Return the required answer 
    return ans + n - m; 

    }
}