package com.tpognant.fi.predicate;


import static com.tpognant.diff.Common.initData;

import com.tpognant.diff.Employee;
import com.tpognant.diff.Employee.Unit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicateFilter {

  public static void main(String[] args) {

    List<Employee> employees = initData();

    //Filter by unit
    List<Employee> employeesOfUnitA = filterEmployeeBy(employees,
        employee -> employee.getUnit() == Unit.A);
    employeesOfUnitA.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by skill java
    List<Employee> employeesJava = filterEmployeeBy(employees,
        employee -> employee.getSkills().contains("JAVA"));
    employeesJava.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by experience
    List<Employee> employeesSenior = filterEmployeeBy(employees,
        employee -> employee.getExperience() > 5);
    employeesSenior.forEach(System.out::println);
  }

  public static List<Employee> filterEmployeeBy(List<Employee> employees,
      Predicate<Employee> employeeFilter) {
    List<Employee> filteredEmployee = new ArrayList<>();

    for (Employee employee : employees) {
      if (employeeFilter.test(employee)) {
        filteredEmployee.add(employee);
      }
    }

    return filteredEmployee;
  }
}
