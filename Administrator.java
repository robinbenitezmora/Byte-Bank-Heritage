public class Administrator extends Employee {
 private String password;

 public void setPassword(String password) {
  this.password = password;
 }

 public boolean authenticate(String password) {
  return password == this.password;
 }

 @Override
 public double getBonus() {
  return this.getSalary() * 0.2;
 }
}
