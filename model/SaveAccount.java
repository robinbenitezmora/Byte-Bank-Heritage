package model;

public class SaveAccount extends Account {
 public SaveAccount(int agency, int number) {
  super(agency, number);
 }

 @Override
 public void deposit(double value) {
  this.balance += value;
 }
}
