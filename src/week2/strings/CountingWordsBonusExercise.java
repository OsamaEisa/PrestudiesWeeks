package week2.strings;

public class CountingWordsBonusExercise {
  public static void main(String[] args) {

    String text = "Far out in the unexplored wastelands of something totally out of fashion extension " +
            "of the galaxy's western spiral arm, a little yellow sun glows unnoticed. " +
            "Orbiting them, also about ninety-one million miles away, " +
            "is an absolutely insignificant little blue-green planet whose ape bioforms " +
            "are so amazingly primitive that they still think digital clocks are an incredibly wonderful invention.";
    int length = text.split("\\s").length;
    System.out.printf("Number of words : %d", length);
  }
}
