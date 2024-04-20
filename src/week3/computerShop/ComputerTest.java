package week3.computerShop;

public class ComputerTest {
  public static void main(String[] args) {

    Computer computer = new Computer("HP", 3201, 8,
            2000, (byte) 4, 15.6f, "laptop", true );
    System.out.println(computer.toString());
  }
}
