package com.ibm.wude.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ibm.wude.model.EmployeeModel;

@Mapper
public interface EmployeeMapper {

	public int addEmploy(EmployeeModel employee);

	public boolean deleteEmployeeById(Integer id);

	public boolean updateEmployee(EmployeeModel employeeModel);

	public EmployeeModel getEmployeeModelById(Integer username);

	public List<EmployeeModel> getAllEmployee();

}
