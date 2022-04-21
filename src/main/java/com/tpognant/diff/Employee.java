package com.tpognant.diff;

import java.util.List;

public class Employee {

  private String firstname;
  private String lastName;
  private List<String> skills;
  private int experience;
  private Unit unit;

  public Employee(String firstname, String lastName, List<String> skills, int experience,
      Unit unit) {
    this.firstname = firstname;
    this.lastName = lastName;
    this.skills = skills;
    this.experience = experience;
    this.unit = unit;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastName() {
    return lastName;
  }

  public List<String> getSkills() {
    return skills;
  }

  public int getExperience() {
    return experience;
  }

  public Unit getUnit() {
    return unit;
  }

  public enum Unit {
    A, B, C
  }

  @Override
  public String toString() {
    return "Employee{" +
        "firstname='" + firstname + '\'' +
        ", lastName='" + lastName + '\'' +
        ", skills=" + skills +
        ", experience=" + experience +
        ", unit=" + unit +
        '}';
  }
}
