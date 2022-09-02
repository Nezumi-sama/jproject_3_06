package ru.netology.jproject_3_06.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

/*
-----2.Csv-файл-----

   @CsvSource({
            "3, 200, 300",
            "0, 10000, 13000",
            "0, 1, 50",
            "6, 8800, 10000",
            "8, 0, 300",
            "1, 0, 100",
            "1, 9800, 10000",
            "90, 100, 9801",
            "90, 99, 9802",
            "88, 101, 9800"
    })*/

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void testInRange(int expected, int start, int end) {
        SQRService count = new SQRService();

        int actual = count.countOfSquares(start, end);
        Assertions.assertEquals(expected, actual);
    }


/*
-----1.Обычные тесты-----

    @Test
    public void testInRange() {
        SQRService count = new SQRService();

        int expected = 3;
        int actual = count.countOfSquares(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreRange() {
        SQRService count = new SQRService();

        int expected = 0;
        int actual = count.countOfSquares(10_000, 13_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessRange() {
        SQRService count = new SQRService();

        int expected = 0;
        int actual = count.countOfSquares(1, 50);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreRangeAndInRange() {
        SQRService count = new SQRService();

        int expected = 6;
        int actual = count.countOfSquares(8_800, 10_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessRangeAndInRange() {
        SQRService count = new SQRService();

        int expected = 8;
        int actual = count.countOfSquares(0, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneAtStart() {
        SQRService count = new SQRService();

        int expected = 1;
        int actual = count.countOfSquares(0, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneAtEnd() {
        SQRService count = new SQRService();

        int expected = 1;
        int actual = count.countOfSquares(9800, 10_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValuese() {
        SQRService count = new SQRService();

        int expected = 90;
        int actual = count.countOfSquares(100, 9801);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreBoundaryValuese() {
        SQRService count = new SQRService();

        int expected = 90;
        int actual = count.countOfSquares(99, 9802);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessBoundaryValuese() {
        SQRService count = new SQRService();

        int expected = 88;
        int actual = count.countOfSquares(101, 9800);
        Assertions.assertEquals(expected, actual);
    }

 */
}