package ru.netology.javaqa;

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum;

    }


    public long averageАmount(long[] sales) {

        return sum(sales) / sales.length;

    }
}

