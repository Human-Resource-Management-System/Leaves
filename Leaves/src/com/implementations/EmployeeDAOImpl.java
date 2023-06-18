package com.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.interfaces.EmployeeDAO;
import com.models.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Employee> getEmployeesByHRAndManager(int employeeId) {
		String query = "SELECT e FROM Employee e " +
                "WHERE e.emplHrEmplId = :employeeId OR e.emplRmanagerEmplId = :employeeId";
		
        return entityManager.createQuery(query, Employee.class)
                .setParameter("employeeId", employeeId)
                .getResultList();
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	
}