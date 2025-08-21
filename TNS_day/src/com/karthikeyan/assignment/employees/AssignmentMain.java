package com.karthikeyan.assignment.employees;
import com.karthikeyan.assignment.employees.*;
import com.karthikeyan.assignment.untilites.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String []args) {
		Manager manager = new Manager();
		manager.setName("Akash");
		manager.setEmployeeId(001);
		manager.setSalary(80000);
		manager.setTeamSize(5);
		
		Developer developer =new Developer();
		developer.setName("Muthu");
		developer.setEmployeeId(002);
		developer.setSalary(90000);
		developer.setProgrammingLanguage("Java");
		
		EmployeeUtilities utilities=new EmployeeUtilities();
		utilities.printEmployeeDeatils(manager);
		utilities.printEmployeeDeatils(developer);
	}

}
