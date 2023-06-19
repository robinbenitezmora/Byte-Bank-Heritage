public class CurrentAccount extends Account {
 public CurrentAccount(int agency, int number) {
  super(agency, number);
 }

 @Override
 public boolean withdraw(double value) {
  double valueToWithdraw = value + 0.2;
  return super.withdraw(valueToWithdraw);
 }

}
