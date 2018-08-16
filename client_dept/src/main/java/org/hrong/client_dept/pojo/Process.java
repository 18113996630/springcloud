package org.hrong.client_dept.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@ApiModel(value = "事件接收处理模型")
@Setter
@Getter
@ToString
@Entity
@Table(name = "Process")
public class Process implements Serializable {

	private static final long serialVersionUID = 8561053229161924604L;
	@Id
	@Column(name = "id",length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "eventName",length = 20)
	private String eventName;
	@Column(name = "createTime")
	private Timestamp createTime;
	@Column(name = "status",length = 1)
	private Integer status;
	@Column(name = "finishTime")
	private Timestamp finishTime;
}
