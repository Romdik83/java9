package ru.netology.stats.java9.service;

import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void minSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minSales = service.minSales(sales);
        System.out.println(minSales);
    }

    @Test
    public void maxSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long maxSales = service.maxSales(sales);
        System.out.println(maxSales);
    }

    @Test
    public void amountSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long amount = service.amountSales(sales);
        System.out.println(amount);
    }

    @Test
    public void amountAverage() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int amountAverage = service.amountAverage(sales);
        System.out.println(amountAverage);
    }
    @Test
    public void minAmountAverageMonth() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minAmountAverageMonth = service.minAmountAverageMonth(sales);
        System.out.println(minAmountAverageMonth);
    }
    @Test
    public void maxAmountAverageMonth() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxAmountAverageMonth = service.maxAmountAverageMonth(sales);
        System.out.println(maxAmountAverageMonth);
    }
}


