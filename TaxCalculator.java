public class TaxCalculator {
 private double totalTributation;

 public void register(Tributation tributation) {
  double tributationValue = tributation.getTributationValue();
  this.totalTributation += tributationValue;
 }

 public double getTotalTributation() {
  return totalTributation;
 }
}
