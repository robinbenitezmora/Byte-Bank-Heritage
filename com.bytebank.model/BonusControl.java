package model;

public class BonusControl {
 private double sum;

 public double register(Employee employee) {
  return this.sum += employee.getBonus();
 }

 public double getSum() {
  return this.sum;
 }

}
