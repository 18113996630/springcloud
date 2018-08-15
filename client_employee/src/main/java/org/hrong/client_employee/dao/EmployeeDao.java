package org.hrong.client_employee.dao;

import org.hrong.client_employee.pojo.Employee;
import org.hrong.common.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeDao extends BaseRepository<Employee,Long> {
}
