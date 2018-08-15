package org.hrong.client_employee.service.impl;

import org.hrong.client_employee.dao.EmployeeDao;
import org.hrong.client_employee.pojo.Employee;
import org.hrong.client_employee.service.IEmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeSerivce {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee res = employeeDao.save(employee);
		return res;
	}
}
