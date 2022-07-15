import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class StandardDevi {


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
}
