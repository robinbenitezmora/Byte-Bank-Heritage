public class TestAccount {
 public static void main(String[] args) {
  CurrentAccount ca = new CurrentAccount(123, 456);
  SaveAccount sa = new SaveAccount(789, 101112);
  ca.deposit(2000);
  ca.transfer(1000, sa);
  System.out.println("Current Account Balance: " + ca.getBalance());
  System.out.println("Save Account Balance: " + sa.getBalance());
 }
}
