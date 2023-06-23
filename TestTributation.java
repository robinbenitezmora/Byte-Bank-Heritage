public class TestTributation {

 public static void main(String[] args) {
  CurrentAccount ca = new CurrentAccount();
  ca.deposit(1000);
  System.out.println(ca.getBalance());

  LifeSecure ls = new LifeSecure();
  ls.deposit(1000);
  System.out.println(ls.getBalance());

  TaxCalculator tc = new TaxCalculator();
  tc.register(ca);
  tc.register(ls);

  System.out.println(tc.getTotalTributation());
 }
}
