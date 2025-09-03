package exercise;

final class EmployeeCSVAdapter implements Employee {
  private final EmployeeCSV adaptee;

  EmployeeCSVAdapter(EmployeeCSV adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public String getId() {
    return adaptee.tokens()[0];
  }

  @Override
  public String getFirstName() {
    return adaptee.tokens()[1];
  }

  @Override
  public String getLastName() {
    return adaptee.tokens()[2];
  }

  @Override
  public String getEmail() {
    return adaptee.tokens()[3];
  }
}


