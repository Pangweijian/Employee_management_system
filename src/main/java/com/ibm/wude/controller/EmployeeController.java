package com.ibm.wude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.wude.model.EmployeeModel;
import com.ibm.wude.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAllEmployee")
	public List<EmployeeModel> getAllEmployee(){
		List<EmployeeModel> list = employeeService.getAllEmployee();
		return list;
	}
	
	//@GetMapping("/addEmploy")
	@PostMapping("/addEmploy")
	public int addEmploy(@RequestBody EmployeeModel employee) {
		return employeeService.addEmploy(employee);
	}
}
