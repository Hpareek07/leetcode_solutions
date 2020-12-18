package Top_Interview_Questions.Easy;

public class buySellShares {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int max_profit = calculateProfit(prices);

        System.out.println(max_profit+" is the max profit !!");
    }

    public static int calculateProfit(int[] price){
        int profit = 0; // To store the maximum profit Gained
        int j = 0; // Local Minima being intiliazed as first element

        for (int i = 1; i < price.length; i++){
    
            if (price[i - 1] > price[i]) { // If we have a decreasing sequence then local minima is updated.
                j = i;
            }
            if (price[i - 1] <= price[i] && (i + 1 == price.length || price[i] > price[i + 1])){ // Sell if current element is bigger than it's neighbours.
                profit += (price[i] - price[j]);
            }
        }
        return profit;
    }
    
}