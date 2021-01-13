package Other_questions.Arrays;
public class powxn{
    public static void main(String[] args) {
        int x = 1000;
        int n = 10;

        System.out.println(Math.round(powxn(x,n)));
    }

    private static double powxn(int x, int n) {

        double logofx = Math.log10(x);
        logofx = logofx * n;

        return Math.pow(10, logofx);
    }
}