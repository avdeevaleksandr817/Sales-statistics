package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumMonth() {
        StatsService service = new StatsService();
        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumMonth(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthlyAverage() {
        StatsService service = new StatsService();
        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateMonthlyAverage(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsBelowAverage(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesAboveAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
}