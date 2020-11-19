package com.ibm.wude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.wude.mapper.EmployeeMapper;
import com.ibm.wude.model.EmployeeModel;

@Service
public class EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	public int addEmploy(EmployeeModel employee) {
		return employeeMapper.addEmploy(employee);
	}

	public List<EmployeeModel> getAllEmployee() {
		return employeeMapper.getAllEmployee();
	}

	public EmployeeModel getEmployeeById(Integer id) {
		return employeeMapper.getEmployeeModelById(id);
	}

	public EmployeeModel getEmployeeByName(String name) {
		return employeeMapper.getEmployeeModelByName(name);
	}

	public boolean deleteEmployeeById(Integer id) {
		return employeeMapper.deleteEmployeeById(id);
	}

	public boolean updateEmployee(EmployeeModel employeeModel) {
		return employeeMapper.updateEmployee(employeeModel);
	}
}
