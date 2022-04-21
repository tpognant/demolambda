package com.tpognant.diff.strategypattern;

import com.tpognant.diff.Employee;
import com.tpognant.diff.EmployeeFilter;

public class EmployeeFilterBySkillsJava implements EmployeeFilter {

  @Override
  public boolean filterEmployee(Employee employee) {
    return employee.getSkills().contains("JAVA");
  }
}
