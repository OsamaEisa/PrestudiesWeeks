package week3.computerShop;

import java.util.ArrayList;

public class ComputerTest {
  public static void main(String[] args) {

    Computer computer = new Computer("HP", 3201, 8,
            2000, (byte) 4, 15.6f, "laptop", true, 650, 700);
    System.out.println(computer.toString());
    computer.setRamGB(8 * 2); // doubling the RAM
    System.out.println(computer.toString()); // printing the Computer again

    // creating 5 Computers to test the calculate profit method

    Computer computer1 = new Computer("Dell", 2500, 16,
            1000, (byte) 6, 17.3f, "laptop", true, 650, 750);
Computer computer2 = new Computer("Lenovo", 1800, 4,
            500, (byte) 2, 14.0f, "laptop", false, 600, 700);
Computer computer3 = new Computer("Apple", 3500, 32,
            2000, (byte) 4, 21.5f, "desktop", true, 800, 900);
Computer computer4 = new Computer("Asus", 3200, 8,
            1000, (byte) 6, 27.0f, "desktop", false, 700, 750);
Computer computer5 = new Computer("Acer", 3000, 16,
            1500, (byte) 4, 23.8f, "all-in-one", true, 750, 800);

// An Array list to take all 5 computers
    ArrayList<Computer> computers = new ArrayList<>();
    computers.add(computer1);
    computers.add(computer2);
    computers.add(computer3);
    computers.add(computer4);
    computers.add(computer5);

    // passing the computers list created to the constructor of the computerShop
    ComputerShop computerShop = new ComputerShop(computers);
    System.out.printf("The potential profit if all computers are sold would be: %.2f EUR", computerShop.calculateProfit());

  }
}
