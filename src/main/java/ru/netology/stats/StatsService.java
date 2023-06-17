package ru.netology.stats;

public class StatsService {

    public int salesDrop(int[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSale]) {
                minSale = i;
            }
        }
        return minSale + 1;
    }

    public int salesPeak(int[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    public int sum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int avrSum(int[] sales) {
        int avrSum = sum(sales);

        return avrSum/sales.length;
    }

    public int lesAvr(int[] sales) {
        int avrSum = avrSum(sales);
        int mThatLess = 0;
        
        for (int i =0; i < sales.length; i++){
            if (sales[i]<avrSum) mThatLess++;
        }
        return mThatLess;
    }

    public int morAvr(int[] sales) {
        int avrSum = avrSum(sales);
        int mThatMore = 0;

        for (int i =0; i < sales.length; i++){
            if (sales[i]>avrSum) mThatMore++;
        }
        return mThatMore;
    }
}