package week3.persons;

public class Student extends Person {
  private String joke;

  // Constructor
  public Student(String joke) {
    this.joke = joke;
  }

  public void setJoke(String joke) {
    this.joke = joke;
  }

  public void tellJoke() {
    System.out.println(this.joke);
  }

  @Override
  public void introduce() {
    super.introduce(); // call the one in the Person Class
    this.tellJoke(); // print the corresponding joke
  }

}
