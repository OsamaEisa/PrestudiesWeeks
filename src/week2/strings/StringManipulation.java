package week2.strings;

public class StringManipulation {
  public static void main(String[] args) {

    String testText = "Everybody said, it can't be done. Then came one who did not know that and just made it.";
    // Retrieve the two uppercase letters from the text
    System.out.println(testText.charAt(0) + testText.charAt(34));

    // Compare the text to my name
    System.out.println(testText.compareTo("Osama"));

    // Concatenate the string with my name
    System.out.println(testText + "Osama");

    // Check if the string contains the words "made" and "Java"
    System.out.println(testText.contains("made") + " ** " + testText.contains("Java"));

    // Compare the equality of two string
    String testCopy = new String(testText);
    System.out.println(testText.equals(testCopy));

    // Find the position of the first "d"
    System.out.println(testText.indexOf('d'));

    // Check if the string is empty
    System.out.println(testText.isEmpty());

    // Check if the string is null
    System.out.println(testText == null);

    // Determine the length of the text
    System.out.println(testText.length());

    // Extract the words "said" and "made"
      System.out.println("The word " + "said" + ": " + testText.substring(testText.indexOf("said"), testText.indexOf("said") + "said".length()));
    System.out.println("The word " + "made" + ": " + testText.substring(testText.indexOf("made"), testText.indexOf("made") + "made".length()));
  }
}
