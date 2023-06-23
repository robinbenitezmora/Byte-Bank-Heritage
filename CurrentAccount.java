public class CurrentAccount implements Tributation {

 @Override
 public double getTributationValue() {
  return super.getBalance() * 0.01;
 }
}
