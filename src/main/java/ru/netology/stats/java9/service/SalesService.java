package ru.netology.stats.java9.service;

public class SalesService {
    public int minSales(int[] sales) {
        int minSale = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < sales[minSale]) {
                minSale = month;
            }
        }
        return minSale + 1;
    }

    public int maxSales(long[] sales) {
        int maxSales = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxSales]) {
                maxSales = month;
            }
        }
        return maxSales + 1;
    }

    public long amountSales(long[] sales) {
        long amount = 0;
        for (int month = 0; month < sales.length; month++) {
            amount += sales[month];
        }
        return amount;
    }

    public int amountAverage(long[] sales) {
      //  int amountAverage = 0;
      //  for (int month = 0; month < sales.length; month++) {
      //      amountAverage +=  sales[month];
     //   }
      //  {
      //      amountAverage = amountAverage / 12;
       // }
   return (int) amountSales(sales) / sales.length;
         // return amountAverage;
    }

    public int minAmountAverageMonth (long[] sales) {
        int minAmountAverageMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > amountAverage(sales)) {
                minAmountAverageMonth ++;
            }
        } return minAmountAverageMonth;
    }

    public int maxAmountAverageMonth (long[] sales) {
        int maxAmountAverageMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < amountAverage(sales)) {
                maxAmountAverageMonth ++;
            }
        } return maxAmountAverageMonth;
    }
}


















