package week2.strings;

public class ComparingStrings {
  public static void main(String[] args) {

    String str1 = "this is the first string";
    String str2 = "this is the first string";

    System.out.println("Using equals : " + str1.equals(str2));
    System.out.println("Using operator== : " + str1 == str2);

    System.out.println("-----------------------------");

    String str3 = new String("this is the first string");
    String str4 = new String("this is the first string");

    System.out.println("Using equals : " + str3.equals(str4));
    System.out.println("Using operator== : " + str3 == str4);

  }
}
