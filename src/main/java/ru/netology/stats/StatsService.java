package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] values) {
        long sum = 0;
        for (long value: values) {
            sum = sum + value;
        }
        return sum;
    }

    public long calculateAverageValue(long[] values) {
        long sum = 0;
        for (long value: values) {
            sum = sum + value;
        }
        return sum / 12;
    }

    public int findMonthNumberWithMaxPurchases(long[] values) {
        int month = 0;
        int number = 1;
        long maxValue = values[0];
        for (long value: values) {
            month = month + 1;
            if (value >= maxValue) {
                maxValue = value;
                number = month;
            }
        }
        return number;
    }

    public int findMonthNumberWithMinPurchases(long[] values) {
        int month = 0;
        int number = 1;
        long minValue = values[0];
        for (long value : values) {
            month = month + 1;
            if (value <= minValue) {
                minValue = value;
                number = month;
            }
        }
        return number;
    }

    public int calculateAmountMonthLessAverage(long[] values) {
        long sum = 0;
        for (long value : values) {
            sum = sum + value;
        }
        long average = sum / 12;
        int amount = 0;
        for (long value : values) {
            if (value < average) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int calculateAmountMonthOverAverage(long[] values) {
        long sum = 0;
        for (long value : values) {
            sum = sum + value;
        }
        long average = sum / 12;
        int amount = 0;
        for (long value : values) {
            if (value > average) {
                amount = amount + 1;
            }
        }
        return amount;
    }
}
