public class CurrentAccount extends Account {
 public CurrentAccount(int agency, int number) {
  super(agency, number);
 }

 @Override
 public void deposit(double value) {
  this.balance += value;
 }

}
