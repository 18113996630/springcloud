package org.hrong.client_employee.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@ToString
public class Dept implements Serializable {
	private static final long serialVersionUID = 2213036707736131048L;
	private Long id;
	private String deptName;
	private Integer amount;
}
