public class Administrator extends Employee {
 private int numberOfSubordinates;

 public Administrator() {

 }

 public int getNumberOfSubordinates() {
  return numberOfSubordinates;
 }

 public void setNumberOfSubordinates(int numberOfSubordinates) {
  this.numberOfSubordinates = numberOfSubordinates;
 }

 @Override
 public double getBonus() {
  return this.getSalary() * 0.2;
 }
}
