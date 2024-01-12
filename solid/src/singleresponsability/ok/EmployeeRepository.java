package singleresponsability.ok;

public class EmployeeRepository {
  public void saveToDatabase(Employee employee) {
    // Code to save employee details to the database
  }

  public Employee retrieveFromDatabase(int employeeId) {
    // Code to retrieve employee details from the database
    // Return the retrieved employee object
    return new Employee();
  }
}
