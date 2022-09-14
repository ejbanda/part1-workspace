package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hiredate, double salary){
    this(name, hiredate);
    setSalary(salary);
  }

  @Override
  public void pay(){
    System.out.printf("%s is paid salary of %,.2f%n", getName(), salary);
  }

  @Override
  public void payTaxes(){
    System.out.printf("%s paid taxes of %,.2f%n", getName(), salary * SALARIED_TAX_RATE);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("%s, salary=%,.2f", super.toString(), salary);
  }
}
