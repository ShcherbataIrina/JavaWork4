package ua.ithillel.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayValueCalculatorTest {
    @Test
    void test1() throws ArrayDataException {
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(110, array.doCalc(myArray));
    }

    @Test
    void test2() throws ArrayDataException {
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"0", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(104, array.doCalc(myArray));
    }

    @Test
    void test3() throws ArrayDataException {
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "3", "1", "9"}, {"5", "-28", "1", "7"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(70, array.doCalc(myArray));
    }

    @Test
    void test4() throws ArrayDataException {
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "2", "1", "10"}, {"-17", "8", "11", "12"}};
        assertEquals(76, array.doCalc(myArray));
    }

    @Test
    void test5() throws ArrayDataException {
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "d", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(110, array.doCalc(myArray));
    }

    @Test
    void test6() throws ArrayDataException {
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "z"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(110, array.doCalc(myArray));
    }

}