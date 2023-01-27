package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testFindThreeNumberOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindOneNumberOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calculate(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindZeroNumberOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calculate(0, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxNumberOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
}


