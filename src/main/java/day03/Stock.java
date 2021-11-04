package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {

    private List<Double> dailyPrice;

    public Stock(List<Double> dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public double maxProfit() {

        double max = 0;
        double d = 0;
        for (int i = 1; i < dailyPrice.size(); i++) {
            if (dailyPrice.get(i - 1) <= dailyPrice.get(i)) {
                d += dailyPrice.get(i) - dailyPrice.get(i - 1);
                if (d > max)
                    max = d;
            }
            else
                d = 0;
        }

        return max;
    }

    public static void main(String[] args) {

        Stock stock = new Stock(Arrays.asList(1.23, 4.35, 0.23, 4.0, 8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0, 2.0, 8.0, 4.0));
        System.out.println(stock2.maxProfit()); //6.0

    }
}

