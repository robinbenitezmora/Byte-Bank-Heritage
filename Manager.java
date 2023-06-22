public class Manager implements Authenticable {
 private String keyword;

 public void setKeyword(String keyword) {
  this.keyword = keyword;
 }

 public boolean startSession(String keyword) {
  return keyword == "Alura";
 }

 public double getBonus() {
  return this.getSalary() * 0.05;
 }

 private double getSalary() {
  return 0;
 }

 @Override
 public void setPassword(String password) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'setPassword'");
 }

 @Override
 public boolean authenticate(String password) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'authenticate'");
 }
}
