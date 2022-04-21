package com.tpognant.diff.anonymous;

import static com.tpognant.diff.Common.filterEmployeeBy;
import static com.tpognant.diff.Common.initData;

import com.tpognant.diff.Employee;
import com.tpognant.diff.Employee.Unit;
import com.tpognant.diff.EmployeeFilter;
import java.util.ArrayList;
import java.util.List;

public class MainAnonymousFilter {

  public static void main(String[] args) {

    List<Employee> employees = initData();

    //Filter by unit
    List<Employee> employeesOfUnitA = filterEmployeeBy(employees, new EmployeeFilter() {
      @Override
      public boolean filterEmployee(Employee employee) {
        return employee.getUnit() == Unit.A;
      }
    });
    employeesOfUnitA.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by skill java
    List<Employee> employeesJava = filterEmployeeBy(employees, new EmployeeFilter() {
      @Override
      public boolean filterEmployee(Employee employee) {
        return employee.getSkills().contains("JAVA");
      }
    });
    employeesJava.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by experience
    List<Employee> employeesSenior = filterEmployeeBy(employees, new EmployeeFilter() {
      @Override
      public boolean filterEmployee(Employee employee) {
        return employee.getExperience() > 5;
      }
    });
    employeesSenior.forEach(System.out::println);
  }

}
