package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    public int findMonthNumberWithMaxPurchases(long[] purchases) {
        int month = 0;
        int number = 1;
        long maxValue = purchases[0];
        for (long purchase : purchases) {
            month = month + 1;
            if (purchase >= maxValue) {
                maxValue = purchase;
                number = month;
            }
        }
        return number;
    }

    public int findMonthNumberWithMinPurchases(long[] purchases) {
        int month = 0;
        int number = 1;
        long minValue = purchases[0];
        for (long purchase : purchases) {
            month = month + 1;
            if (purchase <= minValue) {
                minValue = purchase;
                number = month;
            }
        }
        return number;
    }

    public int calculateAmountMonthLessAverage(long[] purchases) {
        long average = calculateAverage(purchases);
        int amount = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int calculateAmountMonthOverAverage(long[] purchases) {
        long average = calculateAverage(purchases);
        int amount = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                amount = amount + 1;
            }
        }
        return amount;
    }
}
