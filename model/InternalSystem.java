package model;

import test.Manager;

public class InternalSystem {
 private String password = "2222";

 public void authenticate(Manager manager) {
  boolean authenticated = manager.authenticate(this.password);
  if (authenticated) {
   System.out.println("Welcome to the system!");
  } else {
   System.out.println("Access denied!");
  }
 }

}
