package ru.netology.stats.java9.service;
public class SalesService {
    public int getMinSales(int[] sales) {
        int minSale = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < sales[minSale]) {
                minSale = month;
            }
        }
        return minSale + 1;
    }
    public int getMaxSales(long[] sales) {
        int maxSales = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxSales]) {
                maxSales = month;
            }
        } return maxSales + 1;
    }
    public int getAmount(int[] sales) {
        int amount = 0;
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (int month = 0; month < arr.length; month++) {
            amount = amount + arr[month];}

        return amount;
    }
    public int getAmountAverage(int[] sales) {
        int amountAverage = 0;
        int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (int month = 0; month < arr.length; month++) {
            amountAverage = amountAverage + arr[month];}
        {amountAverage = amountAverage / 12;}

        return amountAverage;
    }



}














