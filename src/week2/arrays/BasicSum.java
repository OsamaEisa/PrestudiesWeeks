package week2.arrays;

import java.util.Arrays;

public class BasicSum {
  public static void main(String[] args) {

    int[] numbers = new int[] {12, -22, 300, 43, 0};
    int sum = 0;
    for( int number : numbers) {
      sum += number;
    }
    System.out.println(sum);

    // the same as
    System.out.println(Arrays.stream(numbers).sum());

  }
}
