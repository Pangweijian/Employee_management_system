package com.ibm.wude.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ibm.wude.model.EmployeeModel;

@Mapper
public interface EmployeeMapper {

	public int addEmploy(EmployeeModel employee);

	public Integer deleteEmployeeById(Integer id);

	public Integer updateEmployeeById(Integer id, String name, double salary, Integer age);

	public EmployeeModel getEmployeeModelById(Integer id);

	public List<EmployeeModel> getAllEmployee();

}
