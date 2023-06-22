public class TestInternalSystem {
 public static void main(String[] args) {
  InternalSystem internalSystem = new InternalSystem();
  Manager manager = new Manager();
  manager.setPassword("1234");
  internalSystem.authenticate(manager);
 }
}
