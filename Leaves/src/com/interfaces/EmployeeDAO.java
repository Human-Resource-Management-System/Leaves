package com.interfaces;

import java.util.List;

import com.models.Employee;

public interface EmployeeDAO {
	List<Employee> getEmployeesByHRAndManager(int employeeId);
	
	Employee getEmployee(int employeeId);
}