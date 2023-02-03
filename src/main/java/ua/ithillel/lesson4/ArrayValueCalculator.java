package ua.ithillel.lesson4;

public class ArrayValueCalculator {
    //private final String[][] myArray= {{"5","4","1","9"},{"5","4","1","9"},{"5","4","1","9"},{"5","4","1","9"}};
    public static final int SIZE_ARRAY = 4;
    String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};

    public int doCalc(String[][] myArray) throws ArraySizeException, ArrayDataException {

        if (myArray.length != SIZE_ARRAY) {
            throw new ArraySizeException("Array must have 4x4 !");
        }

        int sum = 0;
        for (int i = 0; i < SIZE_ARRAY; i++) {
            for (int j = 0; j < SIZE_ARRAY; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);

                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                    throw new ArrayDataException(ex);
                }

            }
        }
        System.out.println("OK!");
        return sum;
    }

}
