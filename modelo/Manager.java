public class Manager implements Authenticable {

 private UsefulAuthentication authenticator;

 public Manager() {
  this.authenticator = new UsefulAuthentication();
 }

 @Override
 public void setPassword(int password) {
  this.authenticator.setPassword(password);
 }

 @Override
 public boolean authenticate(int password) {
  return this.authenticator.authenticate(password);
 }
}
