package com.ibm.wude.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	 * 查询员工信息
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/getEmpByName/{name}")
	public EmployeeModel getEmployeeModelByName(@PathVariable("name") String name) {
		return employeeService.getEmployeeByName(name);
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
		EmployeeModel emp = new EmployeeModel();
		emp.setId(id);
		if (getEmployeeModelById(id) != null) {
			return employeeService.deleteEmployeeById(id);
		} else {
			return false;
		}

	}

	/**
	 * 更新员工信息
	 * 
	 * @param employeeModel
	 * @return
	 */
	// @PutMapping("/updateEmpById")
	@GetMapping("/updateEmp")
	public boolean updateEmployee(@Param("id") Integer id, @Param("name") String name, @Param("salary") String salary,
			@Param("age") Integer age) {
		EmployeeModel emp = new EmployeeModel();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAge(age);
		if (getEmployeeModelById(id) != null) {
			return employeeService.updateEmployee(emp);
		} else {
			return false;
		}
	}
}
