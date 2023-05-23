package ru.netology.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        int[] sales = {91, 29, 12, 40, 58};
        int expected = 230;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        StatService service = new StatService();
        int[] sales = {21, 91, 12, 40, 58};
        int expected = 91;

        int actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatService service = new StatService();
        int[] sales = {21, 91, 12, 40, 58};
        int expected = 44;

        int actual = service.calcAvg(sales);

        assertEquals(expected, actual);
    }
}