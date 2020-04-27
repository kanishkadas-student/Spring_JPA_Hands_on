package com.cognizant.ormlearn.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.Repository.EmployeeRepository;
import com.cognizant.ormlearn.model.Employee;

@Service
public class EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	private static Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	@Transactional
	public Employee get(int empId) {
		LOGGER.info("Strat");
		return employeeRepository.findById(empId).get();
	}
	
	@Transactional
	public void save(Employee employee) {
	LOGGER.info("Start");
	employeeRepository.save(employee);
	LOGGER.info("End");
	}
	
	@Transactional
	public void updateEmployee(Employee employee) {
		LOGGER.info("Start");
		Employee employee2 = employeeRepository.findById(employee.getId()).get();
		employeeRepository.save(employee2);
		LOGGER.info("End");
	}
	
	@Transactional
	public List<Employee> getAllPermanentEmployees() {
		return employeeRepository.getAllPermanentEmployees();
	}
	
	@Transactional
	public double getAvgSalary() {
		return employeeRepository.getAverageSalary();
	}
	
	@Transactional
	public double getAvgSalary(int id) {
		return employeeRepository.getAverageSalary(id);
	}
	
	public List<Employee> getAllEmployeesNative(){
		return employeeRepository.getAllEmployeesNative();
	}
	
}
