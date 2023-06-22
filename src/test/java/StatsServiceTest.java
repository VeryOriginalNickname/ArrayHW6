import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sumOfArray() {
        StatsService service = new StatsService();

        int[] sales = {222, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 880};

        int expected = 1147;
        int actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avrSumOfArray() {
        StatsService service = new StatsService();

        int[] sales = {222, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 880};

        int expected = 95;
        int actual = service.avrSum(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void peakMonth() {
        StatsService service = new StatsService();

        int[] sales = {222, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 880};

        int expected = 12;
        int actual = service.salesPeak(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dropMonth() {
        StatsService service = new StatsService();

        int[] sales = {222, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 880};

        int expected = 11;
        int actual = service.salesDrop(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessAverage() {
        StatsService service = new StatsService();

        int[] sales = {222, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 880};

        int expected = 10;
        int actual = service.lesAvr(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreAverage() {
        StatsService service = new StatsService();

        int[] sales = {222, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 880};

        int expected = 2;
        int actual = service.morAvr(sales);

        Assertions.assertEquals(expected, actual);
    }


}