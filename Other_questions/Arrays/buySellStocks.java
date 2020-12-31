package Other_questions.Arrays;

public class buySellStocks {
    
    public static void main(String[] args) {
        int[] arr = {};

        int res = buySellStocks(arr);
    }

    private static int buySellStocks(int[] prices) {
        if (prices.length == 0)
            return 0;

        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (min <= prices[i])
                max = Math.max(max, prices[i] - min);
            else
                min = prices[i];
        }
        return max;
    }
}