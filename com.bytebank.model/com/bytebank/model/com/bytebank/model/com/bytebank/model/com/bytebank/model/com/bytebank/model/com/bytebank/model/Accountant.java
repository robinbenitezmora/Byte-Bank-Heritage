package com.bytebank.model;

import model.Employee;

public class Accountant extends Employee {
 public double getBonus() {
  System.out.println("Execute from Accountant");
  return super.getSalary() + 1000;
 }
}
