package Other_questions.Basic;

public class mulandSum {
    public static void main(String[] args) {
        int n = 234;
        int res = mulandSum(n);
        System.out.println(res+ " is the result");
    }

    private static int mulandSum(int n) {

        int temp = n;
        int mul = 1;
        int sub = 0;
        while(temp > 0){
            System.out.println(mul + " is "+ temp%10);
            mul *= temp%10;
            temp = temp/10;
        }
        temp = n;
        while(temp > 0){
            sub = sub + temp%10;
            temp = temp/10;
        }
        System.out.println(mul + " " + sub);
        return mul - sub;
    }
}