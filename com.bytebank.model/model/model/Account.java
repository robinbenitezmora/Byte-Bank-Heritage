package com.bytebank.model;

public abstract class Account {
 protected double balance;
 private int agency;
 private int number;
 private Client owner;

 private static int total = 0;

 public Account(int agency, int number) {
  Account.total++;
  System.out.println("The total in your account is " + Account.total);
  this.agency = agency;
  this.number = number;
  this.balance = 100;
  System.out.println("I am creating a new account.");
  total++;
 }

 public abstract void deposit(double value);

 public boolean withdraw(double value) {
  if (this.balance >= value) {
   this.balance -= value;
   return true;
  }
  return false;
 }

 public boolean transfer(double value, Account account) {
  if (this.balance >= value) {
   this.withdraw(value);
   account.deposit(value);
   return true;
  }
  return false;
 }

 public double getBalance() {
  return this.balance;
 }

 public void setAgency(int agency) {
  if (agency <= 0) {
   System.out.println("It is not allowed negative values!");
   return;
  }
  this.agency = agency;
 }

 public int getAgency() {
  return this.agency;
 }

 public void setOwner(Client owner) {
  this.owner = owner;
 }

 public Client getOwner() {
  return this.owner;
 }

 public int getNumber() {
  return this.number;
 }

 public void setNumber(int number) {
  if (number <= 0) {
   System.out.println("The number cannot be negative!");
   return;
  }
  this.number = number;
 }

 public static int getTotal() {
  return Account.total;
 }
}
