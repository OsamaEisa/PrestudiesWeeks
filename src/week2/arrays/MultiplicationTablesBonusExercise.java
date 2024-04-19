package week2.arrays;

public class MultiplicationTablesBonusExercise {
  public static void main(String[] args) {

    int[][] multiTable = new int[10][10];

    System.out.println(multiTable);

    for (int i = 1; i <= 10 ; i++) { // i=1, loop 10 times with j then changes i to 2
      for (int j = 1; j<= 10; j++) { // j=1, j=2 ... j=10 then i changes to = 2
        multiTable[i-1][j-1] = i * j; // m[0][0] : 1 = i*j = 1*1, then 1*2, 1*3 ...
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }
  }
}