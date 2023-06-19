public class TestEmployee {
 public static void main(String[] args) {
  Employee employee = new Employee();
  employee.setName("John");
  employee.setDocument("123.456.789-00");
  employee.setSalary(5000.0);
  System.out.println(employee.getName());
  System.out.println(employee.getDocument());
  System.out.println(employee.getSalary());
  System.out.println(employee.getBonus());
 }
}
