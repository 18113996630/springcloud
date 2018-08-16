package org.hrong.client_dept.pojo;

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
@Table(name = "dept")
@Getter
@Setter
@ToString
public class Dept implements Serializable {
	private static final long serialVersionUID = 747417650345774402L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "deptName",length = 20)
	private String deptName;
	@Column(name = "amount",length = 10)
	private Integer amount;
}
