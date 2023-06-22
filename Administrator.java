public class Administrator extends Employee implements Authenticable {
 private String password;

 public void setPassword(String password) {
  this.password = password;
 }

 public boolean authenticate(String password) {
  if (this.password == password) {
   return true;
  }
  return false;

 }

 @Override
 public double getBonus() {
  return this.getSalary() * 0.2;
 }

 public double getSalary() {
  return 0;
 }
}
