package week3.persons;

public class StudentTest {

  public static void main(String[] args) {
    Student max = new Student("I like numbers in Java - aren't they interesting?!");
    max.setName("Max"); max.setAge(17); max.setAddress("Wall street 22");
    // You can still use the methods of the superclasses max.introduce();
    max.introduce();
    // This method is only available in Student and not Person max.tellJoke();
    max.setJoke("This is a joke from Max xD");
    max.tellJoke();
  }

}
