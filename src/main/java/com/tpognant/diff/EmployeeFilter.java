package com.tpognant.diff;

//Annotation for telling at developpers that this interface have one and only one method
@FunctionalInterface
public interface EmployeeFilter {

  boolean filterEmployee(Employee employee);

}
