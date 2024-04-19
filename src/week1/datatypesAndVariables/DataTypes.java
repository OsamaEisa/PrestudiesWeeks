package week1.datatypesAndVariables;

public class DataTypes {
    public static void main(String[] args) {

        // declaring some variables with the smallest possible data type

        String initials = "OS";
        int populationInGermany = 83_261_475;
        long populationOnEarth = 8_103_291_654L;
        boolean isDaytime = false;
        byte goalStrikeMarioGomez = 4;
        int lengthOfJavaProgramInWeeks = 20500;
        float piValue = (float) Math.PI;

        System.out.printf("My initials are : %s\n", initials);
        System.out.printf("Population in Germany is around : %d\n", populationInGermany);
        System.out.printf("Population on earth is around : %d\n", populationOnEarth);
        System.out.printf("Is currently daytime? %b\n", isDaytime);
        System.out.printf("The number of goals of Mario was : %d\n", goalStrikeMarioGomez);
        System.out.printf("The length of Java program in weeks could be : %d\n", lengthOfJavaProgramInWeeks);
        System.out.printf("The value of PI is around : %.2f\n", piValue);
    }
}
