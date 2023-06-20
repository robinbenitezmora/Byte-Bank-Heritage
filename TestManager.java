public class TestManager {
 public static void main(String[] args) {
  Manager manager = new Manager();
  manager.setName("John");
  manager.setDocument("123.456.789-00");
  manager.setSalary(5000.0);
  manager.setKeyword("Alura");
  System.out.println(manager.getName());
  System.out.println(manager.getDocument());
  System.out.println(manager.getSalary());
  System.out.println(manager.getBonus());
  System.out.println(manager.startSession("Alura"));
 }

}
