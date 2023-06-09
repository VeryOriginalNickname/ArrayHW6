import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();

        int drop = service.salesDrop(sales);
        int peak = service.salesPeak(sales);
        int sum = service.sum(sales);
        int avrSum = service.avrSum(sales);
        int less = service.lesAvr(sales);
        int more = service.morAvr(sales);


        System.out.println("Сумма всех продаж: " + sum);
        System.out.println("Средняя сумма: " + avrSum);
        System.out.println("Месяц с самыми высокими продажами: " + peak);
        System.out.println("Месяц с самыми низкимим продажами: " + drop);
        System.out.println("Колличество месяцев чья сумма ниже средней: " + less);
        System.out.println("Колличество месяцев чья сумма выше средней: " + more);

    }
}
