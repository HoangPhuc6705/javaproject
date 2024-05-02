public class student {
  String name;
  int id;
  String major;

  public student(String name, int id, String major) {
    this.name = name;
    this.id = id;
    this.major = major;
  }

  public void show_student() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Major: " + major);
  }
}
