package singleresponsability.nook;

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

  // Database persistence logic
  public void saveToDatabase() {
    // Code to save employee details to the database
  }

  public void retrieveFromDatabase(int employeeId) {
    // Code to retrieve employee details from the database
  }
}
