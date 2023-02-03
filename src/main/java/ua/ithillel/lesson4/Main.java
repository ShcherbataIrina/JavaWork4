package ua.ithillel.lesson4;

public class Main {
    public static void main(String[] args){
        ArrayValueCalculator array = new ArrayValueCalculator();
        String[][] myArray = {{"5", "7", "1", "9"}, {"5", "8", "1", "7"}, {"6", "2", "1", "10"}, {"17", "8", "11", "12"}};

        int result = array.doCalc(myArray);
        System.out.println(result);

    }
}