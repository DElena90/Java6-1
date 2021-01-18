import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void testCalculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateAverageValue() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMonthNumberWithMaxPurchases() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMonthNumberWithMaxPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMonthNumberWithMinPurchases() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMonthNumberWithMinPurchases(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateAmountMonthLessAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateAmountMonthLessAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateAmountMonthOverAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateAmountMonthOverAverage(purchases);
        assertEquals(expected, actual);
    }
}



