package org.hrong.client_employee.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hrong.client_employee.feign.DeptFeign;
import org.hrong.client_employee.pojo.Employee;
import org.hrong.client_employee.service.IEmployeeSerivce;
import org.hrong.client_employee.vo.Dept;
import org.hrong.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("职员controller")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeSerivce employeeSerivceImpl;
	@Autowired
	private DeptFeign deptFeign;

	@ApiOperation(value = "添加企业成员")
	@PostMapping("/")
	public Object saveEmployee(@RequestBody Employee employee){
		Employee res = employeeSerivceImpl.saveEmployee(employee);
		Dept deptVo = deptFeign.findDeptById(res.getDeptId());
		Assert.notNull(deptVo,"查询结果为空");
		deptVo.setAmount(deptVo.getAmount()+1);
		Dept resultVo = deptFeign.updateDept(deptVo);
		return ResultVo.success(resultVo);
	}

}
