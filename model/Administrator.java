package model;

public class Administrator extends Employee implements Authenticable {
 public Administrator() {
  new UsefulAuthentication();
 }

 // @Override
 // public void setPassword(int password) {
 // this.authenticator.setPassword(password);
 // }

 // @Override
 // public boolean authenticate(int password) {
 // return this.authenticator.authenticate(password);
 // }

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

 @Override
 public double getBonus() {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'getBonus'");
 }
}