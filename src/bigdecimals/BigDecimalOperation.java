package bigdecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal Operations
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal and
 * returns a double of the BigDecimal
 * number rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
 *
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal,
 * reverses the sign (if the parameter is positive, the result should be negative
 * and vice versa), rounds the number to the nearest tenth and returns the result.
 * For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
 */
public class BigDecimalOperation {
    public static void main(String[] args) {
        BigDecimal numberOne = new BigDecimal("4.2545");
        // test the method getDouble
        System.out.println(getDouble(numberOne)); // expect 4.25

        BigDecimal numberTwo = new BigDecimal("1.2345");
        BigDecimal numberTree = new BigDecimal("-45.67");

        // here we test the reverse and round method
        System.out.println(reverseAndRound(numberTwo)); // expect -1.2
        System.out.println(reverseAndRound(numberTree)); // expect 45.7
    }

    /**
     * method that accepts a BigDecimal and returns a double of the BigDecimal
     * number rounded to the nearest hundredth
     * @param number a BigDecimal number that we want convert as primitive double
     * @return a double after converting from a BigDecimal number rounded to the nearest hundredth.
     * For example, 4.2545 should return 4.25.
     */
    private static double getDouble(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * method that accepts a BigDecimal,
     * reverses the sign (if the parameter is positive, the result should be negative
     * and vice versa), rounds the number to the nearest tenth and returns the result.
     * @param number the number to proceed reversal
     * @return the result of the operation with a BigDecimal
     */
    private static BigDecimal reverseAndRound(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }
}