package com.tpognant.diff.lambda;

import static com.tpognant.diff.Common.filterEmployeeBy;
import static com.tpognant.diff.Common.initData;

import com.tpognant.diff.Employee;
import com.tpognant.diff.Employee.Unit;
import java.util.ArrayList;
import java.util.List;

public class MainLambdaFilter {

  public static void main(String[] args) {

    List<Employee> employees = initData();

    //Filter by unit
    List<Employee> employeesOfUnitA = filterEmployeeBy(employees, employee -> employee.getUnit() == Unit.A);
    employeesOfUnitA.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by skill java
    List<Employee> employeesJava = filterEmployeeBy(employees, employee -> employee.getSkills().contains("JAVA"));
    employeesJava.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by experience
    List<Employee> employeesSenior = filterEmployeeBy(employees, employee -> employee.getExperience() > 5);
    employeesSenior.forEach(System.out::println);
  }

}
