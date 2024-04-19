package week1.operators;

import java.util.Scanner;

public class TimeUnits {
    public static void main(String[] args) {
        // convert seconds to larger units

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number of seconds: ");
        long seconds = scan.nextLong();

        int years = (int) (seconds / (365 * 24 * 60 * 60)); // 7 years (and the rest?)
        seconds %= 365 * 24 * 60 * 60; // the same as: seconds = seconds % 365 * 24 * 60 * 60;
        int days = (int) (seconds / (24 * 60 * 60)); // 275 days (and the rest?)
        seconds %= 24 * 60 * 60;
        int hours = (int) (seconds / (60 * 60)); // 15 hours (and the rest?)
        seconds %= 60 * 60;
        int minutes = (int) (seconds / 60); // 47 minutes (and the rest?)
        seconds %= 60;

        System.out.printf("Das ist ca. : %d years, %d days, %d hours, %d minutes and %d seconds", years, days, hours, minutes, seconds);
    }
}
