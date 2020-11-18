package com.ibm.wude.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ibm.wude.model.EmployeeModel;

@Mapper
public interface EmployeeMapper {

	public int addEmploy(EmployeeModel employee);

	public int deleteEmployeeById(Integer id);

	public int updateEmployeeById(Integer id);

	public EmployeeModel getEmployeeModelById(Integer id);

	public List<EmployeeModel> getAllEmployee();

}
