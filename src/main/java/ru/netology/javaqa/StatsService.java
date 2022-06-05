package ru.netology.javaqa;

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum;

    }


    public long avg(long[] sales) {

        return sum(sales) / sales.length;

    }

    public int aboveAvg(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;

            }

        }
        return count;

    }

    public int maxi(int[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxi]) {
                maxi = i;

            }


        }
        return maxi;
    }
    public int mini(int[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[mini]) {
                mini = i;

            }


        }
        return mini;
    }

    public int minSales(long[] sales) {
        int minAvg = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minAvg]) {
                minAvg = month;
            }
            month = month + 1;
        }
        return minAvg + 1;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


}