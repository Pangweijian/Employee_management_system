package com.ibm.wude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public EmployeeModel getEmployeeModelById(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeById(id);
	}

	/**
	 * 删除员工信息
	 * 
	 * @param id
	 * @return
	 */
	// @DeleteMapping("/delEmpById/{id}")
	@GetMapping("/delEmpById/{id}")
	public boolean deleteEmployeeById(@PathVariable("id") Integer id) {
		System.out.println("id:" + id);
		return employeeService.deleteEmployeeById(id);
	}

	/**
	 * 更新员工信息
	 * 
	 * @param employeeModel
	 * @return
	 */
	// @PutMapping("/updateEmpById")
	@GetMapping("/updateEmp")
	public boolean updateEmployee(@RequestBody EmployeeModel employeeModel) {
		return employeeService.updateEmployee(employeeModel);
	}
}
