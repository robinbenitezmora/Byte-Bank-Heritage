package test;

import model.InternalSystem;

public class TestInternalSystem {
 public static void main(String[] args) {
  InternalSystem internalSystem = new InternalSystem();
  Manager manager = new Manager();
  manager.setPassword("2222");
  internalSystem.authenticate(manager);
 }
}
