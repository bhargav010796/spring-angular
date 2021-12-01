package com.ab.bh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.bh.model.Employee;
import com.ab.bh.service.EmployeeService;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		
		return employeeService.getEmployees();
	}

}
