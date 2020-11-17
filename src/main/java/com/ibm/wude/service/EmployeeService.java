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
	
	public List<EmployeeModel> getAllEmployee(){
		return employeeMapper.getAllEmployee();
	}
}
