package org.hrong.client_employee.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
public class Employee implements Serializable {
	private static final long serialVersionUID = 747417650345774402L;

	@Id
	@Column(name = "id",length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name",length = 20)
	private String name;
	@Column(name = "gender",length = 4)
	private String gender;
	@Column(name = "age",length = 4)
	private Integer age;
	@Column(name = "deptId",length = 10)
	private Long deptId;
}
