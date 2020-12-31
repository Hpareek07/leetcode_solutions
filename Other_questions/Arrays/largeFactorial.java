package Other_questions.Arrays;

import java.math.BigDecimal;
import java.math.BigInteger;

public class largeFactorial {
    public static void main(final String[] args) {
        final int n = 30;

        largeFactorial(n);
    }

    private static void largeFactorial(final int n) {

        double res = 0;

        for(int i = n; i >=2 ; i--){
            double temp = Math.log10(i);
            res += temp;
        }

        // System.out.println(res+" is the value");
        // BigInteger big = new BigInteger("10");
        BigDecimal big1 = new BigDecimal(10);

        // System.out.println(big1.pow(3)+ " is the value");
        // System.out.println((int)Math.pow(10, res)+ " is the value");
        // System.out.println(big.toString()+ " is the value");
        // System.out.println(res);
        // System.out.println(Math.floor(res));
        int floor = (int) Math.floor(res);

        float remainder = (float) (res - floor);
        big1 = big1.pow(floor);
        System.out.println(big1.toString());
        double rempow = Math.pow(10, remainder);
        System.out.println(BigDecimal.valueOf(rempow));
        System.out.println(BigDecimal.valueOf(rempow).toBigInteger());
        // big1 = big1.multiply(BigDecimal.valueOf(rempow));
        // System.out.println();

        System.out.println(rempow+ "*"+big1);

        // System.out.println(Math.round(big1.doubleValue()));
        

    }
}

// 1000!
// 