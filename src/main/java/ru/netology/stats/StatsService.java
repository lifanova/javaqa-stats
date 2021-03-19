package ru.netology.stats;

public class StatsService {

    /**
     * Сумма всех продаж
     */
    public int getSum(int[] arr) {
        int resultSum = 0;

        if (arr.length == 0) {
            System.out.println("[getSum]: Ошибка: массив пуст!");
            return 0;
        }

        for (int val : arr) {
            resultSum += val;
        }

        return resultSum;
    }

    /**
     * Средняя сумма продаж в месяц
     */
    public int getAverageSum(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[getAverageSum]: Ошибка: массив пуст!");
            return 0;
        }

        return getSum(arr) / arr.length;
    }

    /**
     * Номер месяца, в котором был пик продаж
     */
    public int getMonthNumberForMaxSales(int[] arr) {
        int maxNumber = 0;
        if (arr.length == 0) {
            System.out.println("[getMonthNumberForMaxSales]: Ошибка: массив пуст!");
            return 0;
        }

        // Ищем номер месяца, в котором был пик продаж - последний месяц
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                maxNumber = i;
            }
        }

        return maxNumber;
    }

    /**
     * Номер месяца, в котором был минимум продаж
     * */
    public int getMonthNumberForMinSales(int[] arr) {
        int minNumber = 0;
        if (arr.length == 0) {
            System.out.println("[getMonthNumberForMinSales]: Ошибка: массив пуст!");
            return 0;
        }

        // Ищем номер месяца, в котором был минимум продаж - последний месяц
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minNumber = i;
            }
        }

        return minNumber;
    }

    /**
     * Кол-во месяцев, в которых продажи были ниже среднего
     * */
    public int getMonthQuantityForBelowAverage(int[] arr) {
        int monthQuantity = 0;
        if (arr.length == 0) {
            System.out.println("[getMonthQuantityForBelowAverage]: Ошибка: массив пуст!");
            return 0;
        }

        int averageSum = getAverageSum(arr);
        if (averageSum <= 0) {
            System.out.println("[getMonthQuantityForBelowAverage]: Ошибка: Средняя сумма = 0! ");
            return 0;
        }

        for (int val : arr) {
            if (val < averageSum) {
                monthQuantity++;
            }
        }

        return monthQuantity;
    }

    /**
     * Кол-во месяцев, в которых продажи были выше среднего
     * */
    public int getMonthQuantityForAboveAverage(int[] arr) {
        int monthQuantity = 0;
        if (arr.length == 0) {
            System.out.println("[getMonthQuantityForAboveAverage]: Ошибка: массив пуст!");
            return 0;
        }

        int averageSum = getAverageSum(arr);
        if (averageSum <= 0) {
            System.out.println("[getMonthQuantityForAboveAverage]: Ошибка: Средняя сумма = 0! ");
            return 0;
        }

        for (int val : arr) {
            if (val > averageSum) {
                monthQuantity++;
            }
        }

        return monthQuantity;
    }
}
