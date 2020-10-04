package ru.netology.stats;

public class StatsService<sum> {
    public long sumAll(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }

        return sum;
    }

    public long averageAmount(int[] numbers) {
        long sumAll = sumAll (numbers);
        long sum;

        sum = sumAll / numbers.length;

        return sum;
    }

    public long maxSales(int[] numbers) {
        int max = numbers[0];
        int maxIndex = 0;
        int monthNumber;

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                maxIndex = i;
                max = numbers[i];
            }
        }

        monthNumber = maxIndex + 1;

        return monthNumber;
    }

    public long minSales(int[] numbers) {
        int min = numbers[0];
        int minIndex = 0;
        int monthNumber;

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                minIndex = i;
                min = numbers[i];
            }

        }

        monthNumber = minIndex + 1;

        return monthNumber;
    }

    public int belowAverage(int[] numbers) {
        long averageAmount = averageAmount(numbers);
        int belowAverageMonthsNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (averageAmount > numbers[i]) {
                belowAverageMonthsNumber++;
            }
        }

        return belowAverageMonthsNumber;
    }

    public int aboveAverage(int[] numbers) {
        long averageAmount = averageAmount(numbers);
        int aboveAverageMonthsNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (averageAmount < numbers[i]) {
                aboveAverageMonthsNumber++;
            }
        }

        return aboveAverageMonthsNumber;
    }
}
