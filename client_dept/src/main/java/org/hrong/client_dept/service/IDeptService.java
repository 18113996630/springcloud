package org.hrong.client_dept.service;

import org.hrong.client_dept.pojo.Dept;

public interface IDeptService {
	Dept saveDept(Dept data);

	Dept udpateDept(Dept data);

	Dept fingDeptById(Long id);
}
