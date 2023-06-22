public class UsefulAuthentication {
 private String password;

 public boolean authenticate(String password) {
  return this.password.equals(password);
 }

 public void setPassword(String password) {
  this.password = password;
 }

}
