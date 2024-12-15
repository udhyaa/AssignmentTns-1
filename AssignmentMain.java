package com.udhayaa.assignmentmain;
import com.udhayaa.assignmentmain.Manager;
import com.udhayaa.assignmentmain.Developer;
import com.udhayaa.assignmentmain.EmployeeUtilities;
public class AssignmentMain {
public static void main(String[] args) {
Manager manager = new Manager("John", 101, 90000, "Sales");
Developer developer = new Developer("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
