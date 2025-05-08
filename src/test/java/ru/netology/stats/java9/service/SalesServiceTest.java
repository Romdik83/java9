package ru.netology.stats.java9.service;

import org.junit.jupiter.api.Test;

public class SalesServiceTest {

    @Test
    public void getMinSales() {
        SalesService service = new SalesService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int minSales = service.getMinSales(sales);
        System.out.println(minSales);
    }

    @Test
    public void getMaxSales() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long maxSales = service.getMaxSales(sales);
        System.out.println(maxSales);
    }

    @Test
    public void getAmount() {
        SalesService service = new SalesService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int amount = service.getAmount(sales);
        System.out.println(amount);
    }
    @Test
    public void getAmountAverage() {
        SalesService service = new SalesService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int amountAverage = service.getAmountAverage(sales);
        System.out.println(amountAverage);
    }

}


