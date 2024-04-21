package week3.persons;

public class StudentTest {

  public static void main(String[] args) {
    Student max = new Student("I like numbers in Java - aren't they interesting?!");
    max.setName("Max"); max.setAge(17); max.setAddress("Wall street 22");
    max.setJoke("This is a joke from Max xD");
    // to call the introduce method inside Student which calls the one in Person and also print the joke
    max.introduce();
  }

}
