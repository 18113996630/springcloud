package org.hrong.client_employee.feign;

import org.hrong.client_employee.vo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "${feign.dept.name}")
public interface DeptFeign {

	@GetMapping(value = "/dept/{id}")
	Dept findDeptById(@PathVariable(value = "id") Long id);

	@PutMapping("/dept/")
	Dept updateDept(@RequestBody Dept dept);
}
