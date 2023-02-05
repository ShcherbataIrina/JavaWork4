package ua.ithillel.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ArrayValueCalculatorTest {
    @Test
    void shouldThrowExceptionOnParsingIncorrectString1() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "d", "1", "10"}, {"17", "8", "11", "12"}};
        assertThrows(ArrayDataException.class, new Executable() {
            @Override
            public void execute() throws RuntimeException {
                calculator.doCalc(myArray);
            }
        });
    }

    @Test
    void shouldThrowExceptionOnParsingIncorrectString2() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "RIVER"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertThrows(ArrayDataException.class, new Executable() {
            @Override
            public void execute() throws RuntimeException {
                calculator.doCalc(myArray);
            }
        });
    }

    @Test
    void shouldThrowExceptionOnWrongSizeString1() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1"}, {"5", "8", "1", "2"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertThrows(ArraySizeException.class, new Executable() {
            @Override
            public void execute() throws RuntimeException {
                calculator.doCalc(myArray);
            }
        });
    }

    @Test
    void shouldThrowExceptionOnWrongSizeString2() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "2"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}, {"1", "1", "1", "1"}};
        assertThrows(ArraySizeException.class, new Executable() {
            @Override
            public void execute() throws RuntimeException {
                calculator.doCalc(myArray);
            }
        });
    }

    @Test
    void test1() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(110, calculator.doCalc(myArray));
    }

    @Test
    void test2() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"0", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(104, calculator.doCalc(myArray));
    }

    @Test
    void test3() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "3", "1", "9"}, {"5", "-28", "1", "7"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};
        assertEquals(70, calculator.doCalc(myArray));
    }

    @Test
    void test4() {
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "2", "1", "10"}, {"-17", "8", "11", "12"}};
        assertEquals(76, calculator.doCalc(myArray));
    }

}