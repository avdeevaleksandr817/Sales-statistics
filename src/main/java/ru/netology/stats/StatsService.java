package ru.netology.stats;

public class StatsService {

    public int calculateSumMonth(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateMonthlyAverage(int[] sales) {
        return calculateSumMonth(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(int[] sales) {
        int month = 0;
        for (int sale : sales)
            if (sale < calculateMonthlyAverage(sales)) {
                month++;
            }
        return month;
    }

    public int monthsSalesAboveAverage(int[] sales) {
        int month = 0;
        for (int sale : sales)
            if (sale > calculateMonthlyAverage(sales)) {
                month++;
            }
        return month;
    }
}
