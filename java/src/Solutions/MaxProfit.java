package Solutions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by btru on 11/6/14.
 * Gets max profit of all days
 */

public class MaxProfit {
    public static void main(String[] args){
        int[] prices = {8, 5, 2, 6, 6, 2, 64, 3, 6, 2 ,7 , 234, 63, 6};
        int min_price = prices[0];
        int max_profit = 0;
        int currentPrice;
        for(int price : prices){
            currentPrice = price;
            min_price = Math.min(currentPrice, min_price);
            max_profit = Math.max(max_profit, currentPrice - min_price);
        }

        System.out.println(max_profit);
    }
}
