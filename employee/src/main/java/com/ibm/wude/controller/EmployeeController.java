package com.ibm.wude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	 * @return 处理状态
	 */
	@DeleteMapping("/delEmpById/{id}")
	public Integer deleteEmployeeById(@PathVariable("id") Integer id) {
		employeeService.deleteEmployeeById(id);
		return id;
	}

	/**
	 * 更新员工信息
	 * 
	 * @param id
	 * @param name
	 * @param salary
	 * @param age
	 * @return
	 */
	@PutMapping("/updateEmpById/{id}/{name}/{salary}/{age}")
	public Integer updateEmployeeById(@PathVariable("id") Integer id, @PathVariable("name") String name,
			@PathVariable("salary") Double salary, @PathVariable("age") Integer age) {
		employeeService.updateEmployeeById(id, name, salary, age);
		return id;
	}
}
