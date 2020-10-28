package com.rakovets.course.javabasics.practice.generics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathTest {
    @Test
    void getMaxOfParametersTest() {
        Math<Integer> a = new Math();
        Math<Double> b = new Math();

        assertEquals(58, a.getMaxOfParameters(58, 9, 22));
        assertEquals(22, a.getMaxOfParameters(20, 20, 22));
        assertEquals(9, a.getMaxOfParameters(9, 3, -7));

        assertEquals(32.0, b.getMaxOfParameters(24.1, 32.0, 24.2));
        assertEquals(111.222, b.getMaxOfParameters(111.222, 8.0, 29.1));
    }

    @Test
    void getMinOfParametersTest() {
        Math<Integer> a = new Math();
        Math<Double> b = new Math();

        assertEquals(6, a.getMinOfParameters(58, 9, 22, 6, 85));
        assertEquals(8, a.getMinOfParameters(20, 20, 22, 8, 8));
        assertEquals(-7, a.getMinOfParameters(9, 3, -7, 0, 7));

        assertEquals(9.87, b.getMinOfParameters(24.1, 32.0, 24.2, 9.87, 85.9));
        assertEquals(0.0, b.getMinOfParameters(111.222, 8.0, 29.1, 0.0, 0.8));
    }

    @Test
    void getAverageFromArrayTest() {
        Integer[] a = {556, 43, 34, 363, 1};
        Double[] b = {3.4, 141.4, 2.3, 333.2, 3.2, 0.0};
        Math<Integer> testA = new Math();
        Math<Double> testB = new Math();

        assertEquals(199.40, testA.getAverageFromArray(a));
        assertEquals(80.58, testB.getAverageFromArray(b));
    }

    @Test
    void getMaxFromArrayTest() {
        Integer[] a = {556, 43, 34, 363, 1};
        Double[] b = {3.4, 141.4, 2.3, 333.2, 3.2, 0.0};
        Math<Integer> testA = new Math();
        Math<Double> testB = new Math();

        assertEquals(556, testA.getMaxFromArray(a));
        assertEquals(333.2, testB.getMaxFromArray(b));
    }

    @Test
    void getMinFromArrayTest() {
        Integer[] a = {556, 43, 34, 363, 1};
        Double[] b = {3.4, 141.4, 2.3, 333.2, 3.2, 0.0};
        Math<Integer> testA = new Math();
        Math<Double> testB = new Math();

        assertEquals(1, testA.getMinFromArray(a));
        assertEquals(0.0, testB.getMinFromArray(b));
    }

    @Test
    void getSortArrayTest() {
        Integer[] a = {556, 43, 34, 363, 1};
        Double[] b = {3.4, 141.4, 2.3, 333.2, 3.2, 0.0};
        Math<Integer> testA = new Math();
        Math<Double> testB = new Math();

        assertArrayEquals(new Integer[]{1, 34, 43, 363, 556}, testA.getSortArray(a));
        assertArrayEquals(new Double[]{0.0 ,2.3, 3.2, 3.4, 141.4, 333.2}, testB.getSortArray(b));
    }

    @Test
    void getBinarySearchTest() {
        Integer[] a = {556, 43, 34, 363, 1};
        Double[] b = {3.4, 141.4, 2.3, 333.2, 3.2, 0.0};
        Math<Integer> testA = new Math();
        Math<Double> testB = new Math();

        assertEquals(-1, testB.getBinarySearch(b, 1.0));
        assertEquals(4, testB.getBinarySearch(b, 3.2));
        assertEquals(1, testA.getBinarySearch(a, 43));//?

    }


}