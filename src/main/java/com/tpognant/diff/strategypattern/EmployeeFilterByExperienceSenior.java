package com.tpognant.diff.strategypattern;

import com.tpognant.diff.Employee;
import com.tpognant.diff.EmployeeFilter;

public class EmployeeFilterByExperienceSenior implements EmployeeFilter {

  @Override
  public boolean filterEmployee(Employee employee) {
    return employee.getExperience() > 5;
  }
}
