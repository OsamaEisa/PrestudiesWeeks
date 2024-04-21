package week3.persons;

public class Person {

  private String name;
  private int age;
  private String address;

  // Constructor to set default values to avoid strange outputs
  public Person() {
    this.name = "(No name set)";
    this.age = 18;
    this.address = "(No address set)";
  }

  public void introduce() {
      System.out.printf("Hello! I'm %s, %d years old, and live in '%s'.\n", name, age, address);

  }

//  public void introduce() {
//    // we check if any of these variables not being set
//    if (name == null || age == 0 || address == null ) {
//      System.out.println("You need to set all values to show this person...");
//      System.out.println("--------------------------");
//      System.out.printf("The name: %s\nThe age: %d\nThe address is: '%s'", name, age, address);
//    } else {
//      System.out.printf("Hello! I'm %s, %d years old, and live in '%s'.", name, age, address);
//    }
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
