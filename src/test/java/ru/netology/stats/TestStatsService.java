package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatsService {

    @Test
    public void testGetSum(){
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ожидаемый результат, в данном случае сумма всех элементов массива sales
        int expectedResult = 180;

        StatsService service = new StatsService();

        assertEquals(expectedResult, service.getSum(sales));
    }

    @Test
    public void testGetAverageSum(){
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ожидаемый результат, в данном случае средняя сумма всех элементов массива sales: 180 / 12
        int expectedResult = 15;

        StatsService service = new StatsService();

        assertEquals(expectedResult, service.getAverageSum(sales));
    }

    @Test
    public void testGetMonthNumberForMaxSales(){
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ожидаемый результат, в данном случае номер месяца, в котором был пик продаж: 7
        int expectedResult = 7;

        StatsService service = new StatsService();

        assertEquals(expectedResult, service.getMonthNumberForMaxSales(sales));
    }

    @Test
    public void testGetMonthNumberForMinSales(){
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ожидаемый результат, в данном случае номер месяца, в котором был минимум продаж: 8
        int expectedResult = 8;

        StatsService service = new StatsService();

        assertEquals(expectedResult, service.getMonthNumberForMinSales(sales));
    }

    @Test
    public void testGetMonthNQuantityForBelowAverage(){
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ожидаемый результат, в данном случае кол-во месяцев, в которых продажи были ниже среднего, т.е. < 15
        int expectedResult = 5;

        StatsService service = new StatsService();

        assertEquals(expectedResult, service.getMonthQuantityForBelowAverage(sales));
    }

    @Test
    public void testGetMonthNQuantityForAboveAverage(){
        int[] sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // Ожидаемый результат, в данном случае кол-во месяцев, в которых продажи были выше среднего, т.е. > 15
        int expectedResult = 5;

        StatsService service = new StatsService();

        assertEquals(expectedResult, service.getMonthQuantityForAboveAverage(sales));
    }
}
