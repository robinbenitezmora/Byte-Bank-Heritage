public class Manager extends Employee {
 private String keyword;

 public void setKeyword(String keyword) {
  this.keyword = keyword;
 }

 public boolean startSession(String keyword) {
  return keyword == "Alura";
 }

 public double getBonus() {
  return super.getSalary() + this.getSalary() * 0.05;
 }
}
