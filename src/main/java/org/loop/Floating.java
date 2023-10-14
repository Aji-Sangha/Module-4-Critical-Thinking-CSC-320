package org.loop;
import java.util.Scanner;

public class Floating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        int count = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;
        double interest = 0.0;

        while (count < 5) {
            System.out.print("Please Enter a Floating Point Value: ");
            double value = input.nextDouble();
            total += value;

            if (value > maximum) {
                maximum = value;
            }

            if (value < minimum) {
                minimum = value;
            }

            count++;
        }

        double average = total / 5;
        interest = total * 0.20;

        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", maximum);
        System.out.printf("Minimum: %.2f%n", minimum);
        System.out.printf("Interest on total at 20%%: %.2f%n", interest);

        input.close();
    }
}
