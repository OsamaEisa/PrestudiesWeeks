package week3.computerShop;

public class Computer {
  // Properties
  private String manufacturerName;
  private int processorSpeedMHz;
  private int ramGB;
  private int hardDriveGB;
  private byte numOfUSBPorts; // or int
  private float screenSizeInch; // or double
  private String computerType;
  private boolean hasOs;

  // 1. Constructor with default values
  public Computer() {
    this.manufacturerName = "HP";
    this.processorSpeedMHz = 0;
    this.ramGB = 8;
    this.hardDriveGB = 256;
    this.numOfUSBPorts = 4;
    this.screenSizeInch = 15.5f;
    this.computerType = "laptop";
    this.hasOs = false;
  }

  // 2. Constructor with minimum values
  public Computer(String manufacturerName, float screenSizeInch, boolean hasOs) {
    this.manufacturerName = manufacturerName;
    this.screenSizeInch = screenSizeInch;
    this.hasOs = hasOs;
  }

  // 3. Constructor with all required values
  public Computer(String manufacturerName, int processorSpeedMHz, int ramGB, int hardDriveGB,
                  byte numOfUSBPorts, float screenSizeInch, String computerType, boolean hasOs) {

    // calling the constructor Nr 2 using "this()" and passing required paramGBs
    this(manufacturerName, screenSizeInch, hasOs);

    // defining only the remaining properties
    this.processorSpeedMHz = processorSpeedMHz;
    this.ramGB = ramGB;
    this.hardDriveGB = hardDriveGB;
    this.numOfUSBPorts = numOfUSBPorts;
    this.computerType = computerType;
  }

  // Getters and Setters

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public int getProcessorSpeedMHz() {
    return processorSpeedMHz;
  }

  public void setProcessorSpeedMHz(int processorSpeedMHz) {
    this.processorSpeedMHz = processorSpeedMHz;
  }

  public int getRamGB() {
    return ramGB;
  }

  public void setRamGB(int ramGB) {
    this.ramGB = ramGB;
  }

  public int getHardDriveGB() {
    return hardDriveGB;
  }

  public void setHardDriveGB(int hardDriveGB) {
    this.hardDriveGB = hardDriveGB;
  }

  public byte getNumOfUSBPorts() {
    return numOfUSBPorts;
  }

  public void setNumOfUSBPorts(byte numOfUSBPorts) {
    this.numOfUSBPorts = numOfUSBPorts;
  }

  public float getScreenSizeInch() {
    return screenSizeInch;
  }

  public void setScreenSizeInch(float screenSizeInch) {
    this.screenSizeInch = screenSizeInch;
  }

  public String getComputerType() {
    return computerType;
  }

  public void setComputerType(String computerType) {
    this.computerType = computerType;
  }

  public boolean hasOs() {
    return hasOs;
  }

  public void hasOs(boolean hasOs) {
    this.hasOs = hasOs;
  }

  // to print Computer details

  @Override
  public String toString() {
    return "Computer {\n" +
            "\tManufacturer name = '" + manufacturerName + '\'' +
            ",\n\tProcessor speed in MHz = " + processorSpeedMHz +
            ",\n\tRAM size in GB = " + ramGB +
            ",\n\tHard drive in GB = " + hardDriveGB +
            ",\n\tNumber of USB ports = " + numOfUSBPorts +
            ",\n\tScreen size in Inches = " + screenSizeInch +
            ",\n\tComputer type = '" + computerType + '\'' +
            ",\n\tPreinstalled operating system = " + (hasOs ? "Yes" : "No") + "\n" +
            " }";
  }
}
