package com.ibm.wude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.wude.model.EmployeeModel;
import com.ibm.wude.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getAllEmployee")
	public List<EmployeeModel> getAllEmployee() {
		List<EmployeeModel> list = employeeService.getAllEmployee();
		return list;
	}

	/**
	 * 查询员工信息
	 * 
	 * @param id
	 * @return 查询结果
	 */
	@GetMapping("/getEmpById/{id}")
	public EmployeeModel getEmployeeModelById(Integer id) {
		return employeeService.getEmployeeById(id);
	}
}
