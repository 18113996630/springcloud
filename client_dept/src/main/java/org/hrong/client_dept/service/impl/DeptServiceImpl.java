package org.hrong.client_dept.service.impl;

import org.hrong.client_dept.dao.DeptRepository;
import org.hrong.client_dept.pojo.Dept;
import org.hrong.client_dept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private DeptRepository deptRepository;

	@Override
	public Dept saveDept(Dept data) {
		Dept res = deptRepository.save(data);
		return res;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Dept udpateDept(Dept data){
		Dept res = deptRepository.saveAndFlush(data);
		return  res;
	}

	@Override
	public Dept fingDeptById(Long id) {
		Optional<Dept> dept = deptRepository.findById(id);
		return dept.get();
	}


}
