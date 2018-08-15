package org.hrong.client_dept.controller;

import org.hrong.client_dept.pojo.Dept;
import org.hrong.client_dept.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {

	@Autowired
	private IDeptService deptServiceImpl;

	@PutMapping(value = "/")
	public Object updateDept(@RequestBody Dept dept){
		Object o = deptServiceImpl.udpateDept(dept);
		return o;
	}

	@GetMapping(value = "/{id}")
	public Object findDeptById(@PathVariable(value = "id") Long id) {
		return deptServiceImpl.fingDeptById(id);
	}
}
