package com.tpognant.diff.strategypattern;

import com.tpognant.diff.Employee;
import com.tpognant.diff.Employee.Unit;
import com.tpognant.diff.EmployeeFilter;

public class EmployeeFilterByUnitA implements EmployeeFilter {

  @Override
  public boolean filterEmployee(Employee employee) {
    return employee.getUnit() == Unit.A;
  }
}
