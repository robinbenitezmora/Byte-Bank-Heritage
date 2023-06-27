package test;

import model.CurrentAccount;
import model.SaveAccount;

public class TestAccount {
 public static void main(String[] args) {
  CurrentAccount ca = new CurrentAccount(123, 456);
  SaveAccount sa = new SaveAccount(789, 101112);
  ca.deposit(2000);
  ca.transfer(1000, sa);
  sa.withdraw(500);
  System.out.println(ca.getBalance());
  System.out.println(sa.getBalance());
  System.out.println(ca);
  System.out.println(sa);
  System.out.println(sa.getAgency());
 }
}
