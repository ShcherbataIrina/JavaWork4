package ua.ithillel.lesson4;

public class ArrayValueCalculator {
    public static final int ARRAY_SIZE = 4;

    public int doCalc(String[][] myArray){

        if (myArray.length != ARRAY_SIZE) {
            throw new ArraySizeException("Array must have 4x4 !");
        }

        int sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
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
