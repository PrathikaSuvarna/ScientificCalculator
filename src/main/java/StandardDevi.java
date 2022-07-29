import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * class for Standard deviation function
 */
public class StandardDevi {

/*
        public static void main(String[] args) {
            double[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            double SD = calculateSD(numArray);

            System.out.format("Standard Deviation = %.6f", SD);
        }*/

        public static double calculateSD(double numArray[])
        {
            double sum = 0.0, standardDeviation = 0.0;
            int length = numArray.length;

            for(double num : numArray) {
                sum += num;
            }

            double mean = sum/length;

            for(double num: numArray) {
                standardDeviation += Math.pow(num - mean, 2);
            }

            return squareRoot(standardDeviation/length);
        }

    public static double squareRoot(double input) {
        double error = 0.00001;
        double errorPrecision = 1;
        double duplicate = input;

        while ((errorPrecision) > error) {
            input = (input + duplicate / input) / 2;
            errorPrecision = input - duplicate / input;
        }
        return input;
    }
    /**
     * The main method.
     *
     * @param args the arguments
     */

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double a = sc.nextDouble();
        double res = squareRoot(a);
        System.out.println(res);
        sc.close();
    }

    public static String calculateSD(double parseDouble) {
        return null;
    }
}
