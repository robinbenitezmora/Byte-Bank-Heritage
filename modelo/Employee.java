public abstract class Employee {
 private String name;
 private String document;
 private double salary;

 public Employee() {

 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getDocument() {
  return document;
 }

 public void setDocument(String document) {
  this.document = document;
 }

 public double getSalary() {
  return salary;
 }

 public void setSalary(double salary) {
  this.salary = salary;
 }

 public abstract double getBonus();
}
