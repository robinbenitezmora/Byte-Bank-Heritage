import BonusControl;
import Manager;

package test;

public class TestReference {
 public static void main(String[] args) {
  Manager maria = new Manager();
  maria.setName("Maria");
  maria.setSalary(5000.0);

  VideoEditor joao = new VideoEditor();
  joao.setSalary(2500.0);

  Designer jose = new Designer();
  jose.setSalary(2000.0);

  BonusControl bonusControl = new BonusControl();
  bonusControl.register(maria);
  bonusControl.register(joao);
  bonusControl.register(jose);

  System.out.println("Current calculus: " + bonusControl.getSum());
 }
}
