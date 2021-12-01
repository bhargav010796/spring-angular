package com.ab.bh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ab.bh.model.Employee;
import com.ab.bh.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

}
