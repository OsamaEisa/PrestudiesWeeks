package DatatypesAndVariables;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FormattingTextBonusExercise {
    public static void main(String[] args) {
        // formatting inout words containing _ and #

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] textIntoArray = input.split(" ");

        String newArray = Arrays.stream(textIntoArray).map(word -> {
            if (word.startsWith("_") && word.endsWith("_")) {
                return word.replace("_", "").toUpperCase();
            } else if (word.startsWith("#") && word.endsWith("#")) {
                return word.replace("#", "").toLowerCase();
            } else return word;
        }).collect(Collectors.joining(" "));

        System.out.println(newArray);
        /* this solution has a problem with words followed by commas or dots, so we use regular expressions
            for an input like :
            "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it."
            The output would be:
            "Everybody _said_, it can't be done. Then came one who did not know that and just made it."

         */

    }
}
