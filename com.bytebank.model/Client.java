package model;

public class Client implements Authenticable {

 public Client() {
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
}
