package com.tpognant.diff.strategypattern;

import static com.tpognant.diff.Common.filterEmployeeBy;
import static com.tpognant.diff.Common.initData;

import com.tpognant.diff.Employee;
import java.util.List;

public class MainStrategyFilter {

  public static void main(String[] args) {

    List<Employee> employees = initData();

    //Filter by unit
    List<Employee> employeesOfUnitA = filterEmployeeBy(employees, new EmployeeFilterByUnitA());
    employeesOfUnitA.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by skill java
    List<Employee> employeesJava = filterEmployeeBy(employees, new EmployeeFilterBySkillsJava());
    employeesJava.forEach(System.out::println);

    System.out.println("----------------");

    //Filter by experience
    List<Employee> employeesSenior = filterEmployeeBy(employees, new EmployeeFilterByExperienceSenior());
    employeesSenior.forEach(System.out::println);
  }

}
