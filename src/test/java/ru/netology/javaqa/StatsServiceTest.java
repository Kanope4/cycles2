package ru.netology.javaqa;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.StatsService;


public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void avg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales) / 12;
        long expected = 180 / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxi() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxi(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMini() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.mini(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldAboveAvg(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAvg(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}




