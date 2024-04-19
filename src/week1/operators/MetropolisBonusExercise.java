package week1.operators;

import java.util.Scanner;

public class MetropolisBonusExercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Name of the city: ");
        String cityName = scan.nextLine();

        System.out.print("Is " + cityName + " a capital ('true' or 'false')? ");
        boolean isCapital = scan.nextBoolean();

        System.out.print("What is the population of " + cityName + "? ");
        int population = scan.nextInt();

        System.out.print("Tax income per inhabitant: ");
        double taxPerPerson = scan.nextDouble();

        // Check if the city is a metropolis
        if ((isCapital && population > 100_000) || (population > 200_000 && (population * taxPerPerson) >= 1_000_000_000)) {
            System.out.println(cityName + " is a metropolis");
        } else {
            System.out.println(cityName + " is not a metropolis");
        }
    }
}
