public class Accountant extends Employee {
 public double getBonus() {
  return super.getBonus() + super.getSalary();
 }
}
