package singleresponsability.ok;

public class Employee {
  private String name;
  private int employeeId;

  // Employee details management
  public void setName(String name) {
    this.name = name;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
}
