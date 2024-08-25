package ru.netology.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HolidayServiceTest {

        @Test
        public void test1() {
            HolidayService service = new HolidayService();
            int actual = service.calculate(10_000, 3_000, 20_000);
            int expected = 3;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void test2() {
            HolidayService service = new HolidayService();
            int actual = service.calculate(100_000, 60_000, 150_000);
            int expected = 2;
            Assertions.assertEquals(expected, actual);
        }

    }
