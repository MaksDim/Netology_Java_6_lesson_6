package ru.netology.array;

public class StatService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            //sum = sum + sale;
            sum +=sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale > currentMax) {
                currentMax = sale;
            }
        }
        return currentMax;
    }
}
