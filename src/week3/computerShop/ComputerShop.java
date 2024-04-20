package week3.computerShop;

import java.util.ArrayList;

public class ComputerShop {
  private ArrayList<Computer> computers;

  public ComputerShop( ArrayList<Computer> computers ) {
    this.computers = computers;
  }

  public float calculateProfit() {
    float sumOfAllProfits = 0;
    for(Computer computer : computers) {
      sumOfAllProfits += computer.getProfitPerComputer();
    }
    return sumOfAllProfits;
  }

}
