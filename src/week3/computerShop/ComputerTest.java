package week3.computerShop;

public class ComputerTest {
  public static void main(String[] args) {

    Computer computer = new Computer("HP", 3201, 8,
            2000, (byte) 4, 15.6f, "laptop", true, 650, 700);
    System.out.println(computer.toString());
    computer.setRamGB(8 * 2);
    System.out.println(computer.toString());
  }
}
