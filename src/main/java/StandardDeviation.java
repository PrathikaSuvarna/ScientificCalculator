/**
 * class for Standard deviation function.
 */
public class StandardDeviation {
    /**
     * Function to calculate standard deviation.
     * @param numArray array or input numbers
     * @return standard deviation result
     */
        public static double calculateSD(double[] numArray) {
            double sum = 0.0;
            double standardDeviation = 0.0;
            int length = numArray.length;

            for (double num : numArray) {
                sum += num;
            }

            double mean = sum / length;

            for (double num: numArray) {
                standardDeviation += power(num - mean, 2);
            }
            double res = squareRoot(standardDeviation / length);
            String r = String.valueOf(res);
            if (r == "NaN") {
                res = 0;
            }
            return res;
        }

    /**
     * Function to calculate power.
     * @param first the base
     * @param second the exponent
     * @return result of the x^y
     */
    public static double power(double first, double second) {
            double power = 1.0;
        int exponent = (int) second;
        double base = first;
        while (exponent != 0) {
            if ((exponent & 1) != 0) {
                power *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return power;
    }

    /**
     * Function to find squareRoot.
     * @param input a double value
     * @return square root of the number
     */
    public static double squareRoot(double input) {
        double error = 0.0000000001;
        double errorPrecision = 1;
        double duplicate = input;

        while ((errorPrecision) > error) {
            input = (input + duplicate / input) / 2;
            errorPrecision = input - duplicate / input;
        }

            return input;

    }
}
