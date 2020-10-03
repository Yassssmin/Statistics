package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    public int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumAll() {
        StatsService service = new StatsService();

        long actual = service.sumAll(this.numbers);

        assertEquals(180, actual);
    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();

        long actual = service.averageAmount(this.numbers);

        assertEquals(15, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        long actual = service.maxSales(this.numbers);

        assertEquals(6, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();

        long actual = service.minSales(this.numbers);

        assertEquals(9, actual);
    }

    @Test
    void belowAverage() {
        StatsService service = new StatsService();

        long actual = service.belowAverage(this.numbers);

        assertEquals(5, actual);
    }

    @Test
    void aboveAverage() {
        StatsService service = new StatsService();

        long actual = service.aboveAverage(this.numbers);

        assertEquals(5, actual);
    }
}