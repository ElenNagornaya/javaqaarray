package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMimMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sum);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldFindMiddleSum() {
        StatsService service = new StatsService();
        long[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.middleSales(sum);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldFindUnderMiddleMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 11;
        int actualMonth = service.underMiddleSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindOverMiddleMonth() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 12;
        int actualMonth = service.overMiddleSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }


}

