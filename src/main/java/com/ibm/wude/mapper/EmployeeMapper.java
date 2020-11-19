package com.ibm.wude.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ibm.wude.model.EmployeeModel;

@Mapper
public interface EmployeeMapper {

	public int addEmploy(EmployeeModel employee);
	
	public int deleteEmployeeById(int id);
	public int updateEmployeeById(int id);
	public EmployeeModel getEmployeeModelById();
	
	public List<EmployeeModel> getAllEmployee();
	
	
}
