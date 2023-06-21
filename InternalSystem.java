public class InternalSystem {
 private String password = "2222";

 public boolean authenticate(Manager manager) {
  boolean authenticated = manager.startSession(this.password);
  if (authenticated) {
   System.out.println("Welcome to the system!");
   return true;
  } else {
   System.out.println("Access denied!");
   return false;
  }
 }
}
