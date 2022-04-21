package com.tpognant.diff;

import com.tpognant.diff.Employee.Unit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Common {

  public static List<Employee> initData() {
    List<Employee> employees = new ArrayList<>();

    employees.add(new Employee("Thomas", "Pognant", Collections.singletonList("JAVA"), 11, Unit.A));

    employees.add(new Employee("Ninon", "Pognant", Collections.singletonList("Python"), 1, Unit.B));

    employees.add(new Employee("John", "Doe", Collections.singletonList("JAVA"), 3, Unit.A));

    employees.add(new Employee("Will", "Smith", Collections.singletonList("C++"), 6, Unit.C));

    employees.add(new Employee("Sue", "Lee", Collections.singletonList(".Net"), 9, Unit.B));

    return employees;
  }

  public static List<Employee> filterEmployeeBy(List<Employee> employees, EmployeeFilter employeeFilter) {
    List<Employee> filteredEmployee = new ArrayList<>();

    for (Employee employee : employees) {
      if(employeeFilter.filterEmployee(employee)) {
        filteredEmployee.add(employee);
      }
    }

    return filteredEmployee;
  }

}
